public class ReadNumber {

    private static String[] oneDigit =
            {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static String[] oneDigitWithTy =
            {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private static String[] oneDigitWithTeen =
            {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String SPACE = " ";

    public static String read(int number) {

        String result = "";
        int firstNumber = number / 100;
        int secondAndThirdNumber = number % 100;
        int secondNumber = secondAndThirdNumber / 10;
        int thirdNumber = secondAndThirdNumber % 10;

        if (firstNumber != 0) {
            result += oneDigit[firstNumber] + SPACE + "hundred";
        }

        result += SPACE;
        if (secondNumber /10 == 1 && secondNumber %10 !=0) {
            result += oneDigitWithTeen[thirdNumber];
        } else if (secondNumber /10 == 1 && secondNumber %10 ==0) {
            result += oneDigitWithTy[secondNumber];

        }else {
            result += oneDigitWithTy[secondNumber]
            + SPACE + oneDigit[thirdNumber];
        }

        return result.replaceAll(" {2}", " ").trim();
    }


    public static void main(String[] args) {
        System.out.println(ReadNumber.read(111));
    }
}