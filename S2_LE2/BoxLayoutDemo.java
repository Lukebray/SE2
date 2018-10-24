// Fig. 22.17: BoxLayoutDemo.java
// Demonstrating BoxLayout.
/*
Luke Bray
B00100787
24/10/2018
 */
package S2_LE2;
import javax.swing.JFrame;

public class BoxLayoutDemo
{
   public static void main(String[] args)
   { 
      BoxLayoutFrame boxLayoutFrame = new BoxLayoutFrame();
      boxLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //what happens on close
      boxLayoutFrame.setSize(400, 220); //size at start up is this value
      boxLayoutFrame.setVisible(true); 
   } 
} // end class BoxLayoutDemo


