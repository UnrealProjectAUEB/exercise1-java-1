public class Product {
	
	private String model;
	private int year, stock;
	private String manufacturer;
	private double price, discount;
	
	public Product(String model, int year, String manufacturer, double price) {
		this.model = model;
		this.year = year;
		this.manufacturer = manufacturer;
		this.price = price;
		this.stock = stock;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public String getManufacturer() {
		return this.manufacturer;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getStock() {
		return this.getStock();
	}
	
	public double getDiscount() {
		return this.getDiscount();
	}
	
	public void setModel(String nModel) {
		this.model = nModel;
	}
	
	public void setYear(int nYear) {
		this.year = year;
	}
	
	public void setManufacturer(String nManufacturer) {
		this.manufacturer = nManufacturer;
	}
	
	public void setPrice(int nPrice) {
		this.price = nPrice;
	}
	
	public String toString() {
		return "Model: "+getModel()+". Year: "+getYear()+". Manufacturer: "+getManufacturer()+". Price: "+getPrice()+".";
	}
	
	@Override()
    public boolean equals(Object other) {
        if (other instanceof Product) {
            Product otherProduct = (Product) other;
            return otherProduct.getModel().equals(this.getModel());
        }

        return false;
    } 
}
