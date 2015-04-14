/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Parabola extends JFrame {

    public Parabola(String g){
        super(g);
}

    static class GraphPanel extends JPanel{

        
       @Override
        protected void paintComponent(Graphics g){
        g.drawLine(50,200,350,200);
        g.drawString("x",360,200);
        g.drawLine(200, 0, 200, 300);
        g.drawString("y", 200, 310);
        //draw x and y axes
        Polygon p = new Polygon();
        double scaleFactor=0.1;
        for(int x=-100;x<=100;x++){
        p.addPoint(x+200,200-(int)(scaleFactor*x*x));
        //add points for the parabola
        }
        g.drawPolygon(p);
        }
    }
}






