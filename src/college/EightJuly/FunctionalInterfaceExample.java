package college.EightJuly;

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);  // Only one abstract method allowed
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {

        // Lambda expressions implementing the Calculator interface
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;
        Calculator divide = (a, b) -> (b != 0) ? a / b : 0;

        // Using the lambda implementations
        System.out.println("Addition: " + add.operate(10, 5));
        System.out.println("Subtraction: " + subtract.operate(10, 5));
        System.out.println("Multiplication: " + multiply.operate(10, 5));
        System.out.println("Division: " + divide.operate(10, 5));
    }
}
