
import p1.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Main {
    public static void main(String[] args) {


        JFrame1 frame1 = new JFrame1(); // Method Inheritance
        GraphPanel graphPanel = new GraphPanel();
        //p1.JFrame2 frame2 = new p1.JFrame2(); // this gives you no accesses to (Method composition)

        JPanel panel = new JPanel(); // default flow layout
        JTextField testField = new JTextField(16);

        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20)); //
        // The Flow Layout will Center the componetns that are in the JPanel<-----


        panel.setBackground(Color.DARK_GRAY);

        frame1.add(panel, BorderLayout.NORTH);
        frame1.add(graphPanel, BorderLayout.SOUTH);
        // size varies , with will be size of componetes plus hgap and vgap

        MyButton button = new MyButton();
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                String textFieldValue = testField.getText();
                System.out.println(textFieldValue);
            }
        });

        panel.setPreferredSize(new Dimension(800, 75)); // use set prefered size



        panel.add(new JLabel("Enter Equation Here: "));
        panel.add(testField);
        panel.add(button);






        frame1.setVisible(true);






    }
}