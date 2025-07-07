
package college.SeventhJuly;

class EvenOddChecker implements Runnable {
    int number;

    // Constructor to initialize the number
    EvenOddChecker(int number) {
        this.number = number;
    }

    // Override run() method
    public void run() {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        int number = 10;  // You can change this value

        // Create an object of the class that implements Runnable
        EvenOddChecker checker = new EvenOddChecker(number);

        // Call run() method directly (not starting a thread)
        checker.run();  // NOT: new Thread(checker).start()
    }
}
