// First import the Scanner class from the java.util package
import java.util.Scanner;

public class TruckLoader {

	public static void main(String[] args) {
		
		// Creating a Scanner object
		Scanner scan = new Scanner(System.in);
		
		// Welcome message
		System.out.println("\t\t\tWelcome to Truck Loader!");
		
		// Design work
		System.out.println("=====================================================================");
		
		// Asking the user to input maximum number of boxes
		System.out.print("What is the maximum number of boxes that can fit inside the truck? ");
		
		// Inputting the maximum number of boxes 
		int max = scan.nextInt();
		
		// Design work
		System.out.println("=====================================================================");
		
		// Creating 3 arrays for customer name, weight of box, and if it is dangerous, or not
		String name[] = new String[max];
		float weight[] = new float[max];
		boolean dangerousornot[] = new boolean[max];
		
		// Loop to enter details into each array. Allowing users to enter 0 as the maximum number too.
		for (int i = 0; i < max ; i++) {
			// Box number will be equal to i+1 
			
			// Asking the user to input customer name for this box
			System.out.print("Please enter the customer name for box "+ (i+1)+ ": ");
			String nameofcustomer = scan.next();
			// Storing the name of the customer in the 'name' array by it's index
			name[i] = nameofcustomer;
			
			// Asking the user to input weight of the box
			System.out.print("Please enter the weight(kg) for box "+ (i+1)+ ": ");
			float weightofbox = scan.nextFloat();
			// Storing the weight of the box in the 'weight' array by it's index
			weight[i] = weightofbox;
			
			// In the above two cases, if anything other than String or float number,
			// is entered, the IDE will automatically raise an error.
			// But when storing the cases when it is dangerous or not, some users,
			// may venture outside of y/n restrictions and put Y/N or any other letter.
			// All cases have been considered below.
			
			boolean error = true;
			while (error) {
			System.out.print("Does box "+ (i+1)+ " contain dangerous goods (y/n)? ");
			String isdangerous = scan.next();
			
			// Accepting both y and Y as yes
			if ((isdangerous.equals("y")) || (isdangerous.equals("Y")) ) {
				dangerousornot[i] = true;
				error = false;
			}
			
			// Accepting both n and N as no
			else if ((isdangerous.equals("n")) || (isdangerous.equals("N")) ) {
				dangerousornot[i] = false;
				error = false;
			}
			
			// All other entries are wrong. User has to input again :-(
			else {
				System.out.println("Error. Enter only y/n. Try again.");
				error = true;
			}}
			
			// Design work to separate each box's entry
			System.out.println("=====================================================================");
		}
		
		// Declaring that all the information has been entered into the database
		System.out.println("\tAll the information regarding the boxes has been entered.");
		System.out.println("=====================================================================");
		
		// Keeps the menu looping until it quits
		boolean notquit = true;
		while (notquit) {
			
		System.out.println("Options:");
		System.out.println("(a) List all boxes' information.");
		System.out.println("(c) Search boxes by customer name.");
		System.out.println("(d) Search boxes by dangerous cargo.");
		System.out.println("(q) Quit the application.\n");
		
		System.out.print("Enter the letter preceding the option to continue: ");
		String option = scan.next();
		System.out.println("=====================================================================");
		if ((option.equals("a")) || (option.equals("A"))) {
			for (int i = 0; i < max ; i++) {
				System.out.println("Box "+(i+1)+ " details: ");
				System.out.println("Customer name: " + name[i]);
				System.out.println("Weight (kg): "+ weight[i]);
				if (dangerousornot[i] == true) {
					System.out.println("Nature of goods: Dangerous");
				}
				else {
					System.out.println("Nature of goods: Non Dangerous");
				}
				
				// Design work
				if (i == max - 1) {
					System.out.println("=====================================================================");
				}
				else {
				System.out.println("*********************************************************************");
				}
			}
			
		}
		// Searching by customer name
		else if ((option.equals("c")) || (option.equals("C"))) {
			System.out.print("Enter the customer name: ");
			String customername = scan.next();
			for (int i = 0; i < max; i++) {
				if (customername.equalsIgnoreCase(name[i])){
					System.out.println("Box "+(i+1)+ " is for "+ customername + " and the details are: ");
					System.out.println("Weight (kg): "+ weight[i]);
					if (dangerousornot[i] == true) {
						System.out.println("Nature of goods: Dangerous");
					}
					else {
						System.out.println("Nature of goods: Non Dangerous");
					}
					
					// Design work
					if (i == max - 1) {
						System.out.println("=====================================================================");
					}
					else {
					System.out.println("*********************************************************************");
					}
					
				}
			}
			
		}
		// Search by Dangerous or Non-Dangerous goods
		else if ((option.equals("d")) || (option.equals("D"))) {
			System.out.print("Are you searching for dangerous or non-dangerous goods? (d/n) ");
			String nord = scan.next();
			System.out.println("=====================================================================");
			if (nord.equalsIgnoreCase("d")) {
				for (int i = 0; i < max; i++) {
					if (dangerousornot[i] == true){
						System.out.println("Box "+(i+1)+ " has what you are looking for and the details are: ");
						System.out.println("Customer name: "+ name[i]);
						System.out.println("Weight (kg): "+ weight[i]);
						
						// Design work
						if (i == max - 1) {
							System.out.println("=====================================================================");
						}
						else {
						System.out.println("*********************************************************************");
						}
						
					}
				}

			}
			else if (nord.equalsIgnoreCase("n")) {
				for (int i = 0; i < max; i++) {
					if (dangerousornot[i] == false){
						System.out.println("Box "+(i+1)+ " has what you are looking for and the details are: ");
						System.out.println("Customer name: "+ name[i]);
						System.out.println("Weight (kg): "+ weight[i]);
						
						// Design work
						if (i == max - 1) {
							System.out.println("=====================================================================");
						}
						else {
						System.out.println("*********************************************************************");
						}
						
					}
				}

			}
			
		}
		// Quit the application
		else if ((option.equals("q")) || (option.equals("Q"))) {
			System.out.println("Thank you for using Truck Loader. Have a great day!");
			notquit = false;
		}
		// Retry with the options given above
		else {
			System.out.println("Error. Enter only the options given. Try again.");
		}
		
		}
			
	}

}


