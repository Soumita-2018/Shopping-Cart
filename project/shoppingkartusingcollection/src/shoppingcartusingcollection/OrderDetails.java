package shoppingcartusingcollection;

public class OrderDetails {
	
	
	//Java bean 
	//Order Detail class to store order details
		
		private String Name2;
		private String brand2;
		private int stock2; 
		private int ProductId;
		private double totalAmount;
		
		
		public OrderDetails (String Name2,String brand2,int stock2,int ProductId,double totalAmount )
		{
			this.Name2=Name2;
			this.brand2=brand2;
			this.stock2=stock2;
			this.ProductId=ProductId;
			this.totalAmount=totalAmount;
			
		}


		public OrderDetails() {
			super();
			// TODO Auto-generated constructor stub
		}


		public String getName2() {
			return Name2;
		}


		public void setName2(String name2) {
			Name2 = name2;
		}


		public String getBrand2() {
			return brand2;
		}


		public void setBrand2(String brand2) {
			this.brand2 = brand2;
		}


		public int getStock2() {
			return stock2;
		}


		public void setStock2(int stock2) {
			this.stock2 = stock2;
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


		@Override
		public String toString() {
			return "OrderDetailsLab [Name2=" + Name2 + ", brand2=" + brand2 + ", stock2=" + stock2 + ", ProductId="
					+ ProductId + ", totalAmount=" + totalAmount + "]";
		}
		
		
		

}
