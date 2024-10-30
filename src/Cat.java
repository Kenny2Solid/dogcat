
public class Cat {

    public String name;
    private String color;
    protected int age;
    public static String species = "Feline";


    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }


    public Cat() {
        this.name = "Unknown";
        this.color = "Unknown";
        this.age = 0;
    }


    public String getColor() {
        return color;
    }


    protected void displayAnimalInfo() {
        System.out.println("Name: " + name + ", Color: " + color + ", Age: " + age);
    }


    public static void displaySpecies() {
        System.out.println("All cats are of species: " + species);
    }
}
