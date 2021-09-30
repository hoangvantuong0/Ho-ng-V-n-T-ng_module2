package _11_dsa_stack_queue.practice;
import static _11_dsa_stack_queue.practice.MyGenericStack.stackOfIStrings;
import static _11_dsa_stack_queue.practice.MyGenericStack.stackOfIntegers;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}