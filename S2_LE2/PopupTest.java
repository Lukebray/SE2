// Fig. 22.8: PopupTest.java
// Testing PopupFrame.
/*
Luke Bray
B00100787
22/10/2018
 */
package S2_LE2;
import javax.swing.JFrame;

public class PopupTest 
{
   public static void main(String[] args)
   { 
      PopupFrame popupFrame = new PopupFrame(); //create a new class instance
      popupFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set what to do when closed
      popupFrame.setSize(300, 200); //size of new frame
      popupFrame.setVisible(true); //make the frame visible
   } 
} // end class PopupTest

 