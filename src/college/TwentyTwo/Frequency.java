package college.TwentyTwo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Input elements into the list
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            String element = sc.nextLine();
            list.add(element);
        }

        // Ask user for the element to find frequency
        System.out.print("Enter the element to find frequency: ");
        String target = sc.nextLine();

        // Use Collections.frequency()
        int frequency = Collections.frequency(list, target);

        System.out.println("Frequency of \"" + target + "\" is: " + frequency);
    }
}
