package shoppingcartusingcollection;

public class Product {
	
	
	//Java bean 
	//Product class to store product details
		
		private int Id;
		private String Name;
		private String Brand;
		private double price;
		private int stock;
		
	public Product (int Id,String Name,String Brand,double price,int stock)
	{
		this.Id=Id;
		this.Name=Name;
		this.Brand=Brand;
		this.price=price;
		this.stock=stock;
		
	}


	public void setId(int id) {
		Id = id;
	}


	public void setName(String name) {
		Name = name;
	}


	public void setBrand(String brand) {
		Brand = brand;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return Id;
	}



	public String getName() {
		return Name;
	}



	public String getBrand() {
		return Brand;
	}



	public double getPrice() {
		return price;
	}



	public int getStock() {
		return stock;
	}


	@Override
	public String toString() {
		return "ProductLab [Id=" + Id + ", Name=" + Name + ", Brand=" + Brand + ", price=" + price + ", stock=" + stock
				+ "]";
	}

}
