// Fig. 22.7: PopupFrame.java
// Demonstrating JPopupMenus.
/*
Luke Bray
B00100787
23/10/2018
 */
package S2_LE2;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.ButtonGroup;

public class PopupFrame extends JFrame //including all items from JFrame class
{
   private final JRadioButtonMenuItem[] items; // holds items for colors
   private final Color[] colorValues = 
      {Color.BLUE, Color.YELLOW, Color.RED}; // colors to be used. These are constant
   private final JPopupMenu popupMenu; // allows user to select color

   // no-argument constructor sets up GUI
   public PopupFrame()
   {
      super("Using JPopupMenus"); //title of the new frame. Currently invisible

      //need to add all of the elements to go into the frame
      ItemHandler handler = new ItemHandler(); // handler for menu items
      String[] colors = {"Blue", "Yellow", "Red"}; //an array of colours

      ButtonGroup colorGroup = new ButtonGroup(); // manages color items by creating a buttongroup
      popupMenu = new JPopupMenu(); // create pop-up menu
      items = new JRadioButtonMenuItem[colors.length]; //creating the correct amount of radio buttons

      // construct menu item, add to pop-up menu, enable event handling
      for (int count = 0; count < items.length; count++) 
      {
         items[count] = new JRadioButtonMenuItem(colors[count]);
         popupMenu.add(items[count]); // add item to pop-up menu
         colorGroup.add(items[count]); // add item to button group
         items[count].addActionListener(handler); // add handler
      }

      setBackground(Color.WHITE); 

      // declare a MouseListener for the window to display pop-up menu
      //a mouse listener is listening specifically for mouse clicks
      addMouseListener(
         new MouseAdapter() // anonymous inner class
         {  
            // what to do when the mouse is pressed
            @Override //use the method declared here not in the super class
            public void mousePressed(MouseEvent event)
            { 
               checkForTriggerEvent(event); 
            } 

            // what to do when the mouse is released
            @Override
            public void mouseReleased(MouseEvent event)
            { 
               checkForTriggerEvent(event);
            }

            // determine whether event should trigger pop-up menu
            //popup menu triggered if event is a popup trigger - MouseEvent is a popup trigger
            private void checkForTriggerEvent(MouseEvent event)
            {
               if (event.isPopupTrigger()) 
                  popupMenu.show(
                     event.getComponent(), event.getX(), event.getY());  
            }
         } 
      ); 
   } // end PopupFrame constructor

   // private inner class to handle menu item events
   private class ItemHandler implements ActionListener 
   {
      // process menu item selections
      @Override
      public void actionPerformed(ActionEvent event)
      {
         // determine which menu item was selected
         for (int i = 0; i < items.length; i++)
         {
            if (event.getSource() == items[i]) //if the selected item is the same as the one in [i] in array
            {
               getContentPane().setBackground(colorValues[i]); //set the background to that value
               return;
            } 
         } 
      } 
   } // end private inner class ItemHandler
} // end class PopupFrame


 