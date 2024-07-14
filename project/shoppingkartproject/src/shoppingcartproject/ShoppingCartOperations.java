package shoppingcartproject;

import java.util.Scanner;



public class ShoppingCartOperations {

	static Scanner sc = new Scanner(System.in);
	
	//This method contains all admin and user operations
		
		public static void AllMenus() {

			int choice;
			while(true){

				System.out.println("=======================================================================================");
				System.out.println("Press 1.For Admin Panel\nPress 2.For User Panel\nPress 3.Tor Quit");
				System.out.println("Enter your choice: ");
				System.out.println("=======================================================================================");
				choice = sc.nextInt();
				switch (choice) {

				case 1:
					Menu.adminPanel();
					break;
				case 2:
					Menu.userPanel();
					break;
					
				case 3:System.exit(0);				

				default:
					System.out.println("Please enter a correct choice from menu!");

				}

			} 
		
		}
	
}
