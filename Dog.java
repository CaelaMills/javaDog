public class Dog {
    // Properties
    private String name;
    private int age;
    private String color;
    private String breed;




    // Constructors
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }




    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }




    public Dog(String name, int age, String color, Breed breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = String.valueOf(breed);
    }




    // Methods
    public void woof() {
        System.out.println(name + " says: Woof!");
    }




    public void sleep() {
        System.out.println(name + " is sleeping.");
    }




    public void eat() {
        System.out.println(name + " is eating.");
    }




    // Getters and Setters
    public String getName() {
        return name;
    }




    public void setName(String name) {
        this.name = name;
    }




    public int getAge() {
        return age;
    }




    public void setAge(int age) {
        this.age = age;
    }




    public String getColor() {
        return color;
    }




    public void setColor(String color) {
        this.color = color;
    }




    public String getBreed(int i) {
        return breed;
    }




    public void setBreed(String breed) {
        this.breed = breed;
    }




    // Main method (for testing)
    public static void main(String[] args) {
        Dog myDog = new Dog("Snoopy", 1);
        myDog.woof();
        myDog.sleep();
        myDog.eat();




        System.out.println("Name: " + myDog.getName());
        System.out.println("Age: " + myDog.getAge());




        Dog myDog2 = new Dog("Spot", 2, "Brown");
        myDog2.woof();
        myDog2.sleep();
        myDog2.eat();




        System.out.println("Name: " + myDog2.getName());
        System.out.println("Age: " + myDog2.getAge());
        System.out.println("Color: " + myDog2.getColor());




        Dog myDog3 = new Dog("Wolf", 3, "Grey", Breed.ALASKAN);
        myDog3.woof();
        myDog3.sleep();
        myDog3.eat();




        System.out.println("Name: " + myDog3.getName());
        System.out.println("Age: " + myDog3.getAge());
        System.out.println("Color: " + myDog3.getColor());
        System.out.println("This dog's breed is: " + myDog3.getBreed(2));




    }
}

