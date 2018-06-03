package dokkos;

/**
 *
 * @author Noah Yoder
 * @version 1.0
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DokkOS extends JApplet
{
    private int APPLET_WIDTH = 1000, APPLET_HEIGHT = 1000;
    private JButton b1;
    
    public void init()
    {
        //Panel inits container
        push = new JButton("Test");
        push.addActionListener (new ButtonListener());
        
    }
    /**
     * @param command line stuff
     */
    public static void main(String[] args) 
    {
        //Spawns the window for elements and interaction
        
    }
    
}
