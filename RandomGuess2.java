/* Filename: RandomGuess.java
	Author: Amit
	date: 7.23/19

	Program that asks user to think of a number between 1 and 10.  Program
	will randomly generate a number within that range and show results to user.*/



import javax.swing.JOptionPane;

public class RandomGuess2
{
	public static void main(String[] args)
	{
		// Variables and Constants
		int x;
		int y;
		
		// Input phase
		y = Integer.parseInt(JOptionPane.showInputDialog(null, "Please think of a number between 1 and 10."));

		// Calculation phase
		x = (1 + (int)(Math.random() * 10));

		// Output phase
		if (x == y)
		{
			JOptionPane.showMessageDialog(null, "You are correct!");
		} else if (x > y)
		{
			JOptionPane.showMessageDialog(null, "You guessed too low!");
		} else if (x < y)
		{
			JOptionPane.showMessageDialog(null, "You guessed too high!");
		}

		return;
	}
}