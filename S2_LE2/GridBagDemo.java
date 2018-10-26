// Fig. 22.22: GridBagDemo.java
// Demonstrating GridBagLayout.
/*
Luke Bray
B00100787
24/10/2018
 */
package S2_LE2;
import javax.swing.JFrame;
//this is a class to test gridbagdemo
public class GridBagDemo
{ 
   public static void main(String[] args)
   { 
      GridBagFrame gridBagFrame = new GridBagFrame(); //create a new instance of gridbagframe
      gridBagFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      gridBagFrame.setSize(300, 150); 
      gridBagFrame.setVisible(true); 
   } 
} // end class GridBagDemo


