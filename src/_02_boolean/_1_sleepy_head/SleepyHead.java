package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		// Write code to ask the user what day it is.
        	String dayOfTheWeek = JOptionPane.showInputDialog(null, "What day is it?");
		// Set the boolean isWeekend based on the value they enter
        	if (dayOfTheWeek.equalsIgnoreCase ("friday") | dayOfTheWeek.equalsIgnoreCase ("thursday") | dayOfTheWeek.equalsIgnoreCase ("wednesday") | dayOfTheWeek.equalsIgnoreCase ("tuesday") | dayOfTheWeek.equalsIgnoreCase ("monday")) {
				JOptionPane.showMessageDialog(null, "Get out of bed and go to school!");
			}else if (dayOfTheWeek.equalsIgnoreCase("Saturday") | dayOfTheWeek.equalsIgnoreCase ("sunday")) {
				JOptionPane.showInputDialog("You get to sleep in today!");
			}
			
		
		// If it is the weekend, tell the user they get to sleep in.
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
			String examScore = JOptionPane.showInputDialog("what percentage did you score on you score on your exam");
		
		// If they scored more than 70, they passed the exam.
			
				
			int examScore2 = Integer.parseInt(examScore);
			passedExam = examScore2 > 70;
			if (passedExam) {
				JOptionPane.showMessageDialog(null, "Hooray! You passed the exam");
			}else {
				JOptionPane.showMessageDialog(null, "I hope you do better next time!");
			}
		// Set the boolean passedExam based on their score.
			
		// If the user passed the exam, congratulate them
		
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
						String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		JOptionPane.showMessageDialog(null, "Game Over");
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String RedBlue = JOptionPane.showInputDialog("which color should I draw with, red or blue?");
		 isRed = RedBlue.equalsIgnoreCase("red");
		boolean isSquare;	
		String squareRectangle = JOptionPane.showInputDialog("which shape should I draw, square or triangle?");
		isSquare = squareRectangle.equalsIgnoreCase("square");
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		
		
		// Now you MUST use the && operator to join the booleans for this code. 
		if (isSquare && isRed) {
			drawRedSquare();
		}else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't know how to draw that shape.");
		}
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		rob.penDown();
		rob.setPenColor(255, 0, 0);
		rob.setSpeed(60);
		for (int i = 0; i < 4; i++) {
			rob.move(50);
			rob.turn(90);
		}
		rob.penUp();
		rob.move(2000);
		
		// Complete the rest of this method
	}	
}
