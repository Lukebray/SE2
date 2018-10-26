// Fig. 22.16: BoxLayoutFrame.java
// Demonstrating BoxLayout.
/*
Luke Bray
B00100787
24/10/2018
 */
package S2_LE2;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class BoxLayoutFrame extends JFrame 
{
   // set up GUI
   public BoxLayoutFrame()
   {
      super("Demonstrating BoxLayout");

      // create Box containers with BoxLayout
      Box horizontal1 = Box.createHorizontalBox(); //this is the first tab
      Box vertical1 = Box.createVerticalBox(); //second tab
      Box horizontal2 = Box.createHorizontalBox(); //third tab
      Box vertical2 = Box.createVerticalBox(); //fourth tab

      final int SIZE = 3; // number of buttons on each Box

      // add buttons to Box horizontal1
      for (int count = 0; count < SIZE; count++)
         horizontal1.add(new JButton("Button " + count));

      // create strut and add buttons to Box vertical1
      for (int count = 0; count < SIZE; count++) 
      {
         vertical1.add(Box.createVerticalStrut(25)); //vertical strut is the space between each button vertically
          //struts are of a fixed height/width
         vertical1.add(new JButton("Button " + count)); //add in the vertical buttons
      }

      // create horizontal glue and add buttons to Box horizontal2
      for (int count = 0; count < SIZE; count++) 
      {
         horizontal2.add(Box.createHorizontalGlue()); //this is the space between buttons horizontally
          //glue expands to fill the empty space
         horizontal2.add(new JButton("Button " + count)); //add in the horizontal buttons
      }

      // create rigid area and add buttons to Box vertical2
      for (int count = 0; count < SIZE; count++) 
      {
         vertical2.add(Box.createRigidArea(new Dimension(12, 8))); //this is a defined area that does not change
         vertical2.add(new JButton("Button " + count)); //add in the buttons
      } 

      // create vertical glue and add buttons to panel
      JPanel panel = new JPanel(); //create new JPanel object
      panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); //panel is of instance FlowLayout by default

      for (int count = 0; count < SIZE; count++) 
      {
         panel.add(Box.createGlue());
         panel.add(new JButton("Button " + count));
      } 

      // create a JTabbedPane
      JTabbedPane tabs = new JTabbedPane(
         JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT); //creating a scrollable pane in case window is too small
       //positioning pane at the top

      // place each container on tabbed pane
      tabs.addTab("Horizontal Box", horizontal1); //adding the tabs to the pane
      tabs.addTab("Vertical Box with Struts", vertical1);
      tabs.addTab("Horizontal Box with Glue", horizontal2);
      tabs.addTab("Vertical Box with Rigid Areas", vertical2);
      tabs.addTab("Vertical Box with Glue", panel);

      add(tabs); // place tabbed pane on frame
   } // end BoxLayoutFrame constructor
} // end class BoxLayoutFrame


