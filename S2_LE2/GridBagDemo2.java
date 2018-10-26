// Fig. 22.24: GridBagDemo2.java
// Demonstrating GridBagLayout constants.
/*
Luke Bray
B00100787
26/10/2018
 */
package S2_LE2;
import javax.swing.JFrame;

public class GridBagDemo2
{ 
   public static void main(String[] args)
   { 
      GridBagFrame2 gridBagFrame = new GridBagFrame2();  //initialise new instance of class we are testing
      gridBagFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      gridBagFrame.setSize(300, 200); 
      gridBagFrame.setVisible(true); 
   } 
} // end class GridBagDemo2

