package college.EightJuly;

interface MaxFinder {
    int findMax(int a, int b);
}

public class LargestOfTwoNumber {
    public static void main(String[] args) {
        // Lambda expression using if-else instead of ternary
        MaxFinder max = (a, b) -> {
            if (a > b)
                return a;
            else
                return b;
        };

        // Example usage
        int num1 = 27;
        int num2 = 14;

        System.out.println("Largest number is: " + max.findMax(num1, num2));
    }
}
