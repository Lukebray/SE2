// Fig. 22.5: MenuFrame.java
// Demonstrating menus.
/*
Luke Bray
B00100787
22/10/2018
 */
package S2_LE2;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

public class MenuFrame extends JFrame //using all items from JFrame class
{
   private final Color[] colorValues = 
      {Color.BLACK, Color.BLUE, Color.RED, Color.GREEN};  //declaring constant variables of colour
   private final JRadioButtonMenuItem[] colorItems; // color menu items
   private final JRadioButtonMenuItem[] fonts; // font menu items in an array
   private final JCheckBoxMenuItem[] styleItems; // font style menu items in array
   private final JLabel displayJLabel; // displays sample text
   private final ButtonGroup fontButtonGroup; // manages font menu items
   private final ButtonGroup colorButtonGroup; // manages color menu items
   private int style; // used to create style for font

   // no-argument constructor set up GUI
   public MenuFrame()
   {
      super("Using JMenus"); //calls constructor that accepts 1 arg

      JMenu fileMenu = new JMenu("File"); // create file menu. JMenu is in JFrame
      fileMenu.setMnemonic('F'); // set mnemonic to F. This means fileMenu can be accessed by pressing the 'F' key

      // create About... menu item
      JMenuItem aboutItem = new JMenuItem("About..."); //the argument is what displays in app
      aboutItem.setMnemonic('A'); // set mnemonic to A
      fileMenu.add(aboutItem); // use .add to add item to filemenu
      aboutItem.addActionListener(
         new ActionListener() // aboutItem is listening for something to happen
         {  
            // display message dialog when user selects About...
            @Override //overriding below method from JFrame
            public void actionPerformed(ActionEvent event) //class created inside ActionListener so it will inherit
            {
               //the below will handle the event when it occurs
               JOptionPane.showMessageDialog(MenuFrame.this,
                  "This is an example\nof using menus",
                  "About", JOptionPane.PLAIN_MESSAGE);
            } 
         } 
      ); 
 
      JMenuItem exitItem = new JMenuItem("Exit"); // create exit item
      exitItem.setMnemonic('x'); // set mnemonic to x
      fileMenu.add(exitItem); // add exit item to file menu
      exitItem.addActionListener(
         new ActionListener() // anonymous inner class
         {  
            // terminate application when user clicks exitItem
            @Override //means we are using the below actionPerformed method
            public void actionPerformed(ActionEvent event)
            {
               System.exit(0); // exit application
            } 
         }
      ); 

      JMenuBar bar = new JMenuBar(); // create menu bar
      setJMenuBar(bar); // add menu bar to application
      bar.add(fileMenu); // add file menu to menu bar

      JMenu formatMenu = new JMenu("Format"); // create format menu
      formatMenu.setMnemonic('r'); // set mnemonic to r

      // array listing string colors
      String[] colors = {"Black", "Blue", "Red", "Green"};

      JMenu colorMenu = new JMenu("Color"); // create color menu
      colorMenu.setMnemonic('C'); // set mnemonic to C

      // create radio button menu items for colors
      colorItems = new JRadioButtonMenuItem[colors.length]; //variable was declared at top of class
      colorButtonGroup = new ButtonGroup(); // manages colors
      ItemHandler itemHandler = new ItemHandler(); // handler for colors

      // create color radio button menu items
      for (int count = 0; count < colors.length; count++)  //for each colour in colour array
      {
         colorItems[count] = 
            new JRadioButtonMenuItem(colors[count]); // create radio button[count]
         colorMenu.add(colorItems[count]); // add item to color menu
         colorButtonGroup.add(colorItems[count]); // add to group
         colorItems[count].addActionListener(itemHandler); //add the itemhandler to listen
      }

      colorItems[0].setSelected(true); // select first colour item as default

      formatMenu.add(colorMenu); // add color menu to format menu
      formatMenu.addSeparator(); // add separator in menu

      // array listing font names
      String[] fontNames = {"Serif", "Monospaced", "SansSerif"}; //selection of font names
      JMenu fontMenu = new JMenu("Font"); // create font menu
      fontMenu.setMnemonic('n'); // set mnemonic to n

      // create radio button menu items for font names
      fonts = new JRadioButtonMenuItem[fontNames.length]; //creating 3 radio buttons for the fonts
      fontButtonGroup = new ButtonGroup(); // puts font names in a group

      // create Font radio button menu items
      for (int count = 0; count < fonts.length; count++) 
      {
         fonts[count] = new JRadioButtonMenuItem(fontNames[count]); //create radiobutton[count] for font names
         fontMenu.add(fonts[count]); // add font to font menu
         fontButtonGroup.add(fonts[count]); // add to button group
         fonts[count].addActionListener(itemHandler); // add handler
      } 

      fonts[0].setSelected(true); // select first Font menu item as the default font
      fontMenu.addSeparator(); // add separator bar to font menu

      String[] styleNames = {"Bold", "Italic"}; // names of styles
      styleItems = new JCheckBoxMenuItem[styleNames.length]; //creating 2 check boxes for the styles
      StyleHandler styleHandler = new StyleHandler(); // style handler

      // create style checkbox menu items
      for (int count = 0; count < styleNames.length; count++) 
      {
         styleItems[count] = 
            new JCheckBoxMenuItem(styleNames[count]); // for style
         fontMenu.add(styleItems[count]); // add to font menu
         styleItems[count].addItemListener(styleHandler); // handler
      }

      formatMenu.add(fontMenu); // add Font menu to Format menu
      bar.add(formatMenu); // add Format menu to menu bar
     
      // set up label to display text
      displayJLabel = new JLabel("Sample Text", SwingConstants.CENTER); //creating a centered label
      displayJLabel.setForeground(colorValues[0]); //set colour to the default
      displayJLabel.setFont(new Font("Serif", Font.PLAIN, 72)); //setting the font of the centered label

      getContentPane().setBackground(Color.CYAN); // set background
      add(displayJLabel, BorderLayout.CENTER); // add displayJLabel
   } // end MenuFrame constructor

   // inner class to handle action events from menu items
   private class ItemHandler implements ActionListener 
   {
      // process color and font selections
      @Override
      public void actionPerformed(ActionEvent event) //when something happens
      {
         // process color selection
         for (int count = 0; count < colorItems.length; count++) //loop through colours array
         {
            if (colorItems[count].isSelected()) //if that colour is selected
            {
               displayJLabel.setForeground(colorValues[count]); //set the label to that colour
               break; //break from loop
            } 
         } 

         // process font selection
         for (int count = 0; count < fonts.length; count++)
         {
            if (event.getSource() == fonts[count]) //if event is the same as what is selected then set that font
            {
               displayJLabel.setFont(
                  new Font(fonts[count].getText(), style, 72));
            }
         }

         repaint(); // redraw application
      } 
   } // end class ItemHandler

   // inner class to handle item events from checkbox menu items
   private class StyleHandler implements ItemListener 
   {
      // process font style selections
      @Override
      public void itemStateChanged(ItemEvent e)
      {
         String name = displayJLabel.getFont().getName(); // current Font
         Font font; // new font based on user selections

         // determine which CheckBoxes are checked and create Font
         if (styleItems[0].isSelected() && 
              styleItems[1].isSelected())
            font = new Font(name, Font.BOLD + Font.ITALIC, 72);
         else if (styleItems[0].isSelected())
            font = new Font(name, Font.BOLD, 72);
         else if (styleItems[1].isSelected())
            font = new Font(name, Font.ITALIC, 72);
         else
            font = new Font(name, Font.PLAIN, 72);

         displayJLabel.setFont(font);
         repaint(); // refreshes the application with the new settings
      } 
   } // end class StyleHandler
} // end class MenuFrame



