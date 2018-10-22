package S2_LE2;
// sliderdemo.java
/*
Luke Bray
B00100787
22/10/2018
 */
import javax.swing.JFrame;

public class SliderDemo {
    public static void main(String[] args) {
        SliderFrame sliderFrame = new SliderFrame(); //create new sliderframe
        sliderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set what happens on close
        sliderFrame.setSize(220, 270); //size of window
        sliderFrame.setVisible(true);
    }
}
