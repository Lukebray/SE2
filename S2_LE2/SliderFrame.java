package S2_LE2;
//fig 22.3 slideframe.java
/*
Luke Bray
B00100787
22/10/2018
 */
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class SliderFrame extends JFrame { //includes all from JFrame class
    private final JSlider diameterJSlider; //slider to select diameter
    private final OvalPanel myPanel; //panel to draw circle

    //no argument constructor
    public SliderFrame() {
        super("Slider Demo"); //inherit title from superclass

        myPanel = new OvalPanel(); //create panel to draw circle
        myPanel.setBackground(Color.YELLOW); //setting background colour. YELLOW is a constant


        diameterJSlider = //JSlider that controls diamter
                new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10); //sets the constant values on the slider
        diameterJSlider.setMajorTickSpacing(10); //create tick every 10 units
        diameterJSlider.setPaintTicks(true); //put ticks on slider

        //register JSlider event listener
        diameterJSlider.addChangeListener( //listening for the change of tick marker
                new ChangeListener() { //anon inner class
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        myPanel.setDiameter(diameterJSlider.getValue());
                    }
                    //overriding the method in super class
                }
        );

        add(diameterJSlider, BorderLayout.SOUTH);
        add(myPanel, BorderLayout.CENTER);
    }
}
