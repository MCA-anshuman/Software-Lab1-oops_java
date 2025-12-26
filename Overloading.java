//Write a java program for Method overloading and Constructor overloading

public class Overloading
{
    // Method Overloading     // Add two integers
    public int add(int a, int b)
    {
        return a + b;
    }
    // Add two doubles
    public double add(double a, double b)
    {
        return a + b;
    }
    // Add three integers
    public int add(int a, int b, int c)
    {
        return a + b + c;
    }
    // Constructor Overloading
    private String name;
    private int age;
    // Default constructor
    public Overloading()
    {
        this.name = "Unknown";
        this.age = 0;
    }
    // Constructor with one parameter (name)
    public Overloading(String name)
    {
        this.name = name;
        this.age = 0;
    }
    // Constructor with two parameters (name, age)
    public Overloading(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    // Method to display the details
    public void displayDetails()
    {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    public static void main(String[] args)
    {
        // Creating objects using different constructors (Constructor Overloading)
        Overloading person1 = new Overloading();  // Default constructor
        Overloading person2 = new Overloading("Alice");  // Constructor with name
        Overloading person3 = new Overloading("Bob", 25);  // Constructor with name and age
        // Displaying details using overloaded constructors
        person1.displayDetails();  // Name: Unknown,Age: 0;
        person2.displayDetails();  // Name: Alice, Age: 0;
        person3.displayDetails();  // Name: Bob, Age: 25;
        // Demonstrating Method Overloading
        Overloading obj = new Overloading();
        System.out.println("Add two integers: " + obj.add(10, 20));  // Output: 30
        System.out.println("Add two doubles: " + obj.add(10.5, 20.5));  // Output: 31.0
        System.out.println("Add three integers: " + obj.add(10, 20, 30));  // Output: 60
    }
}
