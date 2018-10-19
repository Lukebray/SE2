// Fig. 22.6: MenuTest.java
// Testing MenuFrame.
package S2_LE2;
import javax.swing.JFrame;

public class MenuTest
{
   public static void main(String[] args)
   { 
      MenuFrame menuFrame = new MenuFrame(); 
      menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      menuFrame.setSize(500, 200); 
      menuFrame.setVisible(true);
   } 
} // end class MenuTest




