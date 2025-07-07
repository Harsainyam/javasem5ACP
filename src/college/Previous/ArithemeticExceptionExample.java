package college.Previous;
public class ArithemeticExceptionExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Cannot divide by zero!");
        }

        System.out.println("Program continues after exception handling.");
    }
}
