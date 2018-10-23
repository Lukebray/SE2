// Fig. 22.14: JTabbedPaneDemo.java
// Demonstrating JTabbedPane.
/*
Luke Bray
B00100787
22/10/2018
 */
package S2_LE2;
import javax.swing.JFrame;
//class to test the JTabbedPaneFrame class
public class JTabbedPaneDemo
{
   public static void main(String[] args) //main method
   { 
      JTabbedPaneFrame tabbedPaneFrame = new JTabbedPaneFrame();  
      tabbedPaneFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //action on closing of frame
      tabbedPaneFrame.setSize(250, 200); //size of frame
      tabbedPaneFrame.setVisible(true); //set frame to be visible
   } 
} // end class JTabbedPaneDemo

