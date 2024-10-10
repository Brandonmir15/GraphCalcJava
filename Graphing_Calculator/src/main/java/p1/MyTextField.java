package p1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyTextField extends JTextField implements ActionListener {

    MyTextField(){

        initialize();
    }

    public void initialize(){

        this.setColumns(16);



    }


    @Override
    public void actionPerformed(ActionEvent e) {




    }


}
