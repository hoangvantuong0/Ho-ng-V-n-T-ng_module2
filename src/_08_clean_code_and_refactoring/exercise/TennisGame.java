package _08_clean_code_and_refactoring.exercise;

import org.jetbrains.annotations.NotNull;

public class TennisGame {
    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;

    public static String getScore(String player1, String player2, int score1, int score2) {
        String score = "";
        int tempScore = 0;
        if (score1 == score2) {
            switch (score1) {
                case LOVE:
                    score = "Love-All";
                    break;
                case FIFTEEN:
                    score = "Fifteen-All";
                    break;
                case THIRTY:
                    score = "Thirty-All";
                    break;
                case FORTY:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        } else if (score1 >= 4 || score2 >= 4) {
            int minusResult = score1 - score2;
            score = geAdvantage(minusResult);
        } else {
            score = getScore(score1) + "-" + getScore(score2);
        }
        return score;
    }

    @NotNull
    private static String geAdvantage(int minusResult) {
        String score;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    private static String getScore(int Score) {
        String result = "";
        switch (Score) {
            case LOVE:
                result += "Love";
                break;
            case FIFTEEN:
                result += "Fifteen";
                break;
            case THIRTY:
                result += "Thirty";
                break;
            case FORTY:
                result += "Forty";
                break;
            default:
                break;
        }
        return result;
    }

}