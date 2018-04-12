public class Sale {
	
	private String productSold, clientName, clientTelNum, dateOfSale;
	private double finalTotalCost;
	private int id;
	private static int saleID = 0;
	Product product;
	
	public Sale(Product p, String clientName, String clientTelNumb, String dateOfSale, double finalTotalCost) {
		this.id = giveSaleID();
		//this.productSold = p.getModel();
		this.clientName = clientName;
		this.clientTelNum = clientTelNumb;
		this.dateOfSale = dateOfSale;
		this.finalTotalCost = finalTotalCost;
		this.product = p;
	}
	
	public static int giveSaleID() {
		++saleID;
		return saleID;
	}
	
	public int getSaleID() {
		return this.id;
	}
}