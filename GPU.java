public class GPU extends Product {
	
	private String gpuChipset;
	private int gpuMemory;
	private int stock = 10;
	private double discount = 0.25;
	
	GPU(String model, int year, String manufacturer, double price, String gpuChipset, int gpuMemory) {
		super(model, year, manufacturer, price);
		this.gpuChipset = gpuChipset;
		this.gpuMemory = gpuMemory;
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