package p1;

import javax.swing.JFrame;

public class JFrame2 {

    private JFrame frame;

    public JFrame2(){

        initialize();


    }

    private void initialize(){

        frame = new JFrame();
        this.frame.setTitle("p1.JFrame2");
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setSize(800,800);

        this.frame.setVisible(true);
        this.frame.setLocationRelativeTo(null);
        this.frame.setResizable(false);


    }

}
