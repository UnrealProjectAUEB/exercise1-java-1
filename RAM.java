public class RAM extends Product {
	
	private String ramType;
	private int ramCapacity;
	private int ramFrequency;
	private int stock = 10;
	private double discount = 0.25;
	
	public RAM(String model, int year, String manufacturer, double price, String ramType, int ramCapacity, int ramFrequency) {
		super(model, year, manufacturer, price);
		this.ramType = ramType;
		this.ramCapacity = ramCapacity;
		this.ramFrequency = ramFrequency;
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