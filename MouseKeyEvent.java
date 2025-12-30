//Write a java program for handling Mouse events and Key events. 

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="MouseKeyEvent.class" width="400" height="300">
</applet>
*/

public class MouseKeyEvent extends Applet
        implements MouseListener, KeyListener {

    String msg = "";

    public void init() {
        addMouseListener(this);
        addKeyListener(this);
        setFocusable(true);   // Required for key events
    }

    // Mouse Events
    public void mouseClicked(MouseEvent me) {
        msg = "Mouse Clicked at (" + me.getX() + ", " + me.getY() + ")";
        repaint();
    }

    public void mousePressed(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}
    public void mouseEntered(MouseEvent me) {
        msg = "Mouse Entered";
        repaint();
    }

    public void mouseExited(MouseEvent me) {
        msg = "Mouse Exited";
        repaint();
    }

    // Key Events
    public void keyPressed(KeyEvent ke) {
        msg = "Key Pressed : " + ke.getKeyChar();
        repaint();
    }

    public void keyReleased(KeyEvent ke) {}
    public void keyTyped(KeyEvent ke) {}

    // Display message
    public void paint(Graphics g) {
        g.drawString(msg, 50, 150);
    }
}
