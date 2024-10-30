// Dog class
public class Dog {

    public String name;
    private  String breed;
    protected int age;
    public static String species = "Canine";


    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }


    public Dog() {
        this.name = "Unknown";
        this.breed = "Unknown";
        this.age = 0;
    }


    public String getBreed() {
        return breed;
    }


    protected void displayAnimalInfo() {
        System.out.println("Name: " + name + ", Breed: " + breed + ", Age: " + age);
    }


    public static void displaySpecies() {
        System.out.println("All dogs are of species: " + species);
    }
}














