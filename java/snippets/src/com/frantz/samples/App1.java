package com.frantz.samples;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;


public class App1 extends JApplet {

	private double sum=0;
	TextField firstNumber = new TextField(5);
	TextField secondNumber = new TextField(5);
	Button goButton = new Button("Go");
	TextField answer = new TextField(5);
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawString("Sum = " + sum, 25,25);
	}

	@Override
	public void init() {
		//String fn1 = JOptionPane.showInputDialog("One");
		//String fn2 = JOptionPane.showInputDialog("Two");
		//sum = Double.parseDouble(fn1) + Double.parseDouble(fn2);
		makeGUI();
		
		
	}
	void makeGUI()
	{
		Label startLabel = new Label("Start :", Label.RIGHT);
		Label endLabel = new Label("End :", Label.RIGHT);
		Panel p1 = new Panel();
			
		// add the labels and textfields to the panels and applet
		p1.setLayout(new GridLayout(4, 2));
		p1.setBackground(Color.cyan);
		
		p1.add(startLabel);
		p1.add(firstNumber);
		p1.add(endLabel);
		p1.add(secondNumber);
		p1.add(new Label("Answer", Label.RIGHT));
		p1.add(answer);
		p1.add(goButton);
	
		//p.setLayout(new GridLayout(4, 1));
		//p.add(p1);
	
		// add the panel to the applet
		this.setLayout(new BorderLayout());
		this.setBackground(Color.yellow);
		add(p1, "South");
	
		// register listener(s), if any
		goButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String cmd = e.getActionCommand();
				
				if (cmd.equals("Go")) {
					// deal with the action
					// read the start and end numbers
					sum = Double.parseDouble(firstNumber.getText()) + Double.parseDouble(secondNumber.getText());
					answer.setText(String.valueOf(sum));
					
					repaint();
				}
			}
			
		});
	}

}
