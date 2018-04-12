public class Mouse extends Product {
	
	private String mouseTech;
	private String mouseConn;
	private int stock = 10;
	private double discount = 0.1;
	
	public Mouse(String model, int year, String manufacturer, double price, String mouseTech, String mouseConn) {
		super(model, year, manufacturer, price);
		this.mouseTech = mouseTech;
		this.mouseConn = mouseConn;
		this.stock = stock;
	}
	
	public double getDiscount() {
		return discount;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public void setStock(int newStock) {
		this.stock = newStock;
	}
	
	public void updateStock() {
		this.stock -= 1;
	}
}