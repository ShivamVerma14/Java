package JavaNewPractical;

import java.awt.*;
import java.awt.event.*;

public class ButtonFrame extends Frame implements ActionListener{
    Button BRed;
    Button BBlue;
    
    // Constructor to add buttons and register listeners
    public ButtonFrame() {
        BRed = new Button("RED");
        BRed.setBounds(100, 120, 80, 30);
        BBlue = new Button("BLUE");
        BBlue.setBounds(210, 120, 80, 30);
        
        BRed.addActionListener(this);
        BBlue.addActionListener(this);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent E) {
                System.exit(0);
            }
        });
        
        add(BRed);
        add(BBlue);
        setSize(390, 270);
        setLayout(null);
        setVisible(true);
    }
    
    // Overriding actionPerformed() to implement the event handling
    public void actionPerformed(ActionEvent E) {
        if(E.getSource() == BRed)
            setBackground(Color.RED);
        else if(E.getSource() == BBlue)
            setBackground(Color.BLUE);
    }
    
    public static void main(String[] args) {
        new ButtonFrame();
    }
}
