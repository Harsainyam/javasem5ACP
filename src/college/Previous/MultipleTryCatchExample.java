package college.Previous;

public class MultipleTryCatchExample {

    public static void main(String[] args) {

        // First try-catch block
        try {
            int a = 10 / 0;  // 🔥 ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Cannot divide by zero.");
        }

        // Second try-catch block
        try {
            String str = null;
            System.out.println(str.length());  // 🔥 NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Null string accessed.");
        }

        // Third try-catch block
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);  // 🔥 ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index out of bounds.");
        }

        System.out.println("Program continues after all exceptions.");
    }
}