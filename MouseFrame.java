package JavaNewPractical;

import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class MouseFrame extends Frame implements MouseListener {
    String msg = "";
    int mouseX, mouseY;
    
    // Constructor to register listeners
    MouseFrame(String title) {
        super(title);
        addMouseListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent E) {
                System.exit(0);
            }
        });
        setSize(300, 300);
        setLayout(new CardLayout());
        setVisible(true);
    }
    
    // Overriding mouseClicked()
    public void mouseClicked(MouseEvent E) {
        msg = "Mouse Clicked!!!";
        mouseX = E.getX();
        mouseY = E.getY();
        repaint();
    }
    
    // Overriding mouseEntered()
    public void mouseEntered(MouseEvent E) {
        this.setVisible(true);
        msg = "Mouse Entered!!!";
        mouseX = E.getX();
        mouseY = E.getY();
        repaint();
    }
    
    // Overriding mouseExited()
    public void mouseExited(MouseEvent E) {
        msg = "Mouse Exited!!!";
        mouseX = E.getX();
        mouseY = E.getY();
        repaint();
        this.setVisible(false);
    }
    
    // Overriding mouseReleased()
    public void mouseReleased(MouseEvent E) {
    }
    
    // Overriding mousePressed()
    public void mousePressed(MouseEvent E) {
    }
    
    // paint() to print the essentials on frame
    public void paint(Graphics G) {
        G.drawString(msg, mouseX, mouseY);
    }
    
    public static void main(String[] args) {
        new MouseFrame("Mouse Tracker");
    }
}
