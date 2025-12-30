//Write an applet program that displays a simple message. 

import java.applet.Applet; 
import java.awt.Graphics; 

// Create a class that extends the Applet class 

public class SimpleMessageApplet extends Applet
{     
    // The paint() method is used to display graphics 

    public void paint(Graphics g) 
    { 
        // Display a simple message on the applet window 
        g.drawString("Hello, welcome to the Java Applet!", 50, 50); 
    } 
} 
