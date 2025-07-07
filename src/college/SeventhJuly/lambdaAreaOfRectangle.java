package college.SeventhJuly;

interface RectangleArea {
    int area(int length, int breadth);
}

public class lambdaAreaOfRectangle {
    public static void main(String[] args) {

        // Lambda expression to calculate area of a rectangle
        RectangleArea area = (length, breadth) -> length * breadth;

        // Test the lambda
        int result = area.area(10, 5);
        System.out.println("Area of Rectangle: " + result);
    }
}