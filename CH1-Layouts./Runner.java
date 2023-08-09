/**
 * @author: Rezvee Rahman
 * @version: JDK-20.0.1
 * 
 * This is the runner for the Swing-AWT window Layout program.
 */

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JWindow;

public class Runner extends JFrame {
    
    /* -----------------
     * -- Fields
     * ----------------- */
    /**
     * For 1920x1080p displays only
     */
    private static int WIDTH = 1333;
    private static int HEIGHT = 720;
    

    public Runner() {
        new JFrame("Rezvee's Java Swing Frame");
        /**
         * Left this in here for other purposes and 
         * will have to gain better understanding of the java
         * graphics environment. 
         */        
        GraphicsEnvironment ev = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ev.getDefaultScreenDevice();
        GraphicsConfiguration gc = gd.getDefaultConfiguration();
        
        Rectangle bounds = gc.getBounds();

        /**
         * Setting Up the window Dimensions here.
         */
        setVisible(true);        
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(2);
        setLocation((int)bounds.getHeight()/2, (int)bounds.getWidth()/3);
    }


    public static void main(String[] args) {
        Runner start = new Runner();
    }
}