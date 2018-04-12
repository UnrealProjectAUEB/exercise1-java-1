public class CPU extends Product {
	
	private double ghz;
	private int cores;
	private boolean obg;
	private int stock = 10;
	private double discount = 0.25;
	
	public CPU(String model, int year, String manufacturer, double price, double ghz, int cores, boolean obg) {
		super(model, year, manufacturer, price);
		this.ghz = ghz;
		this.cores = cores;
		this.obg = obg;
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