package college;

public class car {
    String model;
    int year;


    public car() {
        model = "Unknown";
        year = 0;
    }


    public car(String modelName) {
        model = modelName;
        year = 2020;
    }


    public car(String modelName, int modelYear) {
        model = modelName;
        year = modelYear;
    }


    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);

    }


    public static void main(String[] args) {
        // Using Constructor 1
        car car1 = new car();
        car1.displayInfo();


        car car2 = new car("Honda City");
        car2.displayInfo();


        car car3 = new car("Toyota Fortuner", 2024);
        car3.displayInfo();
    }
}
