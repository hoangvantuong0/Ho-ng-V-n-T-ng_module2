package _19_string.exercise;

public class PhoneNumberTest {
    public static PhoneNumber phoneNumber;
    public static final String[] validPhoneNumber = {"(84)-(0978489648)"};
    public static final String[] invalidPhoneNumber = {"(A2)-(1241513m)"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String phoneNumber1 : validPhoneNumber){
            boolean isvalid = phoneNumber.validate(phoneNumber1);
            System.out.println("Phone number 1 " + phoneNumber1 + " is valid " + isvalid);
        }
        for (String phoneNumber2 : invalidPhoneNumber){
            boolean isvalid = phoneNumber.validate(phoneNumber2);
            System.out.println("Phone number 2 " + phoneNumber2 + " is valid " + isvalid);
        }
    }
}
