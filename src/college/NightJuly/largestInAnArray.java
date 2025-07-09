package college.NightJuly;

interface Compare {
    int getMax(int a, int b);
}

public class largestInAnArray{
    public static void main(String[] args) {
        int[] numbers = {12, 45, 3, 67, 23, 89, 34};

        // Lambda expression to get maximum of two numbers
        Compare maxFunction = (a, b) -> (a > b) ? a : b;

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            max = maxFunction.getMax(max, numbers[i]);
        }

        System.out.println("Largest number: " + max);
    }
}
