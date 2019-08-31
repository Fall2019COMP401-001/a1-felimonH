package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
//same code except need to save amount of people who bought and how much of what they bought
		
// scan store items
int storeItems = scan.nextInt();
		
// build array to store the items of the store type, bought and amount
String[] types = new String[storeItems];
int[] sold = new int[storeItems];
int[] customers = new int[storeItems];

//mishap variable list  for those dumb people who write the name more than once
int[] mishap = new int[storeItems];


	//trash array for cost
	double[] cost = new double[storeItems];

// build loop that stores items and disregard cost
for (int i = 0; i < storeItems; i++) {
	types[i] = scan.next();
	sold[i] = 0;
	customers[i] = 0;
	mishap[i] = 0;
	//trash scan for cost
	cost[i] = scan.nextDouble();
}	
//store amount of people number
int people = scan.nextInt();

//create loop that disregards name gets number of items per person and 

//mishap loop
for (int i = 0; i < people; i++) {
	for (int d = 0; d < storeItems; d++) {
		mishap[d] = i - 1;
	}
	
	// get names to disregard
		String first = scan.next();
		String last = scan.next();
		
	//get number of items bought 
		int itemsPerPer = scan.nextInt();
		
	// for loop counting items bought and type
		for (int p = 0; p < itemsPerPer; p++ ) {
		
		// get items bought number
			int amount = scan.nextInt();
			
		//get item name
			String itemName = scan.next();
		
			 	
		//loop that scan amount of food and food item type and stores it
			for (int d = 0; d < storeItems; d++) {
				
				if (itemName.equals(types[d])) {
					sold[d] = sold[d] + amount;
					
					mishap[d]++;
					if (mishap[d] == i) {
					customers[d] = customers[d] + 1;
					}
				}
				
			} 
		}
} 
		

		
//create loop that prints amount and  include if their is a zero 
for (int i = 0; i < storeItems; i++) {
	if (customers[i] == 0) {
		System.out.println("No customers bought " + types[i]);
	} else {
System.out.println( customers[i] + " customers bought " + sold[i] + " " + types[i]);
	}
}
	}
	
}
