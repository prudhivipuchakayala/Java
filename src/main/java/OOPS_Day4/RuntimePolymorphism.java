package OOPS_Day4;

// Parent class
class Animal {
    // Method to make sound
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class extending from Animal
class Dog extends Animal {
    // Override method to make sound specific to Dog
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        // Creating objects of Parent and Child classes
        Animal animal = new Animal();
        Dog dog = new Dog();

        // Demonstrate runtime polymorphism
        // Reference of type Animal, object of type Dog
        Animal animalDog = new Dog();

        // Calling overridden method
        // This will call the makeSound method of Dog class
        animalDog.makeSound();
    }
}
