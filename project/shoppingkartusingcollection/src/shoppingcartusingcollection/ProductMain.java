package shoppingcartusingcollection;

import java.util.Scanner;

public class ProductMain {
	
	//This method contains all the Admin related operations
		public static void adminPanel()
		{
			//Declaring variables
			int choice;
			Scanner sc = new Scanner (System.in);
			do
			{
				System.out.println("Enter 1. For adding a Product\n" + "Enter 2. For Upating product details using Id\n"
						+ "Enter 3. For displaying a product details using Id\n" + "Enter 4. For deleting a product using Id\n"
						+ "Enter 5. For displaying all the product\n" + "Enter 6. For deleting all the products\n"
						+ "Enter 7. For displaying all the placed order details \n"
						+ "Enter 8. To go back to the Main menu \n");

				System.out.println("=======================================================================================");
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
				System.out.println(" ");
				System.out.println("=======================================================================================");


				switch (choice) {

				case 1:
					ProductService.addProduct();
					System.out.println("=======================================================================================");
					break;

				case 2:
					System.out.println("Enter Id to update: ");
					int Id = sc.nextInt();
					try
					{
					ProductService.updateProductById(Id);
					}
					catch(GlobalExceptionForProduct e)
					{
					System.out.println(e.getMessage());
					}
					System.out.println("=======================================================================================");
					break;

				
				 case 3: 
					 System.out.println("Enter Id to display product: ");
					 int id = sc.nextInt();
					 try
						{
						ProductService.getProductById(id);
						}
						catch(GlobalExceptionForProduct e)
						{
						System.out.println(e.getMessage());
						}
					 System.out.println("=======================================================================================");
						break;
				
				  
				  case 4: 
					  System.out.println("Enter Id to delete product: ");
						 int id1 = sc.nextInt();
						 try
							{
							ProductService.getProductById(id1);
							}
							catch(GlobalExceptionForProduct e)
							{
							System.out.println(e.getMessage());
							}
					 System.out.println("=======================================================================================");
							break;
					
				 case 5:
					  System.out.println("All the added products are mentioned below: ");
					  System.out.println(" ");
					  ProductService.displayAllProduct();
					  System.out.println("=======================================================================================");
							break;
				   
				 case 6: 
					  ProductService.deleteAllProduct();
					  System.out.println("=======================================================================================");
							break;
					 
				 case 7: 
						try {
							ProductService.displayAllOrder();
						} catch (GlobalExceptionForProduct e) {
							System.out.println(e.getMessage());
						}
						System.out.println(
								"=======================================================================================");
						break;
					 			
							
				 case 8:
					 ShoppingCartArrayListOperation.mainMenu();
					;
				default:
					System.out.println("Please enter a correct choice from the menu!  ");
				}
			}
			while(choice!=8);
			
		}
		
		//This method contains all the User related operations
		
		public static void userPanel()
		{
			//Declaring variable
			int choice;
			Scanner sc = new Scanner (System.in);
			do
			{
				System.out.println("Enter 1. For searching a product using Id\n" 
						+ "Enter 2. To order a product \n" + "Enter 3. To cancel an order using Id \n" 
						+ "Enter 4. To go back to the Main menu \n");

				System.out.println("=======================================================================================");
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
				System.out.println("=======================================================================================");


				switch (choice) {

			    case 1: 
					 System.out.println("Enter Id to display product: ");
					 int id = sc.nextInt();
					 try
						{
						ProductService.getProductById(id);
						}
						catch(GlobalExceptionForProduct e)
						{
						System.out.println(e.getMessage());
						}
					 System.out.println("=======================================================================================");
						break;						
							
				 case 2:
					 ProductService.orderProduct ();
					 System.out.println("=======================================================================================");
						    break;
						    
				 case 3:
					 System.out.println("Enter Id to cancel an order: ");
					 int id2 = sc.nextInt();
					 try
						{
						ProductService.cancelOrderById(id2);
						}
						catch(GlobalExceptionForProduct e)
						{
						System.out.println(e.getMessage());
						}
				 System.out.println("=======================================================================================");
						break;
					 
				 case 4:
					ShoppingCartArrayListOperation.mainMenu();
					;
				default:
					System.out.println("Please enter a correct choice from the menu!  ");
				}
			}
			while(choice!=4);
			
		}

}
