package shoppingcartproject;

//Java Bean
//Order class to store order details

public class OrderDetails {
	
	
	private String productName, brand;
	private int quantity, OrderId, ProductId;
	private double totalAmount;

	public OrderDetails(String name, String brand2, int quantity2, int orderId2, int id, double total) {

		super();
		this.productName = name;
		this.brand = brand2;
		this.quantity = quantity2;
		this.OrderId = orderId2;
		this.ProductId = id;
		this.totalAmount = total;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

}
