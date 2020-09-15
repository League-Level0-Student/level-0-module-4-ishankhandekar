package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {
		int pennies;
		int nickles;
		int dimes;
		int quarters;
		int dollars;
		int calculation;
		int remander;

		pennies = Integer.parseInt(JOptionPane.showInputDialog("How many pennies do you have?"));
		// Ask the user how many nickels they have
		nickles = Integer.parseInt(JOptionPane.showInputDialog("How many nickles do you have?"));
		// Convert their answer to an int. Hint: Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer
		dimes = Integer.parseInt(JOptionPane.showInputDialog("How many dimes do you have?"));
		// Ask the user how many quarters they have, and convert their answer
		quarters = Integer.parseInt(JOptionPane.showInputDialog("How many quarters do you have?"));
		// Calculate how much money the user has. Hint: Use a double variable
		dollars = Integer.parseInt(JOptionPane.showInputDialog("How many dollar bills do you have?"));
		nickles = nickles * 5;
		dimes = dimes * 10;
		quarters = quarters * 25;
		calculation = nickles + dimes + pennies + quarters;
		remander = calculation % 100;
		calculation = calculation / 100;
		calculation = calculation + dollars;
		JOptionPane.showMessageDialog(null, "you have $" + calculation + "." + remander);
		// Tell the user how much money they have in dollars and cents format (e.g.
		// $6.75)

	}
}
