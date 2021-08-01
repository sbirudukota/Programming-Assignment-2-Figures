/*Sravani Birudukota
 Programming Fundamentals
 Summer 
Programming Assignment 2 – Figures
*/
import java.util.Scanner;
public class Figures {

	public static void main(String[] args) {

		int size, option;    				  //declare variables 

		Scanner sc = new Scanner(System.in);  //Create scanner object
		System.out.println("Enter the size of the figure (odd number):");
		size = sc.nextInt();
		while (size % 2 == 0) {    			  //check for odd or not      
			System.out.println("\nInvalid figure size - must be an odd number");
			System.out.println("\nRenter the size of the figure:");
			size = sc.nextInt();              //if even then Renter
		}
		
		
		do {
			System.out.println("\nMENU: \n1.Print Box \n2.Print diamond \n3.Print X \n4.Quit Program");
			System.out.println("\nPlease select an option:");
			option = sc.nextInt();			  //create scanner object to select options in menu
			
			switch (option) {
			case 1:
				printBox(size);        		  //method calling 
				break;
			case 2:
				printDiamond(size);
				break;
			case 3:
				printx(size);
				break;
			case 4:
				quit();
				break;
			default:
				System.out.println("Invalid option"); //display invalid if user enter none of the above options
			}

		} while (option != 4);

	}

	
	static void printBox(int size) {     	// Method to print the box
		int i, j;							// option 1 
		for (i = 1; i <= size; i++) {		
			for (j = 1; j <= size; j++) {
				System.out.print("X");
			}
			System.out.print("\n");
		}
	}

	
	static void printDiamond(int size) {	// Method to print the diamond
		int i, j, k;						// option 2
		size = size + 1;
		k = (size / 2);
		for (i = 1; i <= k; i++) {
			for (j = 1; j <= (k - i); j++) {
				System.out.print(" ");
			}
			if (i == 1) {
				System.out.print("XX");
			} else {
				System.out.print("X");

				for (j = 1; j <= 2 * i - 3; j++) {
					System.out.print(" ");
				}
				System.out.print("X");
			}
			System.out.print("\n");
		}
		for (i = k + 1; i < size; i++) {
			for (j = 1; j <= i - k; j++) {
				System.out.print(" ");
			}
			if (i == size - 1) {
				System.out.print("XX");
			} else {
				System.out.print("X");

				for (j = 1; j <= 2 * (size - i) - 3; j++) {

					System.out.print(" ");
				}
				System.out.print("X");
			}
			System.out.print("\n");
		}
	}

	
	static void printx(int size) {				// Method to print the X
		int i, j;								//option 3
		for (i = 1; i <= size; i++) {
			for (j = 1; j <= size; j++) {
				if (j == i) {
					System.out.print("X");
				} else if (j == size - (i - 1)) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println(" ");
		}
	}

	
	static void quit() {						// Method to quit
		System.out.println("\nGood bye!");		//option 4
		System.exit(0);
	}
}