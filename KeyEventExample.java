//Write a java program for handling Key events.

import java.awt.*; 
import java.awt.event.*; 

public class KeyEventExample extends Frame implements KeyListener 
{ 
    // Constructor to set up the frame     
    public KeyEventExample() 
    {         
        setTitle("Key Event Handling"); 
        setSize(400, 200);         setLayout(null); 
        addKeyListener(this);  // Add key listener to the frame         
        setVisible(true); 
        setFocusable(true);  // Ensure the frame can capture key events 
    } 
    // KeyListener Methods 
    @Override 
    public void keyTyped(KeyEvent e) 
    { 
        System.out.println("Key typed: " + e.getKeyChar()); 
    } 

    @Override 
    public void keyPressed(KeyEvent e) 
    { 
        System.out.println("Key pressed: " + e.getKeyCode()); 
    } 

    @Override 
    public void keyReleased(KeyEvent e) 
    { 
        System.out.println("Key released: " + e.getKeyCode()); 
    } 
    // Main method to run the program     
    public static void main(String[] args) 
    { 
        // Create an instance of the KeyEventExample frame         
        new KeyEventExample(); 
    } 
} 
