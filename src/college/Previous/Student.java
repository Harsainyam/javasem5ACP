package college.Previous;
public class  Student {

    String name;
    int rollNo;


    public Student(String studentName, int studentRollNo) {
        name = studentName;
        rollNo = studentRollNo;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }


    public void updateName(String newName) {
        name = newName;
    }


    public static void main(String[] args) {
        // Creating an object of Student (calls constructor)
        Student s1 = new Student("Jaskaran", 101);


        s1.displayInfo();


        s1.updateName("Jaskaran Guru");


        System.out.println("After updating name:");
        s1.displayInfo();
    }
}
