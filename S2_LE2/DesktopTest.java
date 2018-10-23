// Fig. 22.12: DesktopTest.java
// Demonstrating JDesktopPane.
/*
Luke Bray
B00100787
22/10/2018
 */
package S2_LE2;
import javax.swing.JFrame;

public class DesktopTest 
{
   public static void main(String[] args)
   { 
      DesktopFrame desktopFrame = new DesktopFrame();  
      desktopFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      desktopFrame.setSize(600, 480); 
      desktopFrame.setVisible(true); 
   } 
} // end class DesktopTest

