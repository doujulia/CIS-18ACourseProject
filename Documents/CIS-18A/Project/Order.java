/*
Course Project Option 1
Enables users to place an order at Domino’s Pizza and set a delivery date and time within a one-year span to receive the meal 
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Pizza implements ActionListener {
	JLabel jlabMenu;
	JLabel jlabSize;


	Pizza() {

		// create a window for menu 
		JFrame jfrmMenu = new JFrame("Welcome to Domino's!");

		jfrmMenu.setLayout(new FlowLayout());

		jfrmMenu.setSize(1500, 150);
		
		jfrmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		// create buttons for sizing options
		jlabSize = new JLabel("Pick a size.");

		JButton jbtnSmall = new JButton("Small");
		JButton jbtnMedium = new JButton("Medium");
		JButton jbtnLarge = new JButton("Large");

		jbtnSmall.addActionListener(this);
		jbtnMedium.addActionListener(this);
		jbtnLarge.addActionListener(this);

		jfrmMenu.add(jbtnSmall);
		jfrmMenu.add(jbtnMedium);
		jfrmMenu.add(jbtnLarge);
		
		jfrmMenu.add(jlabSize);

		jfrmMenu.setVisible(true);


		// create buttons for menu options
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
			jlabSize.setText("You ordered size Small.\n");
		if(ae.getActionCommand().equals("Medium"))
			jlabSize.setText("You ordered size Medium.\n");
		if(ae.getActionCommand().equals("Large"))
			jlabSize.setText("You ordered size Large.\n");
	}

}

 


class Menu {
	// constructor for the menu, includes pizza flavors and sizes
	public String flavor;
	public String size;

	public Menu(String f, String s) {
		flavor = f;
		size = s;
	}

    public void show() {
        System.out.println(flavor);
        System.out.println(size);
        System.out.println();
    }
}


// run the program and order pizza!
public class Order extends Pizza {
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Pizza();
			}
		});


		// print pizzeria name
		int CorrectMenuName = 2;
		String MenuName;
		switch (CorrectMenuName) {
			case 1: MenuName = "Papa John's Pizza Menu:\n";
					break;
			case 2: MenuName = "Domino's Pizza Menu:\n";
					break;
			case 3: MenuName = "Bongiorno's Pizza Menu:\n";
					break;
			case 4: MenuName = "Pieology Pizzeria Menu:\n";
					break;
			case 5: MenuName = "PizzaRev Menu:\n";
					break;
			default: MenuName = "This is not a pizza restaurant.\n";
					break;
		}
		System.out.println(MenuName);


		// construct the menu, includes pizza flavors and sizes
		Menu options [] = new Menu[9];
		options[0] = new Menu("Classic Cheese", "Small, Medium, Large");
		options[1] = new Menu("Ultimate Pepperoni", "Small, Medium, Large");
		options[2] = new Menu("Honolulu Hawaiian", "Small, Medium, Large");
		options[3] = new Menu("Deluxe", "Small, Medium, Large");
		options[4] = new Menu("Memphis BBQ Chicken", "Small, Medium, Large");
		options[5] = new Menu("Pacific Veggie", "Small, Medium, Large");
		options[6] = new Menu("MeatZZa", "Small, Medium, Large");
		options[7] = new Menu("Spinach & Feta", "Small, Medium, Large");
		options[8] = new Menu("Cali Chicken Bacon Ranch", "Small, Medium, Large");

		for (int i = 0; i < options.length; i++) options[i].show();

	}

}



