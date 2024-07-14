package shoppingcartproject;

import java.util.Scanner;

//This class is responsible for all the operations

public class ProductService {
	
	//This is the product array of type product class, will store product details
		static Product product[] = new Product[10];
	//This is the Order array of type OrderDetails class, will store order details	
		static OrderDetails order[] = new OrderDetails[10];
		static Scanner sc = new Scanner(System.in);
		static int index = 0;
		static int orderIndex = 0;
		static int orderId = 1;

		// this method is responsible to add product in the array
		static void createProduct() {
			System.out.println("Enter Product Id: ");
			int id = sc.nextInt();

			sc.nextLine();// It will consume the delimiter

			System.out.println("Enter Product Name: ");
			String name = sc.nextLine();

			System.out.println("Enter Product Brand: ");
			String brand = sc.nextLine();

			System.out.println("Enter Product price: ");
			double price = sc.nextInt();

			System.out.println("Enter Stock: ");
			int quantity = sc.nextInt();

			// will insert in an array
			product[index] = new Product(id, name, brand, price, quantity);
			index++;// 2
			System.out.println("Product has been added successfully!");
		}

		// This method is responsible to retrieve all product details
		static void getAllProduct() {
			for (int i = 0; i < index; i++) {
				System.out.println("Product id: " + product[i].getId());
				System.out.println("Product Name: " + product[i].getName());
				System.out.println("Product Brand: " + product[i].getBrand());
				System.out.println("Product price: " + product[i].getPrice());
				System.out.println("Product Stock: " + product[i].getQuantity());
				System.out.println("=======================================================================================");
			}
		}

		// This method is responsible to retrieve product details by id
		static void getProductById() {
			boolean f = false;
			System.out.println("Enter Id of the product to be searched for: ");
			int id = sc.nextInt();
			System.out.println("=======================================================================================");
			for (int i = 0; i < index; i++) {
				if (product[i].getId() == id) {
					System.out.println("Product id: " + product[i].getId());
					System.out.println("Product Name: " + product[i].getName());
					System.out.println("Product Brand: " + product[i].getBrand());
					System.out.println("Product price: " + product[i].getPrice());
					System.out.println("Product Stock: " + product[i].getQuantity());
					System.out.println("=======================================================================================");
					f = true;
					break;
				}
			}
			if (f == false) {
				System.out.println("Product Id not found!");
				System.out.println("=======================================================================================");
			}
		}

	//This method is responsible for booking the product
		static void bookProduct() {
			boolean f = false;
			sc.nextLine();
			System.out.println("Enter product name: ");
			String name = sc.nextLine();
			System.out.println("=======================================================================================");
			for (int i = 0; i < index; i++) {
				if (product[i].getName().equalsIgnoreCase(name)) {
					System.out.println("Product id: " + product[i].getId());
					System.out.println("Product Name: " + product[i].getName());
					System.out.println("Product Brand: " + product[i].getBrand());
					System.out.println("Product price: " + product[i].getPrice());

					if (product[i].getQuantity() < 0) {

						System.out.println("OOPS! This product is currently unavailable!");
						System.out.println("=======================================================================================");
					} else {
						System.out.println("Product Stock: " + product[i].getQuantity());
						System.out.println("=======================================================================================");
						f = true;
					}
				}
			}
			if (f == true) {
				System.out.println("Press 1 To go back to Main menu\nPress 2 To Continue Booking");
				int confirmation = sc.nextInt();
				if (confirmation == 1) {

					ShoppingCartOperations.AllMenus();

				} else if (confirmation == 2) {
					System.out.println("For booking the product, please enter product Id:");
					int id = sc.nextInt();

					for (int i = 0; i < index; i++) {
						if (product[i].getId() == id) {
							System.out.println("Enter quantity: ");
							int quantity = sc.nextInt();

							if (product[i].getQuantity() >= quantity) // 10>1
							{
								System.out.println("Your Booking has done successfully!");
								System.out.println("---------------------------------------------------------------------------------------------");
								double total = quantity * product[i].getPrice();
								System.out.println("Booking Details: ");
								System.out.println("Product Name: " + product[i].getName());
								System.out.println("Product Brand: " + product[i].getBrand());
								System.out.println("Product Quantity: " + quantity);
								System.out.println("Total amount: " + total);
								order[orderIndex] = new OrderDetails(name, product[i].getBrand(), quantity, orderId,
										product[i].getId(), total);
								orderIndex++;
								orderId++;
								// For display the remaining stock
								product[i].setQuantity(product[i].getQuantity() - quantity);

								break;
							}
						}
					}
				}
			} else
				System.out.println("OOPS! No such product found!");
		}

	//This method is responsible for displaying all the orders placed
		static void showAllOrder() {
			System.out.println("Order History: ");
			for (int i = 0; i < orderIndex; i++) {
				System.out.println("Product Name: " + order[i].getProductName());
				System.out.println("Product Brand: " + order[i].getBrand());
				System.out.println("Product Stock: " + order[i].getQuantity());
				System.out.println("Product price: " + order[i].getTotalAmount());
			}

		}

	//This method is responsible for updating product details by Id
		static void updateProductByid() {

			boolean status = false;
			System.out.println("Enter product Id inorder to update product details: ");
			int id = sc.nextInt();
			for (int i = 0; i < index; i++) {
				if (id == product[i].getId()) {
					System.out.println("Enter new Product Id: ");
					int pid = sc.nextInt();

					sc.nextLine(); // it will consume the \n character

					System.out.println("Enter new Product Name: ");
					String name = sc.nextLine();
					System.out.println("Enter new Product Brand: ");
					String brand = sc.nextLine();
					System.out.println("Enter new Product Price: ");
					double price = sc.nextDouble();
					System.out.println("Enter new Stock: ");
					int quantity = sc.nextInt();
					product[i] = new Product(pid, name, brand, price, quantity);
					System.out.println("Product has been updated successfully!");
					status = true;
				}
			}
			if (status == false) {
				System.out.println("Product Id not found");
				System.out.println("=======================================================================================");
			}
		}

	//This method is to delete a product using Id
		static void deleteProductById() {

			boolean status = false;
			System.out.println("Enter new Product Id: ");
			int id = sc.nextInt();
			for (int i = 0; i < index; i++) {

				if (id == product[i].getId()) {

					for (int j = i; j < index - 1; j++) {

						product[j] = product[j + 1];
					}
					index--;
					System.out.println("Product has been deleted successfully!");
					status = true;
					break;
				}
				if (status = false) {

					System.out.println("Product Id not found");
				}
			}
		}

	//This method is to cancel an order
		static void Cancelorder() {

			boolean status = false;
			System.out.println("Enter Order id to cancel the product: ");
			int Oid = sc.nextInt();
			for (int i = 0; i < orderIndex; i++) {

				if (Oid == order[i].getOrderId()) {

					for (int k = 0; k < index; k++) {

						if (product[k].getId() == order[i].getProductId()) {

							product[k].setId(product[k].getQuantity() + order[i].getQuantity());

						}
					}
					for (int j = 1; j < orderIndex - 1; j++) {

						order[j] = order[j + 1];
					}
					orderIndex--;
					System.out.println("Order cancelled successfully!");
					status = true;
					break;
				}
			}
		}


}
