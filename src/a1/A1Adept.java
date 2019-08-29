package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		// Your code follows here.
		
// first scan for the first number
	int storeItems = scan.nextInt();

		// use number to build 2 arrays one for cost and type in a for loop
	double[] cost = new double[storeItems];
	String[] types = new String[storeItems];	
	 double average = 0;
		for (int i = 0; i < storeItems; i++) {
			types[i] = scan.next();
			cost[i] = scan.nextDouble();
		}
// get amount of names
		int people = scan.nextInt();
		
		// build array that stores name and their amount 
		String[] names = new String[people];
		double[] debt = new double[people];
//  build for loop based on amount 
		for (int i = 0; i < people; i++) {
			
		
		// get names
			String first = scan.next();
			String last = scan.next();
			names[i] = first + " " + last;
			
		//get number of items bought 
			int itemsPerPer = scan.nextInt();
		// for loop counting items bought and type
			for (int p = 0; p < itemsPerPer; p++ ) {
				
			
			// get items bought number
				int amount = scan.nextInt();
				
			//get item name
				String itemName = scan.next();
				 	
			//loop that looks for type food array based on recieve named and matches it
				for (int d = 0; d < storeItems; d++) {
					if (itemName.equals(types[d])) {
						debt[i] = debt[i] + amount * cost[d];
					}
				}
			}
			//average
			
			 average = debt[i] + average;
			
		}	
// meet other conditions
		//largest
		String largestPer = null;
		double largestNum = 0;
		for (int i = 0; i < people; i++) {
			if (largestNum < debt[i]) {
				largestNum = debt[i];
				largestPer = names[i];
			}
			
		}
		
		//smallest
		String smallestPer = null;
		double smallestNum = 900;
		for (int i = 0; i < people; i++) {
			if (smallestNum > debt[i]) {
				smallestNum = debt[i];
				smallestPer = names[i];
			}
			
		}
		// average debt
				average = average / people;
				
				//print
		System.out.println("Biggest: " + largestPer + " (" + (String.format("%.2f", largestNum)) + ")");
		System.out.println("Smallest: " + smallestPer + " (" + (String.format("%.2f", smallestNum)) + ")");
		System.out.println("Average: " + (String.format("%.2f", average)));
		
		
	}
}
