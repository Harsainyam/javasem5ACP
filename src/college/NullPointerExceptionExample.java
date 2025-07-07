package college;

public class NullPointerExceptionExample {

    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length();  // 🔥 This will throw NullPointerException
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Attempted to access method on null object.");
        }

        System.out.println("Program continues after exception handling.");
    }
}
