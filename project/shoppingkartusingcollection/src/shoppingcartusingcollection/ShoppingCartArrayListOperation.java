package shoppingcartusingcollection;

import java.util.Scanner;

public class ShoppingCartArrayListOperation {
	
	
static Scanner sc = new Scanner(System.in);
	
	//This method contains all admin and user operations
		
		public static void mainMenu() {

			int choice;
			while(true){

				System.out.println("=======================================================================================");
				System.out.println("Press 1.For Admin Panel\nPress 2.For User Panel\nPress 3.To Quit");
				System.out.println(" ");
				System.out.println("Enter your choice: ");
				System.out.println("=======================================================================================");
				choice = sc.nextInt();
				switch (choice) {

				case 1:
					ProductMain.adminPanel();
					break;
				case 2:
					ProductMain.userPanel();
					break;
					
				case 3:System.exit(0);				

				default:
					System.out.println("Please enter a correct choice from menu!");

				}

			} 
		
		}

}
