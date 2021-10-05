package edu.wit.cs.comp1000;

import java.util.Random;
import java.util.Scanner; 
//TODO: document this class
public class PA4b {

	// TODO: document this method
	public static void main(String[] args) {
		
		//////////////////////////////////////////////////////////////////////////////
		// DO NOT CHANGE IN FINAL SUBMISSION
		//////////////////////////////////////////////////////////////////////////////
		
		Long seed;
		if (args.length != 1) {
			seed = null; // you can temporarily change this to assist in debugging
			             // the value must end in L, such as 1070L
		} else {
			seed = Long.valueOf(args[0]);
		}
		
		// Gets a random number between 1 and 100
		// Use the target variable as the correct answer for guessing
		Random random;
		if (seed == null) {
			random = new Random();
		} else {
			random = new Random(seed);
		}
		int target = (Math.abs(random.nextInt()) % 100) + 1;
		
		//////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////
		
		// It might be useful to see the correct answer
		// TODO: delete this line before attempting unit tests or submitting work
		
		// TODO: write your code here
		Scanner scnr = new Scanner(System.in);
		int i = 0;
		
		while(i == 0) {
			System.out.print("Enter your guess (between 1 and 100): ");
			int guess = scnr.nextInt();
			
			if ((guess > 0)&&(guess < 101)) {
				if (guess < target) {
					System.out.println("Too low!");
				}
				else if (guess > target) {
					System.out.println("Too high!");
				}
				else if (guess == target) {
					System.out.println("You win!");
					System.exit(0);
				}
			}
			else {
				System.out.println("Invalid guess, try again!");
			}
		
		
	}
}
}

/*
 * Enter your guess (between 1 and 100): 50
Too high!
Enter your guess (between 1 and 100): 0
Invalid guess, try again!
Enter your guess (between 1 and 100): 101
Invalid guess, try again!
Enter your guess (between 1 and 100): 25
Too high!
Enter your guess (between 1 and 100): 12
Too high!
Enter your guess (between 1 and 100): 6
Too high!
Enter your guess (between 1 and 100): 3
Too low!
Enter your guess (between 1 and 100): 4
Too low!
Enter your guess (between 1 and 100): 5
You win!
 */

