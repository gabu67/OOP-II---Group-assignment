// Interface Segregation Principle Example

// Separate interfaces for specific capabilities
interface Eater {
    void eat();
}

interface Flyer {
    void fly();
}

interface Swimmer {
    void swim();
}

// Dog only eats and swims
class Dog implements Eater, Swimmer {
    public void eat() {
        System.out.println("Dog eats.");
    }

    public void swim() {
        System.out.println("Dog swims.");
    }
}

// Bird eats and flies
class Bird implements Eater, Flyer {
    public void eat() {
        System.out.println("Bird eats.");
    }

    public void fly() {
        System.out.println("Bird flies.");
    }
}

// Main class to run the example
public class InterfaceSegregationDemo {
    public static void main(String[] args) {
        // Create objects
        Dog dog = new Dog();
        Bird bird = new Bird();

        // Call appropriate methods
        System.out.println("Dog's behavior:");
        dog.eat();
        dog.swim();

        System.out.println("\nBird's behavior:");
        bird.eat();
        bird.fly();
    }
}
