/*
Course Project Option 1
Enables users to place an order at Domino’s Pizza and set a delivery date and time within a one-year span to receive the meal 
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pizza implements ActionListener {
	JLabel jlabMenu;
	JLabel jlabSize;

	Pizza() {

		// window for menu 
		JFrame jfrmMenu = new JFrame("Welcome to Domino's!");

		jfrmMenu.setLayout(new FlowLayout());

		jfrmMenu.setSize(1500, 90);
		
		jfrmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		// buttons for menu options
		jlabMenu = new JLabel("Pick a pizza.");

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

		jfrmMenu.add(jbtnCheese);
		jfrmMenu.add(jbtnPepperoni);
		jfrmMenu.add(jbtnHawaiian);
		jfrmMenu.add(jbtnDeluxe);
		jfrmMenu.add(jbtnBBQ);
		jfrmMenu.add(jbtnVeggie);
		jfrmMenu.add(jbtnMeat);
		jfrmMenu.add(jbtnSpinach);
		jfrmMenu.add(jbtnRanch);

		jfrmMenu.add(jlabMenu);

		jfrmMenu.setVisible(true);


		// window for size
		JFrame jfrmSize = new JFrame("Welcome to Domino's!");

		jfrmSize.setLayout(new FlowLayout());

		jfrmSize.setSize(1500, 90);
		
		jfrmSize.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		// buttons foor size
		jlabSize = new JLabel("Pick a size.");

		JButton jbtnSmall = new JButton("Small");
		JButton jbtnMedium = new JButton("Medium");
		JButton jbtnLarge = new JButton("Large");

		jbtnSmall.addActionListener(this);
		jbtnMedium.addActionListener(this);
		jbtnLarge.addActionListener(this);

		jfrmSize.add(jbtnSmall);
		jfrmSize.add(jbtnMedium);
		jfrmSize.add(jbtnLarge);
		

		jfrmSize.add(jlabSize);

		jfrmSize.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		// display user selection for menu
		if(ae.getActionCommand().equals("Classic Cheese"))
			jlabMenu.setText("You ordered Classic Cheese.");
		if(ae.getActionCommand().equals("Ultimate Pepperoni"))
			jlabMenu.setText("You ordered Ultimate Pepperoni.");
		if(ae.getActionCommand().equals("Honolulu Hawaiian"))
			jlabMenu.setText("You ordered Honolulu Hawaiian.");
		if(ae.getActionCommand().equals("Deluxe"))
			jlabMenu.setText("You ordered Deluxe.");
		if(ae.getActionCommand().equals("Memphis BBQ Chicken"))
			jlabMenu.setText("You ordered Memphis BBQ Chicken.");
		if(ae.getActionCommand().equals("Pacific Veggie"))
			jlabMenu.setText("You ordered Pacific Veggie.");
		if(ae.getActionCommand().equals("MeatZZa"))
			jlabMenu.setText("You ordered MeatZZa.");
		if(ae.getActionCommand().equals("Spinach & Feta"))
			jlabMenu.setText("You ordered Spinach & Feta.");
		if(ae.getActionCommand().equals("Cali Chicken Bacon Ranch"))
			jlabMenu.setText("You ordered Cali Chicken Bacon Ranch.");

		// display user selection for size
		if(ae.getActionCommand().equals("Small"))
			jlabSize.setText("You ordered Small.");
		if(ae.getActionCommand().equals("Medium"))
			jlabSize.setText("You ordered Medium.");
		if(ae.getActionCommand().equals("Large"))
			jlabSize.setText("You ordered Large.");
	}


}

public class Order {
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Pizza();
			}
		});


	}


}



