package college.EightJuly;
import java.util.stream.IntStream;

public class LambdaToPrintEachCharacterOfEachString {
    public static void main(String[] args) {
        String input = "Hello, World!";

        // Lambda expression to print each character of the string
        IntStream.range(0, input.length()) // stream of indexes 0 to length-1
                .forEach(i -> System.out.println(input.charAt(i)));
    }
}
