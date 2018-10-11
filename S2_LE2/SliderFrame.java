package S2_LE2;
//fig 22.3 slideframe.java

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class SliderFrame extends JFrame {
    private final JSlider diameterJSlider; //slider to select diameter
    private final OvalPanel myPanel; //panel to draw circle

    //no argument constructor
    public SliderFrame() {
        super("Slider Demo");

        myPanel = new OvalPanel(); //create panel to draw circle
        myPanel.setBackground(Color.YELLOW); //set color

        //set up JSlider to control diameter value
        diameterJSlider =
                new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
        diameterJSlider.setMajorTickSpacing(10); //create tick every 10 units
        diameterJSlider.setPaintTicks(true); //put ticks on slider

        //register JSlider event listener
        diameterJSlider.addChangeListener(
                new ChangeListener() { //anon inner class
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        myPanel.setDiameter(diameterJSlider.getValue());
                    }
                }
        );

        add(diameterJSlider, BorderLayout.SOUTH);
        add(myPanel, BorderLayout.CENTER);
    }
}
