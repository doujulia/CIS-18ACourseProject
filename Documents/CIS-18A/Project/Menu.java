/*
Course Project Option 1
Enables users to place an order at Domino’s Pizza and set a delivery date and time within a one-year span to receive the meal 
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu implements ActionListener {
	JLabel jlab;

	Menu() {
		// create a window 
		JFrame jfrm = new JFrame("Welcome to Domino's!");

		jfrm.setLayout(new FlowLayout());

		jfrm.setSize(1500, 90);
		
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jlab = new JLabel("Pick a pizza.");


		// buttons for menu options
		JButton jbtnCheese = new JButton("Classic Cheese");
		JButton jbtnPepperoni = new JButton("Ultimate Pepperoni");
		JButton jbtnHawaiian = new JButton("Honolulu Hawaiian");
		JButton jbtnDeluxe = new JButton("Deluxe");
		JButton jbtnBBQ = new JButton("Memphis BBQ Chicken");
		JButton jbtnVeggie = new JButton("Pacific Veggie");
		JButton jbtnMeat = new JButton("MeatZZa");
		JButton jbtnSpinach = new JButton("Spinach & Feta");
		JButton jbtnRanch = new JButton("Cali Chicken Bacon Ranch");

		jbtnCheese.addActionListener(this);
		jbtnPepperoni.addActionListener(this);
		jbtnHawaiian.addActionListener(this);
		jbtnDeluxe.addActionListener(this);
		jbtnBBQ.addActionListener(this);
		jbtnVeggie.addActionListener(this);
		jbtnMeat.addActionListener(this);
		jbtnSpinach.addActionListener(this);
		jbtnRanch.addActionListener(this);

		jfrm.add(jbtnCheese);
		jfrm.add(jbtnPepperoni);
		jfrm.add(jbtnHawaiian);
		jfrm.add(jbtnDeluxe);
		jfrm.add(jbtnBBQ);
		jfrm.add(jbtnVeggie);
		jfrm.add(jbtnMeat);
		jfrm.add(jbtnSpinach);
		jfrm.add(jbtnRanch);

		

		jfrm.add(jlab);

		jfrm.setVisible(true);
	}

	// display user selection
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("Classic Cheese"))
			jlab.setText("You ordered Classic Cheese.");
		if(ae.getActionCommand().equals("Ultimate Pepperoni"))
			jlab.setText("You ordered Ultimate Pepperoni.");
		if(ae.getActionCommand().equals("Honolulu Hawaiian"))
			jlab.setText("You ordered Honolulu Hawaiian.");
		if(ae.getActionCommand().equals("Deluxe"))
			jlab.setText("You ordered Deluxe.");
		if(ae.getActionCommand().equals("Memphis BBQ Chicken"))
			jlab.setText("You ordered Memphis BBQ Chicken.");
		if(ae.getActionCommand().equals("Pacific Veggie"))
			jlab.setText("You ordered Pacific Veggie.");
		if(ae.getActionCommand().equals("MeatZZa"))
			jlab.setText("You ordered MeatZZa.");
		if(ae.getActionCommand().equals("Spinach & Feta"))
			jlab.setText("You ordered Spinach & Feta.");
		if(ae.getActionCommand().equals("Cali Chicken Bacon Ranch"))
			jlab.setText("You ordered Cali Chicken Bacon Ranch.");
	}
}
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Menu();
			}
		});
	}

/*
public class Order{
	public static void main(String args[]) {
		System.out.println("hey");
	}
}
*/
