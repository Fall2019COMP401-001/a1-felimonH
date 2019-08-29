package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
// Your code follows here.
	
		
		
			

		
//base array for holding info which will be printed
		
	
		
		
		
//actual over lord loop
		int peopleAmount = scan.nextInt();
		
		for (int i = 0; i < peopleAmount; i++) {

	// store first name
			
			String first = scan.next();
			
	// store last name
			
			String last = scan.next();
			
	//first initial loop
			
			 char firstI = first.charAt(0);
			
		
		
		// create smaller loop per amount of items 
			
			// store first number which is amount 
			 int itemsPerPer = scan.nextInt();
			 
			 	// create value to store overall cost 
			 
			 double cost = 0;
			 
			 for (int p = 0; p < itemsPerPer; p++) {
				
				 // amount of item
				int itemAmount = scan.nextInt();
				 	//disregard name of item
				String disregard = scan.next();
				 	// get cost and multiply
				double itemCost = scan.nextDouble();
				
				 cost = cost + itemCost * itemAmount;
				 
			 }
			// thing that prints 
			 
			 System.out.println(firstI + ". " + last + ": " + String.format("%.2f", cost));
		}
	}
}
