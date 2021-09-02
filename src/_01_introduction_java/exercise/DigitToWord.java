package _01_introduction_java.exercise;
    import java.util.*;

public class DigitToWord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MINIMUM = 0, MAXIMUM = 999;
        System.out.printf("Enter a number between %d and %d: ", MINIMUM, MAXIMUM);
        int number = input.nextInt();
        if (number > MAXIMUM) {
            System.out.printf("The number entered is too large!\n");
            System.exit(1);
        }
        if (number == 0) {
            System.out.printf("Zero\n");
            System.exit(1);
        }
        if (number < MINIMUM ) {
            System.out.printf("The number entered is invalid!\n");
            System.exit(1);
        }
        if (number / 100 != 0) {
            switch (number / 100) {
                case 1:
                    System.out.printf("one hundred and ");
                    break;
                case 2:
                    System.out.printf("two hundred and ");
                    break;
                case 3:
                    System.out.printf("three hundred and ");
                    break;
                case 4:
                    System.out.printf("four hundred and ");
                    break;
                case 5:
                    System.out.printf("five hundred and ");
                    break;
                case 6:
                    System.out.printf("six hundred and ");
                    break;
                case 7:
                    System.out.printf("seven hundred and ");
                    break;
                case 8:
                    System.out.printf("eight hundred and ");
                    break;
                case 9:
                    System.out.printf("nine hundred and ");
                    break;
                default:
                    System.out.printf("Something wrong!");
                    System.exit(1);
            }
        }
            if (number / 10 != 0) {
                switch (number % 10) {
                    case 1:
                        switch (number % 10) {
                            case 0:
                                System.out.printf("ten");
                                break;
                            case 1:
                                System.out.printf("eleven");
                                break;
                            case 2:
                                System.out.printf("twelve");
                                break;
                            case 3:
                                System.out.printf("thirteen");
                                break;
                            case 4:
                                System.out.printf("fourteen");
                                break;
                            case 5:
                                System.out.printf("fifteen");
                                break;
                            case 6:
                                System.out.printf("sixteen");
                                break;
                            case 7:
                                System.out.printf("seventeen");
                                break;
                            case 8:
                                System.out.printf("eighteen");
                                break;
                            case 9:
                                System.out.printf("nineteen");
                                break;
                            default:
                                System.out.printf("Something wrong!");
                                System.exit(1);
                        }
                        System.exit(0);
                        break;
                    case 2:
                        System.out.printf("twenty ");
                        break;
                    case 3:
                        System.out.printf("thirty ");
                        break;
                    case 4:
                        System.out.printf("forty ");
                        break;
                    case 5:
                        System.out.printf("fifty ");
                        break;
                    case 6:
                        System.out.printf("sixty ");
                        break;
                    case 7:
                        System.out.printf("seventy ");
                        break;
                    case 8:
                        System.out.printf("eighty ");
                        break;
                    case 9:
                        System.out.printf("ninety ");
                        break;
                    default:
                        System.out.printf("Something wrong!");
                        System.exit(1);
                }
                if (number % 10 != 0)
                    System.out.printf(" ");
            }
            if (number % 10 != 0) {

                switch (number % 10) {
                    case 1:
                        System.out.printf("one");
                        break;
                    case 2:
                        System.out.printf("two");
                        break;
                    case 3:
                        System.out.printf("three");
                        break;
                    case 4:
                        System.out.printf("four");
                        break;
                    case 5:
                        System.out.printf("five");
                        break;
                    case 6:
                        System.out.printf("six");
                        break;
                    case 7:
                        System.out.printf("seven");
                        break;
                    case 8:
                        System.out.printf("eight");
                        break;
                    case 9:
                        System.out.printf("nine");
                        break;
                    default:
                        System.out.printf("Something wrong!");
                        System.exit(1);
                }
            }

            System.out.printf("\n");
            }
        }