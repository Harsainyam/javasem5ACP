package college.NightJuly;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Create an Optional with a value
        Optional<String> optionalName = Optional.of("Jaskaran");

        // Print the value if present
        optionalName.ifPresent(name -> System.out.println("Name is: " + name));

        // Create an empty Optional
        Optional<String> emptyOptional = Optional.empty();

        // Use orElse to provide a default value if not present
        String defaultName = emptyOptional.orElse("No Name Found");
        System.out.println("Default Name: " + defaultName);

        // Another example using ofNullable
        String str = null;
        Optional<String> maybeStr = Optional.ofNullable(str);

        System.out.println("Result: " + maybeStr.orElse("Value was null"));


    }
}
