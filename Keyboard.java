public class Keyboard extends Product {
	
	private String keyboardConn;
	
	private long discount = 0.1;
	
	public Keyboard(String model, int year, String manufacturer, int price, String keyboardConn) {
		super(model, year, manufacturer, price);
		this.keyboardConn = keyboardConn;
	}
	
	public long getDiscount() {
		return discount;
	}
}