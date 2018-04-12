public class Mobo extends Product {
	
	private String cpuType;
	private int memory;
	private int ports;
	private int stock = 10;
	private final double DISCOUNT = 0.25;
	
	public Mobo(String model, int year, String manufacturer, double price, String cpuType, int memory, int ports) {
		super(model, year, manufacturer, price);
		this.cpuType = cpuType;
		this.memory = memory;
		this.ports = ports;
		this.stock = stock;
	}
	
	public String getCpuType() {
		return this.cpuType;
	}
	
	public int getMemory() {
		return this.memory;
	}
	
	public int getPorts() {
		return this.ports;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public double getDiscount() {
		return this.DISCOUNT;
	}
	
	public void setCpuType(String nCpuType) {
		this.cpuType = nCpuType;
	}
	
	public void setMemory(int nMemory) {
		this.memory = nMemory;
	}

	public void setPorts(int nPorts) {
		this.ports = nPorts;
	}
	
	public void setStock(int newStock) {
		this.stock = newStock;
	}
	
	public void updateStock() {
		this.stock -=1;
	}
	
	public String toString() {
		return super.toString()+" CPU Type: "+getCpuType()+". Memory: "+getMemory()+". Ports: "+getPorts()+".";
	}
}