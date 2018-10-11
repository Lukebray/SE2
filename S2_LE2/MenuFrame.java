package S2_LE2;
//fig 22.5 menuframe.java

import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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

public class MenuFrame {
    private final Color[] colorValues =
            {Color.BLACK, Color.BLUE, Color.RED, Color.GREEN};
    private final JRadioButtonMenuItem[] colorItems; //color menu items
    private final JRadioButtonMenuItem[] fonts; //font menu items
    private final JCheckBoxMenuItem[] styleItems; //font style menu items
    private final JLabel displayJLabel; //displays sample text
    private final ButtonGroup fontButtonGroup; //manages font menu items
    private final ButtonGroup colorButtonGroup; //manages color menu items
    private int style; //user to create style for font

    //no argument constructor set up GUI
    public MenuFrame() {
        super("Using Menus");

        JMenu fileMenu = new JMenu("File"); //create file menu
        fileMenu.setMnemonic('F'); //set mnemonic to F

        //create about menu item
        JMenu aboutItem = new JMenu("About...");
        aboutItem.setMnemonic('A');
        fileMenu.add(aboutItem); //add about item to file menu
        aboutItem.addActionListener(
                new ActionListener() {
                    //display message dialog when user selects About...
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(MenuFrame.this,
                                "This is an example\nof using menus",
                                "About", JOptionPane.PLAIN_MESSAGE);
                    }
                }
        );

        JMenuItem exitItem = new JMenuItem("Exit"); //create exit item
        exitItem.setMnemonic('X');
        fileMenu.addItem(exitItem); //add exit item to file menu
        exitItem.addActionListener(
                new ActionListener() {

                    //terminate application when user clicks exitItem
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0); //exit application
                    }
                }
        );



    }
}
