s
package assignmet;

/**
 *
 * @author Maseg
 */
public class Product {
	


	private String code;
	private String Name;
	private double price;
	private String category;
	private String warranty;
	private int Stock;
	private String Supplier;
	

	// the constructor
	public Product() {
		this.code = "";
		this.Name = "";
		this.category ="";
		this.warranty ="";
		this.price = 0;
		this.Stock = 0;
		this.Supplier ="";
	}


	public Product(String code, String Name,String category ,String warranty,
		double price,int Stock,String Supplier) {
		this.code = code;
		this.Name = Name;
		this.price = price;
		this.category = category;
		this.warranty = warranty;
		this.Stock = Stock;
		this.Supplier = Supplier;
	}
	
			/**
	 * @return the warranty
	 */
	public String getwarranty() {
		return warranty;
	}


			/**
	 * @param warranty the warranty to set
	 */
	public void setwarranty(String warranty) {
		this.warranty = warranty;
	}
	
			/**
	 * @return the category
	 */
	public String getcategory() {
		return category;
	}


			/**
	 * @param category the category to set
	 */
	public void setcategory(String category) {
		this.category = category;
	}
	

			/**
	 * @return the Supplier
	 */
	public String getSupplier() {
		return Supplier;
	}


			/**
	 * @param Supplier the Supplier to set
	 */
	public void setSupplier(String Supplier) {
		this.Supplier = Supplier;
	}

			/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}


			/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}


			/**
	 * @return the Name
	 */
	public String getName() {
		return Name;
	}


			/**
	 * @param Name the Name to set
	 */
	public void setName(String Name) {
		this.Name = Name;
	}


			/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


			/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

			/**
	 * @return the Stock
	 */
	public int getStock() {
		return Stock;
	}


			/**
	 * @param price the price to set
	 */
	public void setStock(int Stock) {
		this.Stock = Stock;
	}	
	
	
	

	@Override
	public String toString() {
		return 
			"Product code: " + this.code + "\n" + 
			"Product Name: " + this.Name + "\n"+
			"Product Category: " + this.category + "\n" +
			"Product Warranty: " + this.warranty + "\n"+
			"Product price: " + this.price + "\n" +
			"Product Stock Levles: " + this.Stock + "\n"+
			"Product Supplier: " + this.Supplier + "\n"+"";


	}
}
