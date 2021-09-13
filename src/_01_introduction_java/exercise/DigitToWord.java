package _01_introduction_java.exercise;
    import java.util.*;

public class DigitToWord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MINIMUM = 0, MAXIMUM = 999;
        System.out.printf("Enter a number between %d and %d: ", MINIMUM, MAXIMUM);
        int number = input.nextInt();
        if (number > MAXIMUM) {
            System.out.println("The number entered is too large!\n");
            System.exit(1);
        }
        if (number == 0) {
            System.out.println("Zero\n");
            System.exit(1);
        }
        if (number < MINIMUM ) {
            System.out.println("The number entered is invalid!\n");
            System.exit(1);
        }
        if (number / 100 != 0) {
            switch (number / 100) {
                case 1:
                    System.out.println("one hundred and ");
                    break;
                case 2:
                    System.out.println("two hundred and ");
                    break;
                case 3:
                    System.out.println("three hundred and ");
                    break;
                case 4:
                    System.out.println("four hundred and ");
                    break;
                case 5:
                    System.out.println("five hundred and ");
                    break;
                case 6:
                    System.out.println("six hundred and ");
                    break;
                case 7:
                    System.out.println("seven hundred and ");
                    break;
                case 8:
                    System.out.println("eight hundred and ");
                    break;
                case 9:
                    System.out.println("nine hundred and ");
                    break;
                default:
                    System.out.println("Something wrong!");
                    System.exit(1);
            }
        }
            if (number / 10 != 0) {
                switch (number % 10) {
                    case 1:
                        switch (number % 10) {
                            case 0:
                                System.out.println("ten");
                                break;
                            case 1:
                                System.out.println("eleven");
                                break;
                            case 2:
                                System.out.println("twelve");
                                break;
                            case 3:
                                System.out.println("thirteen");
                                break;
                            case 4:
                                System.out.println("fourteen");
                                break;
                            case 5:
                                System.out.println("fifteen");
                                break;
                            case 6:
                                System.out.println("sixteen");
                                break;
                            case 7:
                                System.out.println("seventeen");
                                break;
                            case 8:
                                System.out.println("eighteen");
                                break;
                            case 9:
                                System.out.println("nineteen");
                                break;
                            default:
                                System.out.println("Something wrong!");
                                System.exit(1);
                        }
                        System.exit(0);
                        break;
                    case 2:
                        System.out.println("twenty ");
                        break;
                    case 3:
                        System.out.println("thirty ");
                        break;
                    case 4:
                        System.out.println("forty ");
                        break;
                    case 5:
                        System.out.println("fifty ");
                        break;
                    case 6:
                        System.out.println("sixty ");
                        break;
                    case 7:
                        System.out.println("seventy ");
                        break;
                    case 8:
                        System.out.println("eighty ");
                        break;
                    case 9:
                        System.out.println("ninety ");
                        break;
                    default:
                        System.out.println("Something wrong!");
                        System.exit(1);
                }
                if (number % 10 != 0)
                    System.out.println(" ");
            }
            if (number % 10 != 0) {

                switch (number % 10) {
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;
                    default:
                        System.out.println("Something wrong!");
                        System.exit(1);
                }
            }

            System.out.println("\n");
            }
        }