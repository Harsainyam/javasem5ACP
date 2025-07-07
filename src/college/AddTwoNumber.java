package college;

interface AddOperation {
    int add(int a, int b);
}

public class AddTwoNumber {
    public static void main(String[] args) {

        // Lambda expression to add two numbers
        AddOperation addition = (a, b) -> a + b;

        // Test the lambda
        int result = addition.add(10, 5);
        System.out.println("Sum: " + result);
    }
}
