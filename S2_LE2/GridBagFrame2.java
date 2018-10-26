// Fig. 22.23: GridBagFrame2.java
// Demonstrating GridBagLayout constants.
/*
Luke Bray
B00100787
26/10/2018
 */
package S2_LE2;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;

public class GridBagFrame2 extends JFrame 
{ 
   private final GridBagLayout layout; // layout of this frame
   private final GridBagConstraints constraints; // layout's constraints
    
   // set up GUI
   public GridBagFrame2()
   {
      super("GridBagLayout");
      //this is where we set the layout manager. dont have to do this but is recommended
      layout = new GridBagLayout();
      setLayout(layout);
      constraints = new GridBagConstraints(); // instantiate constraints

      // create GUI components
      String[] metals = {"Copper", "Aluminum", "Silver"};
      JComboBox<String> comboBox = new JComboBox<String>(metals); //lets user choose several choices

      JTextField textField = new JTextField("TextField"); //allows editing of single line of text

      String[] fonts = {"Serif", "Monospaced"}; //choice of fonts
      JList list = new JList(fonts); //list for user to choose fonts

      String[] names = {"zero", "one", "two", "three", "four"}; //list of names
      JButton[] buttons = new JButton[names.length]; //creating enough buttons

      //creating the buttons themselves
      for (int count = 0; count < buttons.length; count++)
         buttons[count] = new JButton(names[count]);

      // define GUI component constraints for textField
      //weightx/y
      constraints.weightx = 1;
      constraints.weighty = 1;  
      constraints.fill = GridBagConstraints.BOTH;
      constraints.gridwidth = GridBagConstraints.REMAINDER;
      addComponent(textField);

      // buttons[0] -- weightx and weighty are 1: fill is BOTH
      constraints.gridwidth = 1;
      addComponent(buttons[0]);

      // buttons[1] -- weightx and weighty are 1: fill is BOTH
      constraints.gridwidth = GridBagConstraints.RELATIVE;
      addComponent(buttons[1]);

      // buttons[2] -- weightx and weighty are 1: fill is BOTH
      constraints.gridwidth = GridBagConstraints.REMAINDER;
      addComponent(buttons[2]);

      // comboBox -- weightx is 1: fill is BOTH
      constraints.weighty = 0;
      constraints.gridwidth = GridBagConstraints.REMAINDER;
      addComponent(comboBox);
      
      // buttons[3] -- weightx is 1: fill is BOTH
      constraints.weighty = 1;
      constraints.gridwidth = GridBagConstraints.REMAINDER;
      addComponent(buttons[3]); 

      // buttons[4] -- weightx and weighty are 1: fill is BOTH
      constraints.gridwidth = GridBagConstraints.RELATIVE;
      addComponent(buttons[4]);

      // list -- weightx and weighty are 1: fill is BOTH
      constraints.gridwidth = GridBagConstraints.REMAINDER;
      addComponent(list);
   } // end GridBagFrame2 constructor

   // add a component to the container
   private void addComponent(Component component) 
   {
      layout.setConstraints(component, constraints);
      add(component); // add component
   } 
} // end class GridBagFrame2

