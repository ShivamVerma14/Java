package JavaNewPractical;

import java.awt.*;
import java.awt.event.*;

public class StringFrame extends Frame {
    String message = "";
    int xCoordinate, yCoordinate;
    
    // Constructor to set the frame
    StringFrame(String message, int X, int Y) {
        this.message = message;
        xCoordinate = X;
        yCoordinate = Y;
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent E) {
                setVisible(false);
            }
        });
        
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        setBackground(Color.pink);
    }
    
    // Overriding paint() to print the essentials
    public void paint(Graphics G) {
        G.drawString(message, xCoordinate, yCoordinate);
    }
    
    public static void main(String[] args) {
        new StringFrame("Hello World", 30, 50);
    }
}
