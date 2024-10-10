import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;
import java.util.List;


public class GraphPanel extends JPanel implements ActionListener {

    private double x = -400;
    private double y = -400;
    private double xVelocity = 1;

    public String equation;
    double Usable_eq;
    private final int OFFSET_Y = 300;
    private final int OFFSET_X = 400;

    private List<Point2D.Double> points;
    GraphPanel(){

        initialize();
        points = new ArrayList<>();
    }

    private void initialize(){

        setBackground(Color.GRAY);
        this.setPreferredSize(new Dimension(800, 700));
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0)); //
        Timer timer = new Timer(10, this); // delay
        timer.start();
        //equation = "x";
        setDoubleBuffered(false);
        //Map<String, Double> vars = new HashMap<>(); // use this ti get x
        //vars.put(equation, x);
        //vars.get(equation);

    }

    public void paint(Graphics g){

        super.paint(g); // always use this for some reason
        Graphics2D g2d = (Graphics2D)g ;

        //g2d.setColor(Color.black);
        g2d.drawLine(0, 400 - 100 ,800, 400 - 100); // the x and y axis
        g2d.drawLine(400, 0, 400, 800);

        g2d.setStroke(new BasicStroke(3));


        for (int i = 1; i < points.size(); i++) {
            Point2D.Double p1 = points.get(i - 1);
            Point2D.Double p2 = points.get(i);
            g2d.draw(new Line2D.Double(p1.getX() + 400, p1.getY() + OFFSET_Y , p2.getX()  + 400, p2.getY()+ OFFSET_Y));
        }



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Point2D.Double point = new Point2D.Double(x, -y);
        points.add(point);

        repaint();

        x += xVelocity;
        //y = vars.get(equation);
        y = (Math.sin(x/20) * 100);

        if(x > 400){
            x = -400;
            setBackground(Color.GRAY);
            points.clear();
        }

    }
}
// 300 is the Offset for the Y