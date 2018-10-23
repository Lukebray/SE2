// Fig. 22.11: DesktopFrame.java
// Demonstrating JDesktopPane.
/*
Luke Bray
B00100787
22/10/2018
 */
package S2_LE2;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.security.SecureRandom;
import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class DesktopFrame extends JFrame //include all items from JFrame
{
   private final JDesktopPane theDesktop; //initialise a variable of type JDesktopPane called theDesktop
   //JDesktopPane is used to create multi-doc interface or virtual desktop

   // set up GUI
   public DesktopFrame()
   {
      super("Using a JDesktopPane");
      //creating various components below
      JMenuBar bar = new JMenuBar(); 
      JMenu addMenu = new JMenu("Add"); 
      JMenuItem newFrame = new JMenuItem("Internal Frame");

      addMenu.add(newFrame); // add new frame item to Add menu
      bar.add(addMenu); // add Add menu to menu bar
      setJMenuBar(bar); // set menu bar for this application

      theDesktop = new JDesktopPane(); 
      add(theDesktop); // add desktop pane to frame
    
      // set up listener for newFrame menu item
      newFrame.addActionListener(
         new ActionListener() // anonymous inner class
         {  
            // display new internal window
            @Override
            public void actionPerformed(ActionEvent event) 
            {
               // create internal frame when action (pressing add) is performed
               JInternalFrame frame = new JInternalFrame(
                  "Internal Frame", true, true, true, true);

               MyJPanel panel = new MyJPanel();
               frame.add(panel, BorderLayout.CENTER);
               frame.pack(); // set internal frame to size of contents. There are no contents so this will be small

               theDesktop.add(frame); // attach internal frame
               frame.setVisible(true); // show internal frame
            } 
         } 
      ); 
   } // end constructor DesktopFrame
} // end class DesktopFrame

// class to display an ImageIcon on a panel
class MyJPanel extends JPanel 
{
   private static final SecureRandom generator = new SecureRandom();
   private final ImageIcon picture; // image to be displayed
   private static final String[] images = {".\\images\\yellowflowers.png",
      ".\\images\\purpleflowers.png", ".\\images\\redflowers.png", ".\\images\\redflowers2.png",
      ".\\images\\lavenderflowers.png"}; //these are images that will be displayed at random

   // load image
   public MyJPanel()
   {
      //"choosing" a random image to display
      int randomNumber = generator.nextInt(images.length); //random number between 0 and images.length
      picture = new ImageIcon(images[randomNumber]); // set icon
   }

   // display imageIcon on panel
   @Override
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g); //use JPanel class to paintcomponent
      picture.paintIcon(this, g, 0, 0); // display icon
   }

   // return image dimensions
   public Dimension getPreferredSize()
   {
      return new Dimension(picture.getIconWidth(), 
         picture.getIconHeight());  
   }
} // end class MyJPanel

