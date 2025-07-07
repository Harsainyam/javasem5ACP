package college.SeventhJuly;
interface SquareOperation {
    int square(int x);
}

public class SquareOfANumber {
    public static void main(String[] args) {

        // Lambda expression to calculate square
        SquareOperation square = x -> x * x;

        // Test the lambda
        int result = square.square(7);
        System.out.println("Square: " + result);
    }
}