//Write a java program to implement Interface using extends keyword. 

//Parent interface interfdace
interface Animal 
{
    void sound(); //abstract method for sound

}

//Child interface extends Animal
interface Mammal extends Animal 
{
    Void eat(); //Abstract method for eat
}

//Concrete class implementing the Mammal interface class
class Dog implements  Mammal 
{
    // Implementing the sound method from Animal interface 
    public void sound()
    {
        System.out.println("The dog barks.");

    }
    // Implementing the eat method form Mammal interface
    public Void eat() 
    {
        System.out.println("The dog eat food.");
        return null;
    }
}

public class InterfaceExample 
{
    public static void main(String[] args)
    {
        //Create an object of Dog class
        Mammal dog =new Dog();
        //Calling methods implemented by Dog class
        dog.sound(); //Output: The dog barks. 
        dog.eat(); //Output: The dog eat food.
    }
}