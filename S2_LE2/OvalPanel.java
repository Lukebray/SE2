package S2_LE2;
//fig 22.2 ovalpanel.java
/*
Luke Bray
B00100787
22/10/2018
 */
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;

public class OvalPanel extends JPanel { //in this class we are inheriting anything inside JPanel
    private int diameter = 10; //default diameter. This could be left uninitialised and would be 0

    //draw an oval of specified diameter
    @Override //this tells the compiler/programmer we are about to override a method in a superclass. Good for errors
    public void paintComponent(Graphics g) { //creating a new method with graphics
        super.paintComponent(g); //uses method from super class
        g.fillOval(10, 10, diameter, diameter); //create the oval
    }

    //validate and set diameter then repaint
    public void setDiameter(int newDiameter) { //method to create diameter
        //if diam invalid set to 10
        diameter = (newDiameter >=0 ? newDiameter : 10);
        repaint(); //repaint panel
    }
}
