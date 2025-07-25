package college.EightJuly;
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class OverrideAnnotation {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound();  // Output: Dog barks
    }
}
