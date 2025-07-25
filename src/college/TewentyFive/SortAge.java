package college.TewentyFive;

import java.util.*;

class Student implements Comparable<Student> {
    int age;
    int marks;

    public Student(int age, int marks) {
        this.age = age;
        this.marks = marks;
    }

    // Compare based on age in ascending order
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }
}

public class SortAge{
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        // Add students with different ages and marks
        students.add(new Student(21, 88));
        students.add(new Student(19, 91));
        students.add(new Student(23, 76));

        // Sort the list based on age
        Collections.sort(students);

        // Print the ages in sorted order
        System.out.println("Ages in ascending order:");
        for(Student s : students) {
            System.out.println(s.age);
        }
    }
}
