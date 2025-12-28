//Write a java program to represent Abstract class with example. 

// Abstract class abstract 
abstract class Animal {

        // Abstract method (does not have a body) 
    public abstract void sound();

        // Regular method     
    public void sleep() { 
            System.out.println("This animal is sleeping."); 
    } 
}

// Subclass (inherited from Animal) 
class Dog extends Animal {

        // Providing implementation of the abstract method     
        public void sound() { 
            System.out.println("The dog barks."); 
    } 
}

// Subclass (inherited from Animal) 
class Cat extends Animal { 

    // Providing implementation of the abstract method     
    public void sound() { 
        System.out.println("The cat meows."); 
    } 
} 

public class AbstractClassExample {     
    public static void main(String[] args) { 

        // Creating objects of the subclasses         
        Animal dog = new Dog(); 
        Animal cat = new Cat(); 

        // Calling methods on dog and cat objects         
        dog.sound();  // Output: The dog barks.         
        dog.sleep();  // Output: This animal is sleeping.

        cat.sound();  // Output: The cat meows.         
        cat.sleep();  // Output: This animal is sleeping. 
    } 
} 
 