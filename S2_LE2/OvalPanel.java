package S2_LE2;
//fig 22.2 ovalpanel.java

import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;

public class OvalPanel extends JPanel {
    private int diameter = 10; //default diameter

    //draw an oval of specified diameter
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(10, 10, diameter, diameter);
    }

    //validate and set diameter then repaint
    public void setDiameter(int newDiameter) {
        //if diam invalid set to 10
        diameter = (newDiameter >=0 ? newDiameter : 10);
        repaint(); //repaint panel
    }
}
