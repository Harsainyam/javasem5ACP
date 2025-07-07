package college.Previous;

public class Main {

    public static void main(String[] args) {
        String str = "hello";

        try {
            char ch = str.charAt(10);
            System.out.println("Character: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        final int x = 100;

        System.out.println("x = " + x);
    }
}
