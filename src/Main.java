// Main class to test Dog and Cat
public class Main {
    public static void main(String[] args) {
        // Creating Dog objects
        Dog dog1 = new Dog("Max", "Labrador", 4);
        Dog dog2 = new Dog();

        // Creating Cat objects
        Cat cat1 = new Cat("Mittens", "Black", 3);
        Cat cat2 = new Cat();

        // Displaying info of dogs
        System.out.println("Dog 1:");
        dog1.displayAnimalInfo();
        System.out.println("Dog 2:");
        dog2.displayAnimalInfo();

        // Displaying info of cats
        System.out.println("Cat 1:");
        cat1.displayAnimalInfo();
        System.out.println("Cat 2:");
        cat2.displayAnimalInfo();

        // Displaying species of animals
        Dog.displaySpecies();
        Cat.displaySpecies();
    }
}
