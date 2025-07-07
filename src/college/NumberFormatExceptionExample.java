package college;

public class NumberFormatExceptionExample {

    public static void main(String[] args) {
        String str = "abc";  // This is not a valid number

        try {
            int num = Integer.parseInt(str);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Invalid number format!");
        }

        System.out.println("Program continues after exception handling.");
    }
}
