public class Disk extends Product {
	
	private String diskType;
	private double diskDimensions;
	private int diskCapacity;
	private int stock = 10;
	
	private double discount = 0.25;
	
	public Disk(String model, int year, String manufacturer, double price, String diskType, double diskDimensions, int diskCapacity) {
		super(model, year, manufacturer, price);
		this.diskType = diskType;
		this.diskDimensions = diskDimensions;
		this.diskCapacity = diskCapacity;
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