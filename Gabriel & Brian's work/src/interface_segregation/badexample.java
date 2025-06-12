// This is a poor example of interface segregation beecause the interface violates ISP by forcing all animals to implement all methods
interface Animal {
    void eat();

    void fly();

    void swim();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats.");
    }

    public void fly() {
        // Not applicable for dogs
        throw new UnsupportedOperationException("Dog can't fly");
    }

    public void swim() {
        System.out.println("Dog swims.");
    }
}