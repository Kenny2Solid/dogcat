
public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Max", "Labrador", 4);
        Dog dog2 = new Dog();


        Cat cat1 = new Cat("Mittens", "Black", 3);
        Cat cat2 = new Cat();


        System.out.println("Dog 1:");
        dog1.displayAnimalInfo();
        System.out.println("Dog 2:");
        dog2.displayAnimalInfo();


        System.out.println("Cat 1:");
        cat1.displayAnimalInfo();
        System.out.println("Cat 2:");
        cat2.displayAnimalInfo();


        Dog.displaySpecies();
        Cat.displaySpecies();
    }
}
