public class Printer extends Product {
	
	private String printerTech;
	private String printerType;
	private int stock = 10;
	private double discount = 0.1;
	
	public Printer(String model, int year, String manufacturer, double price, String printerTech, String printerType) {
		super(model, year, manufacturer, price);
		this. printerTech = printerTech;
		this.printerType = printerType;
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