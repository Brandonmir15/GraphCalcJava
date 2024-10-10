package p1;

import javax.swing.JFrame;

public class JFrame1 extends JFrame {

    public JFrame1(){

        initialize();



    }


    public void initialize(){

        setTitle("p1.JFrame1");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800,800);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);

    }


}
