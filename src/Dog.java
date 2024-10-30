// Dog class
public class Dog {

    public String name;
    private  String breed;
    protected int age;
    public static String species = "Canine";

    // Constructor with parameters
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    // Default constructor
    public Dog() {
        this.name = "Unknown";
        this.breed = "Unknown";
        this.age = 0;
    }

    // Public method to get the breed
    public String getBreed() {
        return breed;
    }

    // Protected method to display animal info
    protected void displayAnimalInfo() {
        System.out.println("Name: " + name + ", Breed: " + breed + ", Age: " + age);
    }

    // Static method to display species
    public static void displaySpecies() {
        System.out.println("All dogs are of species: " + species);
    }
}














