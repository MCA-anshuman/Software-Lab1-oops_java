//Write a Java program that implements a multi-thread application that has three threads. 

// Implementing the Runnable interface for Thread 1 
class ThreadOne implements Runnable 
{     
    public void run() 
    {         
        for (int i = 1; i <= 5; i++) 
        { 
            System.out.println("Thread 1: " + i);             
            try { 
                Thread.sleep(1000);  // Simulate some work with a 1-second pause 
            } 
            catch (InterruptedException e) { 
                System.out.println(e); 
            } 
        } 
    } 
} 
// Implementing the Runnable interface for Thread 2 
class ThreadTwo implements Runnable 
{     
    public void run() 
    {         
        for (int i = 1; i <= 5; i++) 
        { 
            System.out.println("Thread 2: " + i);             
            try { 
                Thread.sleep(1000);  // Simulate some work with a 1-second pause 
            } 
            catch (InterruptedException e) { 
                System.out.println(e); 
            } 
        } 
    } 
} 
// Implementing the Runnable interface for Thread 3 
class ThreadThree implements Runnable 
{ 
    public void run() 
    {         
        for (int i = 1; i <= 5; i++) 
        { 
            System.out.println("Thread 3: " + i);             
            try { 
                Thread.sleep(1000);  // Simulate some work with a 1-second pause 
            } 
            catch (InterruptedException e) 
            { 
                System.out.println(e); 
            } 
        } 
    } 
} 
public class MultiThreadApplication 
{     
    public static void main(String[] args) 
    { 
        // Creating objects of the Runnable classes 
        ThreadOne threadOne = new ThreadOne(); 
        ThreadTwo threadTwo = new ThreadTwo(); 
        ThreadThree threadThree = new ThreadThree(); 
        // Creating thread objects and passing the Runnable objects to the threads 
        Thread t1 = new Thread(threadOne); 
        Thread t2 = new Thread(threadTwo); 
        Thread t3 = new Thread(threadThree); 
        // Starting the threads         
        t1.start();         
        t2.start();         
        t3.start();         
        try { 
            // Wait for all threads to finish             
            t1.join();             
            t2.join();             
            t3.join(); 
        } 
        catch (InterruptedException e) 
        { 
            System.out.println(e); 
 
        } 
        System.out.println("All threads have completed."); 
    } 
} 
