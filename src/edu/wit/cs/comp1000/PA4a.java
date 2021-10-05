package edu.wit.cs.comp1000;
import java.util.Scanner;
/*
 * Calculate the inflation rate
 * 
 * @author Hector Padilla
 * @date 10/11/19
 */
//TODO: document this class
public class PA4a {
	private static Scanner scnr;

	// TODO: document this method
	public static void main(String[] args) {
		// TODO: write your code here
		scnr = new Scanner(System.in);
		
		System.out.print("Enter the current price of the item: $");
		double crntPrice = scnr.nextDouble();
		
		System.out.print("Enter the number of years: ");
		int numYears = scnr.nextInt();
		
		System.out.print("Enter the inflation rate as a percentage: ");
		double infRate = scnr.nextDouble();
		
		if (crntPrice < 0) {
			System.out.println("The current price must be at least 0!");
			System.exit(0);
		}
		if (numYears < 0) {
			System.out.println("The number of years must be at least 0!");
			System.exit(0);
		}
		if (infRate < 0) {
			System.out.println("The inflation rate must be at least 0!");
			System.exit(0);
		}
		
		int yearCounter = 0;
		infRate = infRate / 100;
		
		while (yearCounter < numYears) {
			crntPrice = crntPrice * (1+ infRate);
			yearCounter = yearCounter + 1;
		}
		
		if (numYears == 1) {
			System.out.printf("After %d year, the price will be $%.2f%n", numYears, crntPrice);
		}
		else {
			System.out.printf("After %d years, the price will be $%.2f%n", numYears, crntPrice);
		}
		
	}

}
/*Enter the current price of the item: $10
Enter the number of years: 3
Enter the inflation rate as a percentage: 10
After 3 years, the price will be $13.31
*/

