package testswingnextexampletwo;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main(){
        this.setTitle("My layout");
        this.setDefaultCloseOperation(3);
        this.setBounds(300, 320, 300, 200);
        initComponents();
        //this.pack();

    }

    public void initComponents(){
        button1Center = new JButton("Cancel");
        button2Top = new JButton("I'm on the top!!");
        button3Bottom = new JButton("I'm on the bottom!!");
        button4Left = new JButton("I'm on the left!!");
        button5Right = new JButton("I'm on the right!!");

        Container container = this.getContentPane();

        //container.add(button1Center, BorderLayout.CENTER);
        //button2Top.setSize(100,400);
        //container.add(button2Top, BorderLayout.NORTH);
        //container.add(button3Bottom, BorderLayout.SOUTH);
        //container.add(button4Left, BorderLayout.EAST);
        //container.add(button5Right, BorderLayout.WEST);

        button1Center.setLocation(205, 130);
        button1Center.setSize(button1Center.getPreferredSize());
        container.setLayout(null);
        container.add(button1Center);

    }

    JButton button1Center;
    JButton button2Top;
    JButton button3Bottom;
    JButton button4Left;
    JButton button5Right;

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
