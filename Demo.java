import java.util.*;

public class Demo {
	
	public static boolean checkAvailability(ArrayList<Product> stock, Product product) {
		for (Product p : stock) {
			if (p.equals(product)) {
				return true;
			}
		}	

		return false;
	}
	
	public static void main(String[] arguements) {
		
		System.out.println("Starting...");
		ArrayList<Product> stock = new ArrayList<Product>();
		ArrayList<Order> orders = new ArrayList<Order>();
		ArrayList<Sale> sales = new ArrayList<Sale>();
		
		//Creating objects for stock ArrayList
		Product mobo1 = new Mobo("ZQ-11", 2017, "Asus", 100.0, "AMD", 16, 8);
		Product mobo2 = new Mobo("X299-A", 2017, "Asus", 271.0, "Intel", 32, 8);
		
		Product cpu1 = new CPU("ryzen", 2016, "AMD", 132.0, 3, 4 , false);
		Product cpu2 = new CPU("ryzen", 2017, "AMD", 82.39, 3.6, 4, false);
		
		Product ram1 = new RAM("dd", 2015, "Kingston", 13.0, "DDR4", 4, 2666);
		Product ram2 = new RAM("LPX", 2016, "Corsair", 81.0, "DDR4", 8, 2400);
		
		Product gpu1 = new GPU("GTX 1060", 2017, "Palet", 678.0, "nVidia", 6);
		Product gpu2 = new GPU("GTX 1080", 2016, "MSI", 673.0, "nVidia", 8);
		
		Product disk1 = new Disk("PPP", 2016, "SAMSUNG", 50.0, "SSD", 2.5, 256);
		Product disk2 = new Disk("NAS", 2016, "Western Digital", 115.0, "HDD", 3.5, 4000);
		
		Product monitor1 = new Monitor("FLATRON E1900", 2015, "LG", 110.0, "LCD", 22, 1080, "DVI");
		Product monitor2 = new Monitor("Dell SE2717H", 2016, "Dell", 188.0, "LCD", 27, 1080, "HDMI");
		
		Product keyboard1 = new Keyboard("ORNATA", 2017, "Razer", 120.0, "wired");
		Product keyboard2 = new Keyboard("CK108", 2017, "Motospeed", 49.0, "wired");
		
		Product mouse1 = new Mouse("Deathader", 2017, "Razer", 65.8, "optical", "wired");
		Product mouse2 = new Mouse("M185", 2016, "Logitech", 12.0, "lazer", "wired");
		
		Product printer1 = new Printer("PIXMA C1370", 2016, "Canon", 180.0, "inkjet", "coloured");
		Product printer2 = new Printer("Xpress M2026", 2015, "Samsung", 47.0, "inkjet", "coloured");
		
		stock.add(mobo1);
		stock.add(mobo2);
		stock.add(cpu1);
		stock.add(cpu2);
		stock.add(ram1);
		stock.add(ram2);
		stock.add(gpu1);
		stock.add(gpu2);
		stock.add(disk1);
		stock.add(disk2);
		stock.add(monitor1);
		stock.add(monitor2);
		stock.add(keyboard1);
		stock.add(keyboard2);
		stock.add(mouse1);
		stock.add(mouse2);
		stock.add(printer1);
		stock.add(printer2);
		
		Scanner sc = new Scanner(System.in);
		//Scanner sc2 = new Scanner(System.in);
		String[] comp = {"Motherboard", "CPU", "GPU", "RAM", "Disk"};
		String[] per = {"Monitor", "Keyboard", "Mouse", "Printer"};
		String[] categ2 = {"Components", "Peripherals"};
		String[] categ = {"View availability", "View orders", "Exit"};
		int j, select, select2, select3, select4, select5, select6;
		// j : counter for printing ordered lists
		String date = "20/4/2018", ETA = "24/42018"; //date and order Estimated Time of Arrival are fixed
		boolean done = false;
	
		while(!done) {
			//Printing Categories
			for (int i = 1; i<categ.length+1; i++) {
				System.out.println(i + ". " + categ[i-1]);
			}
			System.out.print("> ");
			do {
				select = sc.nextInt(); // View availability, View orders or Exit
				if (select != 1 && select != 2 && select != 3) {
					System.out.println("Invalid selection - Try again");
					System.out.print("> ");
				}
			} while(select != 1 && select != 2 && select != 3);
			
			if (select == 1) { // ======= VIEW AVAILABILITY ===========
			
				System.out.println("You entered: View availability");
			
				for (int i = 1; i<categ2.length+1; i++) { //Printing kind of Products
					System.out.println(i + ". " + categ2[i-1]);
				};
				System.out.print("> ");
				do {
					select2 = sc.nextInt(); // Components or Peripherals
					if (select2 != 1 && select2 != 2) {
						System.out.println("Invalid selection - Try again");
						System.out.print("> ");
					}
				} while (select2 != 1 && select2 != 2);
				select3 = 0; //Initializing with a random number
				
				if (select2 == 1) { // Entering Component's section
			
					System.out.println("You entered section: Components");
					//Printing products in components section
					for (int i = 1; i<comp.length+1; i++) {
						System.out.println(i + ". "+comp[i-1]);
					};
					System.out.print("> ");
					//User inputs number of product
					do {
						select3 = sc.nextInt();
						if (select3 != 1 && select3 != 2 && select3 != 3 && select3 != 4 && select3 != 5) {
							System.out.println("Invalid selection - Try again");
							System.out.print("> ");
						}
					} while (select3 != 1 && select3 != 2 && select3 != 3 && select3 != 4 && select3 != 5);
					
					j = 1;
				
					if (select3 == 1) { //Printing all Motherboard products
						for (Product p: stock) {
							if (p instanceof Mobo) {
								System.out.println(j + ". " + p.getModel());
								j += 1;
							};
						};
					} else if (select3 == 2) { //Printing all CPU products
						for (Product p: stock) {
							if (p instanceof CPU) {
								System.out.println(j + ". " + p.getModel());
								j += 1;
							};
						};
					} else if (select3 == 3) { //Printing all GPU products
						for (Product p: stock) {
								if (p instanceof GPU) {
								System.out.println(j + ". " + p.getModel());
								j += 1;
							};
						};
					} else if (select3 == 4) { //Printing all RAM products
						for (Product p: stock) {
							if (p instanceof RAM) {
								System.out.println(j + ". " + p.getModel());
								j += 1;
							};
						};
					} else if (select3 == 5) { //Printing all Disk products
						for (Product p: stock) {
							if (p instanceof Disk) {
								System.out.println(j + ". " + p.getModel());
								j += 1;
							};
						};
					}
				
				} else if (select2 == 2) { //Entering Component's section
				
					System.out.println("You entered: Peripherals");
					for (int i = 1; i<per.length+1; i++) {
						System.out.println(i + ". "+per[i-1]);
					};
					System.out.print("> ");
					do {
						select3 = sc.nextInt(); //Peripheral product
						if (select3 != 1 && select3 != 2 && select3 != 3 && select3 != 4) {
							System.out.println("Invalid selection - Try again");
							System.out.print("> ");
						}
					} while (select3 != 1 && select3 != 2 && select3 != 3 && select3 != 4);
					j = 1;
				
					if (select3 == 1) {
						for (Product p: stock) {
							if (p instanceof Monitor) {
								System.out.println(j + ". " + p.getModel());
								j += 1;
							};
						};
					} else if (select3 == 2) {
						for (Product p: stock) {
							if (p instanceof Keyboard) {
								System.out.println(j + ". " + p.getModel());
								j += 1;
							};
						};
					} else if (select3 == 3) {
						for (Product p: stock) {
							if (p instanceof Mouse) {
								System.out.println(j + ". " + p.getModel());
								j += 1;
							};
						};
					} else if (select3 == 4) {
						for (Product p: stock) {
							if (p instanceof Printer) {
								System.out.println(j + ". " + p.getModel());
								j += 1;
							};
						};
					};
				};
				System.out.print("> ");
				//User inputs number of product
				select4 = sc.nextInt();
				//Creating a copy of product and initializing it randomly
				Product obj = mobo1;
				j = 0;
				//Determining which specific product the user has selected
				for (Product p: stock) {
				
					if (select2 == 1) {
						
						if (select3 == 1) {
							if (p instanceof Mobo) {
								j += 1;
							};
							if (select4 == j) {
								obj = p;
								break;
							};
						
						} else if (select3 == 2) {
							if (p instanceof CPU) {
								j += 1;
							};
							if (select4 == j) {
								obj = p;
								break;
							};
						} else if (select3 == 3) {
							if (p instanceof GPU) {
								j += 1;
							};
							if (select4 == j) {
								obj = p;
								break;
							};
						} else if (select3 == 4) {
							if (p instanceof RAM) {
								j += 1;
							};
							if (select4 == j) {
								obj = p;
								break;
							};
						} else if (select3 == 5) {
							if (p instanceof Disk) {
								j += 1;
							};
							if (select4 == j) {
								obj = p;
								break;
							};
						}
					} else if (select2 == 2) {
						if (select3 == 1) {
							if (p instanceof Monitor) {
								j += 1;
							};
							if (select4 == j) {
								obj = p;
								break;
							};
							
						} else if (select3 == 2) {
							if (p instanceof Keyboard) {
								j += 1;
							};
							if (select4 == j) {
								obj = p;
								break;
							};
						} else if (select3 == 3) {
							if (p instanceof Mouse) {
								j += 1;
							};
							if (select4 == j) {
								obj = p;
								break;
							};
						} else if (select3 == 4) {
							if (p instanceof Printer) {
								j += 1;
							};
							if (select4 == j) {
								obj = p;
								break;
							};
						}	
					}
				}
				
				//Printing specifications of the product that the user has selected
				System.out.println(obj.toString());
				String name, telNumb;
			
				if (checkAvailability(stock, obj) && obj.getStock()>0) { // checks if the product is included in stock and if there are more than 0 of it in available
					System.out.println("Product is available.");
					System.out.println("1. Buy it \n2. Exit");
					System.out.print("> ");
					//
					do {
						select5 = sc.nextInt();
						if (select5 != 1 && select5 != 2) {
							System.out.println("Invalid selection - Try again");
							System.out.print("> ");
						}
					} while (select5 != 1 && select5 != 2);
					if (select5 == 1) {
						System.out.println("Give name, telephone numb.");
						System.out.print("> ");
						name = sc.nextLine();
						name = sc.nextLine();
						System.out.print("> ");
						telNumb = sc.nextLine();
						if (select2 == 1 && select3 == 1) { //select2 = 1 -> components, select3 = 1 -> 1st item of category -> 1st item of components -> Motherboards
							Sale sale = new Sale(obj, name, telNumb, date, obj.getPrice()-obj.getPrice()*obj.getDiscount()); //Making a new sale
							sales.add(sale); //Adding the new sale to the catalogue
							((Mobo) obj).updateStock(); //Updating stock, one less item in stock of this product
						} else if (select2 == 1 && select3 == 2) {
							Sale sale = new Sale(obj, name, telNumb, date, ((CPU) obj).getPrice()-((CPU) obj).getPrice()*((CPU) obj).getDiscount());
							sales.add(sale);
							((CPU) obj).updateStock();
						} else if (select2 == 1 && select3 == 3) {
							Sale sale = new Sale(obj, name, telNumb, date, ((GPU) obj).getPrice()-((GPU) obj).getPrice()*((GPU) obj).getDiscount());
							sales.add(sale);
							((GPU) obj).updateStock();
						} else if (select2 == 1 && select3 == 4) {
							Sale sale = new Sale(obj, name, telNumb, date, ((RAM) obj).getPrice()-((RAM) obj).getPrice()*((RAM) obj).getDiscount());
							sales.add(sale);
							((RAM) obj).updateStock();
						} else if (select2 == 1 && select3 == 5) {
							Sale sale = new Sale(obj, name, telNumb, date, ((Disk) obj).getPrice()-((Disk) obj).getPrice()*((Disk) obj).getDiscount());
							sales.add(sale);
							((Disk) obj).updateStock();
						} else if (select2 == 2 && select3 == 1) {
							Sale sale = new Sale(obj, name, telNumb, date, ((Monitor) obj).getPrice()-((Monitor) obj).getPrice()*((Monitor) obj).getDiscount());
							sales.add(sale);
							((Monitor) obj).updateStock();
						} else if (select2 == 2 && select3 == 2) {
							Sale sale = new Sale(obj, name, telNumb, date, ((Keyboard) obj).getPrice()-((Keyboard) obj).getPrice()*((Keyboard) obj).getDiscount());
							sales.add(sale);
							((Keyboard) obj).updateStock();
							System.out.println("Keyboard Stock " + ((Keyboard) obj).getStock());
						} else if (select2 == 2 && select3 == 3) {
							Sale sale = new Sale(obj, name, telNumb, date, ((Mouse) obj).getPrice()-((Mouse) obj).getPrice()*((Mouse) obj).getDiscount());
							sales.add(sale);
							((Mouse) obj).updateStock();
						} else if (select2 == 2 && select3 == 4) {
							Sale sale = new Sale(obj, name, telNumb, date, ((Printer) obj).getPrice()-((Printer) obj).getPrice()*((Printer) obj).getDiscount());
							sales.add(sale);
							((Printer) obj).updateStock();
						}
					
						System.out.println("Purchase completed.");
					};
				} else {
					System.out.println("Product is not available");
					System.out.println("1. Order it \n2. Exit");
					System.out.print("> ");
					//
					do {
						select5 = sc.nextInt();
						if (select5 != 1 && select5 != 2) {
							System.out.println("Invalid selection - Try again");
							System.out.print("> ");
						}
					} while (select5 != 1 && select5 != 2);
					if (select5 == 1) {
						System.out.println("Give name, telephone numb.");
						System.out.print("> ");
						name = sc.nextLine();
						name = sc.nextLine();
						System.out.print("> ");
						telNumb = sc.nextLine();
						if (select2 == 1 && select3 == 1) {
							Order order = new Order(obj, name, telNumb, date, ETA, ((Mobo) obj).getPrice()-((Mobo) obj).getPrice()*((Mobo) obj).getDiscount(), "Pending");
							orders.add(order);
						} else if (select2 == 1 && select3 == 2) {
							Order order = new Order(obj, name, telNumb, date, ETA, ((CPU) obj).getPrice()-((CPU) obj).getPrice()*((CPU) obj).getDiscount(), "Pending");
							orders.add(order);
						} else if (select2 == 1 && select3 == 3) {
							Order order = new Order(obj, name, telNumb, date, ETA, ((GPU) obj).getPrice()-((GPU) obj).getPrice()*((GPU) obj).getDiscount(), "Pending");
							orders.add(order);
						} else if (select2 == 1 && select3 == 4) {
							Order order = new Order(obj, name, telNumb, date, ETA, ((RAM) obj).getPrice()-((RAM) obj).getPrice()*((RAM) obj).getDiscount(), "Pending");
							orders.add(order);
						} else if (select2 == 1 && select3 == 5) {
							Order order = new Order(obj, name, telNumb, date, ETA, ((Disk) obj).getPrice()-((Disk) obj).getPrice()*((Disk) obj).getDiscount(), "Pending");
							orders.add(order);
						} else if (select2 == 2 && select3 == 1) {
							Order order = new Order(obj, name, telNumb, date, ETA, ((Monitor) obj).getPrice()-((Monitor) obj).getPrice()*((Monitor) obj).getDiscount(), "Pending");
							orders.add(order);
						} else if (select2 == 2 && select3 == 2) {
							Order order = new Order(obj, name, telNumb, date, ETA, ((Keyboard) obj).getPrice()-((Keyboard) obj).getPrice()*((Keyboard) obj).getDiscount(), "Pending");
							orders.add(order);
							System.out.println("Testing order contains: "+orders.contains(order));
						} else if (select2 == 2 && select3 == 3) {
							Order order = new Order(obj, name, telNumb, date, ETA, ((Mouse) obj).getPrice()-((Mouse) obj).getPrice()*((Mouse) obj).getDiscount(), "Pending");
							orders.add(order);
						} else if (select2 == 2 && select3 == 4) {
							Order order = new Order(obj, name, telNumb, date, ETA, ((Printer) obj).getPrice()-((Printer) obj).getPrice()*((Printer) obj).getDiscount(), "Pending");
							orders.add(order);
						} 
						
						System.out.println("Order completed.");
					};	
				};
			
			} else if (select == 2 && !orders.isEmpty()) { // ========= VIEW ORDERS ===========
				System.out.println("You entered: View orders");
				j = 1;
				String name, telNumb;
				for (Order p: orders) {
					System.out.println(j + ". Order number " + j); //Printing orders
					j += 1;
				}
				System.out.print("> ");
				//
				do {			
					select2 = sc.nextInt();
					if (select2 >= j) {
						System.out.println("Invalid selection - Try again");
						System.out.print("> ");
					}
				} while (select2 >= j);
				System.out.println(orders.get(select2-1).toString() + "\n1. Change status \n2. Purchase");
				System.out.print("> ");
				//
				do {
					select3 = sc.nextInt();
					if (select3 != 1 && select3 != 2) {
						System.out.println("Invalid selection - Try again");
						System.out.print("> ");
					}
				} while (select3 != 1 && select3 != 2);
				if (select3 == 1 && orders.get(select2-1).getOrderStatus() == "Pending") {
					orders.get(select2-1).setOrderStatus("Completed");
					System.out.println("Order's status changed to: Completed");
				} else if (select3 == 1 && orders.get(select2-1).getOrderStatus() == "Completed") {
					orders.get(select2-1).setOrderStatus("Pending");
					System.out.println("Order's status changed to: Pending");
				} else if (select3 == 2) {
					orders.get(select2-1);
					System.out.println("Give name, telephone numb.");
					name = sc.nextLine();
					System.out.print("> ");
					name = sc.nextLine();
					System.out.print("> ");
					telNumb = sc.nextLine();
					Product obj;
					obj = orders.get(select2-1).getProduct();
					if (obj instanceof Mobo) {
						Sale sale = new Sale(obj, name, telNumb, date, ((Mobo) obj).getPrice()-((Mobo) obj).getPrice()*((Mobo) obj).getDiscount());
						sales.add(sale);
						//((Mobo) obj).updateStock();
					} else if (obj instanceof CPU) {
						Sale sale = new Sale(obj, name, telNumb, date, ((CPU) obj).getPrice()-((CPU) obj).getPrice()*((CPU) obj).getDiscount());
						sales.add(sale);						
						//((CPU) obj).updateStock();
					} else if (obj instanceof GPU) {
						Sale sale = new Sale(obj, name, telNumb, date, ((GPU) obj).getPrice()-((GPU) obj).getPrice()*((GPU) obj).getDiscount());
						sales.add(sale);
						//((GPU) obj).updateStock();
					} else if (obj instanceof RAM) {
						Sale sale = new Sale(obj, name, telNumb, date, ((RAM) obj).getPrice()-((RAM) obj).getPrice()*((RAM) obj).getDiscount());
						sales.add(sale);
						//((RAM) obj).updateStock();
					} else if (obj instanceof Disk) {
						Sale sale = new Sale(obj, name, telNumb, date, ((Disk) obj).getPrice()-((Disk) obj).getPrice()*((Disk) obj).getDiscount());
						sales.add(sale);
						//((Disk) obj).updateStock();
					} else if (obj instanceof Monitor) {
						Sale sale = new Sale(obj, name, telNumb, date, ((Monitor) obj).getPrice()-((Monitor) obj).getPrice()*((Monitor) obj).getDiscount());							sales.add(sale);
					//	((Monitor) obj).updateStock();
					} else if (obj instanceof Keyboard) {
						Sale sale = new Sale(obj, name, telNumb, date, ((Keyboard) obj).getPrice()-((Keyboard) obj).getPrice()*((Keyboard) obj).getDiscount());
						sales.add(sale);
						//((Keyboard) obj).updateStock();
					} else if (obj instanceof Mouse) {
						Sale sale = new Sale(obj, name, telNumb, date, ((Mouse) obj).getPrice()-((Mouse) obj).getPrice()*((Mouse) obj).getDiscount());
						sales.add(sale);
						//((Mouse) obj).updateStock();
					} else if (obj instanceof Printer) {
						Sale sale = new Sale(obj, name, telNumb, date, ((Printer) obj).getPrice()-((Printer) obj).getPrice()*((Printer) obj).getDiscount());
						sales.add(sale);
						//((Printer) obj).updateStock();
					}
				
					System.out.println("Purchase completed.");
				}
			} else if (select == 2 && orders.isEmpty()) {
				System.out.println("No orders");
			} else if (select == 3) {
				done = true;
			}
		}	
		System.out.println("Terminated");
	}
}
