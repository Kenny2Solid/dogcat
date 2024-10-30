// Cat class
public class Cat {
    // Fields
    public String name;
    private String color;
    protected int age;
    public static String species = "Feline";

    // Constructor with parameters
    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    // Default constructor
    public Cat() {
        this.name = "Unknown";
        this.color = "Unknown";
        this.age = 0;
    }

    // Public method to get the color
    public String getColor() {
        return color;
    }

    // Protected method to display animal info
    protected void displayAnimalInfo() {
        System.out.println("Name: " + name + ", Color: " + color + ", Age: " + age);
    }

    // Static method to display species
    public static void displaySpecies() {
        System.out.println("All cats are of species: " + species);
    }
}
