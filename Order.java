public class Order {
	
		private String productOrdered, clientName, clientTelNum, dateOfOrder, orderETA, orderStatus;
		private double finalTotalCost;
		private int id;
		Product product;
		public static int orderID = 0;
	
		public Order(Product p, String clientName, String clientTelNum, String dateOfOrder, String orderETA, double finalTotalCost, String orderStatus) {
			this.id = giveOrderID();
			this.clientName = clientName;
			this.clientTelNum = clientTelNum;
			this.dateOfOrder = dateOfOrder;
			this.orderETA = orderETA;
			this.finalTotalCost = finalTotalCost;
			this.orderStatus = orderStatus;
			this.product = p;
		}
		
		public Product getProduct() {
			return this.product;
		}
		
		public static int giveOrderID() {
			++orderID;
			return orderID;
		}
		
		public int getOrderID() {
			return id;
		}
		
		public String getOrderStatus() {
			return this.orderStatus;
		}
		
		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}
		
		public String toString() {
			return "Order ID: "+this.id+". Client's name: "+this.clientName+". Client's tel. numb.: "+this.clientTelNum+". Date of order: "+this.dateOfOrder+". Order ETA: "+this.orderETA+". Final total cost: "+this.finalTotalCost+". Order status: "+this.orderStatus;
		}
}