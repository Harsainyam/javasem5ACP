package college.SeventhJuly;

interface A {
    public abstract void display();
}
public class lambda {

    public static void main(String[] args) {

        A n = () -> {
            System.out.println("Hello");
        };
        n.display();
    }
}
