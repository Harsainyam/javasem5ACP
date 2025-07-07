package college;

public class ThrowExample {


    public static void main(String[] args) {
        String username = "";

        if (username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty!");
        }

        System.out.println("Username accepted: " + username);
    }
}
