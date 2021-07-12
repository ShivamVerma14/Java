package JavaNewPractical;

import java.awt.*;
import java.awt.event.*;

public class demoKeyEvent extends Frame {
    String msg = "";

    // To register the Key Event Listener and Window Listener
    public demoKeyEvent() {
        addKeyListener(new MyKeyAdapter(this));

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent E) {
                System.exit(0);
            }
        });
    }

    // Overriding paint()
    public void paint(Graphics G) {
        G.drawString(msg, 20, 50);
    }

    // main() to instantiate the demoKeyEvent class
    public static void main(String[] args) {
        demoKeyEvent appwin = new demoKeyEvent();
        appwin.setSize(new Dimension(100, 100));
        appwin.setVisible(true);
        appwin.setTitle("Key_Typed");
    }
}

class MyKeyAdapter extends KeyAdapter {
    demoKeyEvent key;

    // Default Constructor to initialise the instance variable
    MyKeyAdapter(demoKeyEvent obj) {
        key = obj;
    }

    // Overriding the keyTyped() to handle the Key_Typed event
    public void keyTyped(KeyEvent E) {
        key.msg = "Typed Character is ";
        key.msg += E.getKeyChar();
        key.repaint();
    }
}