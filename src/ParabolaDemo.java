/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
import javax.swing.JFrame;
//
//
// Draw a parabola in JFrame, the function of this parabola is
// y=x^2


public class ParabolaDemo {

    public static void main(String[] args) {
// TODO Auto-generated method stub
        Parabola frame= new Parabola("Parabola");
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        Parabola.GraphPanel g= new Parabola.GraphPanel();
        frame.add(g);
}
}
