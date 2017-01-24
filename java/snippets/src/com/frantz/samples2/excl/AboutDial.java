package com.frantz.samples2.excl;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

public class AboutDial  extends JDialog implements ActionListener {
	  public AboutDial(JFrame parent, String title, String message) 
	  {
		    super(parent, title, true);
		    
		    JPanel messagePane = new JPanel();
		    messagePane.add(new JLabel(message));
		    getContentPane().add(messagePane);
		    JPanel buttonPane = new JPanel();
		    JButton button = new JButton("OK"); 
		    buttonPane.add(button); 
		    button.addActionListener(this);
		    Icon i = UIManager.getIcon("OptionPane.warningIcon");
			  Image img =  ((ImageIcon) i).getImage();
			  button.setIcon(i);
		    String labels[] = { "A          A", "B", "C", "D","E", "F", "G", "H","I", "J" };
		    JComboBox comboBox1 = new JComboBox(labels);
		    comboBox1.setMaximumRowCount(5);
		    buttonPane.add(comboBox1, BorderLayout.SOUTH);

		    JComboBox comboBox2 = new JComboBox(labels);
		    comboBox2.setEditable(true);
		    buttonPane.add(comboBox2, BorderLayout.SOUTH);
		    
		    
		    getContentPane().add(buttonPane, BorderLayout.SOUTH);
		    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		    pack(); 
		    setLocationRelativeTo(null);
		    setVisible(true);
		  }
		  public void actionPerformed(ActionEvent e) {
		    setVisible(false); 
		    dispose(); 
		  }
		  public static void openweb(String fileUrl)
		  {
			  try {
				  JEditorPane website = new JEditorPane(fileUrl);
			        website.setEditable(false);

			        JFrame frame = new JFrame("Test");
			        frame.add(new JScrollPane(website));
			        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        frame.setVisible(true);
			        frame.pack();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			  	
		  }
		  public static void main(String[] a) {
			  AboutDial dlg = new AboutDial(new JFrame(), "title", "message");
			  //openweb();
			  //Icon i = UIManager.getIcon("OptionPane.warningIcon");
			  //Image img =  ((ImageIcon) i).getImage();
			  //System.out.println(dlg.getName());
		  }
		  
}