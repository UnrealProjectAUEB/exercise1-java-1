public class Keyboard extends Product {
	
	private String keyboardConn;
	private int stock = 0;
	private double discount = 0.1;
	
	public Keyboard(String model, int year, String manufacturer, double price, String keyboardConn) {
		super(model, year, manufacturer, price);
		this.keyboardConn = keyboardConn;
		this.stock = stock;
	}
	
	public double getDiscount() {
		return discount;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public void updateStock() {
		this.stock -= 1;
	}
}
