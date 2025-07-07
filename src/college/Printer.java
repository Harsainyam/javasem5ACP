package college;

public class Printer {


    public void print(String message) {
        System.out.println("Printing string: " + message);
    }


    public void print(int a, int b) {
        System.out.println("Printing two integers: " + a + " and " + b);
    }


    public void print(double value) {
        System.out.println("Printing a double: " + value);
    }


    public void print(String message, int count) {
        System.out.println("Message: " + message + ", repeated " + count + " times");
    }


    public static void main(String[] args) {
        Printer p = new Printer();

        p.print("Hello");
        p.print(10, 20);
        p.print(3.14);
        p.print("Hi", 3);
    }
}
