package college.Previous;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class UserdefinedException {

    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is below 18 – Not allowed!");
        } else {
            System.out.println("Welcome, your age is valid.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(19);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
