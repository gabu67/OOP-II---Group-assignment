// Interface Segregation Principle Example
interface Eater {

    void eat();
}

interface Flyer {
    void fly();
}

interface Swimmer {
    void swim();
}

class Dog implements Eater, Swimmer {
    public void eat() {
        System.out.println("Dog eats.");
    }

    public void swim() {
        System.out.println("Dog swims.");
    }
}

class Bird implements Eater, Flyer {
    public void eat() {
        System.out.println("Bird eats.");
    }

    public void fly() {
        System.out.println("Bird flies.");
    }
}

public class InterfaceSegregationDemo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Bird bird = new Bird();

        System.out.println("Dog's behavior:");
        dog.eat();
        dog.swim();

        System.out.println("\nBird's behavior:");
        bird.eat();
        bird.fly();
    }
}

