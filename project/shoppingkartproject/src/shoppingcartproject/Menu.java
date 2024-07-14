package shoppingcartproject;

import java.util.Scanner;

//This class contain admin and user choice

public class Menu {
	
	static Scanner sc = new Scanner(System.in);

	//This method contains all admin options
	public static void adminPanel() {
		int choice;
		while(true)
		{
		System.out.println("Enter 1. For adding a Product\n" + "Enter 2. For Upating product details\n"
				+ "Enter 3. For deleting a product details using Id\n" + "Enter 4. For displaying all product details\n"
				+ "Enter 5. For displaying product by Id\n" + "Enter 6. For displaying all Orders\n"
				+ "Enter 7. To go back to the Main menu \n");

		System.out.println("=======================================================================================");
		choice = sc.nextInt();

		switch (choice) {

		case 1:
			ProductService.createProduct();
			System.out.println("=======================================================================================");
			break;

		case 2:
			ProductService.updateProductByid();
			System.out.println("=======================================================================================");
			break;

		case 3:
			ProductService.deleteProductById();
			System.out.println("=======================================================================================");
			break;

		case 4:
			ProductService.getAllProduct();
			System.out.println("=======================================================================================");
			break;

		case 5:
			ProductService.getProductById();
			System.out.println("=======================================================================================");
			break;

		case 6:
			ProductService.showAllOrder();
			;
			System.out.println("=======================================================================================");
			break;

		case 7:
			ShoppingCartOperations.AllMenus();
			;
		default:
			System.out.println("Please enter a correct choice from menu!");
		}
		}
	}
//This method contains all user options
	public static void userPanel() {

		int choice;
		while(true)
		{
		System.out.println("Enter 1. For searching a product\n" + "Enter 2. For booking a product\n"
				+ "Enter 3. For cancelling a product\n" + "Enter 4. To return to the Main menu \n");
		System.out.println("=======================================================================================");
		choice = sc.nextInt();

		switch (choice) {

		case 1:
			ProductService.getProductById();
			System.out.println("=======================================================================================");
			break;

		case 2:
			ProductService.bookProduct();
			System.out.println("=======================================================================================");
			break;

		case 3:
			ProductService.Cancelorder();
			System.out
					.println("=======================================================================================");
			break;

		case 4:
			ShoppingCartOperations.AllMenus();

		default:
			System.out.println("Please enter a correct choice from the menu! ");

		}
		}
	}

}
