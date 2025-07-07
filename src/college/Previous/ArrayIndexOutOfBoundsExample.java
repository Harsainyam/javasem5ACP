package college.Previous;

public class ArrayIndexOutOfBoundsExample {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            System.out.println("Element at index 3: " + numbers[3]);  // 🔥 Invalid index (only 0 to 2 valid)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("Program continues after exception handling.");
    }
}
