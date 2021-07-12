package JavaNewPractical;

import java.awt.*;
import java.awt.event.*;

public class ButtonInfo extends Frame implements ActionListener {
    String name;
    String course;
    String rollno;
    String college;
    double cgpa;
    Button a;
    Button b;
    String msg; 

    // Constructor to register Action and Window listeners 
    public ButtonInfo() {
        name = "Shivam Verma";
        course = "B.Sc. (H) Computer Science";
        rollno = "19HCS4048";
        college = "Deen Dayal Upadhyaya College";
        cgpa = 8.64;

        setLayout(new FlowLayout());

        a = new Button("A");
        b = new Button("B");

        add(a);
        add(b);

        a.addActionListener(this);
        b.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent E) {
                System.exit(0);
            }
        });
    }

    // Overriding the actionPerformed() to perform a specific task
    public void actionPerformed(ActionEvent E) {
        if(E.getSource() == a) {
            msg = "Name: " + name + "\nCourse: " + course + "\nRoll Number: " + rollno + "\nCollege: " + college;
            repaint();
        }
        else {
            msg = "CGPA: " + cgpa;
            repaint();
        }
    }

    // Overriding paint()
    public void paint(Graphics G) {
        int x = 20, y = 100;
        for(String line : msg.split("\n"))
            G.drawString(line, x, y += 20);
    }

    // main() to instantiate the ButtonInfo class
    public static void main(String[] args) {
        ButtonInfo appwin = new ButtonInfo();
        appwin.setSize(new Dimension(400, 400));
        appwin.setVisible(true);
        appwin.setTitle("Information");
    }
}