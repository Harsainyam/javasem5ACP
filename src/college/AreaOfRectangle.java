package college;

public class AreaOfRectangle {

    public static void main(String[] args) {
        int length = -5;
        int breadth = 10;

        if (length < 0) {
            throw new IllegalArgumentException("Length cannot be negative!");
        }

        int area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }
}
