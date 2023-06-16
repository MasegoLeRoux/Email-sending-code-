/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmet;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Maseg
 */
class Functions {
	Product abs = new Product();
		// list of products
	private final  ArrayList<Product> products ;
	// array for categories
	private final  String[] categories;


	public Functions() {



	categories = new String[] {"Desktop Computer", "Laptop", "Tablet", "Printer", "Gaming console"};
	products = new ArrayList<>();

	}		

	Scanner sc= new Scanner(System.in);
	/**
	* @param args the command line arguments
	*/


	void CaptureProduct() {


	out.println("CAPTURE A NEW PRODUCT");

	out.println("******************************************\n");

	out.println("Enter the Product code: >>"+"");
	abs.setCode(sc.nextLine());
	out.println("Enter the Product Name: >>" +"");
	abs.setName(sc.nextLine());
	out.println("select the Product category");
	out.println("Please enter enter number 1 to 5 for product category");
	int choice;
	// loop for category selection
	while (true) {
	for (int i = 0; i < categories.length; i++) {
	System.out.println(categories[i] + " = " + (i + 1));
	}
	System.out.print("Product category: ");
	try{
	choice = Integer.parseInt(sc.nextLine());
	if(choice>0 && choice<=categories.length)
	break;
	}
	catch(NumberFormatException e){
	System.out.println("Incorrect category selection..");
	}
	}
	abs.setcategory(categories[choice-1]);
	out.println("Indicate the product warranty.\n");
	setwarranty();
	setPrice();
	setStockLevel();
	out.println("Product warranty >> "+ abs.getwarranty());
	out.println("Enter the supplier for " + abs.getName() +" >>");
	abs.setSupplier(sc.nextLine());
	
	
	out.println("Product details has been saved successfuly!!!");
	Product newProduct = new Product(abs.getCode(),abs.getName(),abs.getcategory(), abs.getwarranty(), abs.getPrice(), (int) abs.getStock(), abs.getSupplier());
	products.add(newProduct);
	
	}			

	Product SearchProduct() {
	out.println("Please enter product code: ");
	String prodCode = sc.nextLine();
	out.println("\nPRODUCT SEARCH RESULT");
	out.println("***************************");
	for(int i=0; i<products.size(); i++){
	if(products.get(i).getCode().equals(prodCode)){
	return products.get(i);
	}
	}
	return null;
	}




	//method to set stock level of a product
	 void setStockLevel() throws NumberFormatException {
	out.print("Enter stock level for "+abs.getName()+": ");
	abs.setStock(Integer.parseInt(sc.nextLine()));
	}
	//method to set price of a product
	 void setPrice() throws NumberFormatException {
	System.out.print("Enter price for "+abs.getName()+": ");
	abs.setPrice(Double.parseDouble(sc.nextLine()));
	}
	//method to set warranty of a product
	 void setwarranty() {
		System.out.print("Indicate product warranty. Enter (1) for 6 months or any other keys for 2 years: ");
	abs.setwarranty(sc.nextLine());
	}

	void UpdateProduct() {
	 Product p = SearchProduct();
	if(p!=null){
	System.out.print("Update the warranty? (y)yes (n)no: ");
	String NW = sc.nextLine();
	if(NW.equalsIgnoreCase("y")){
	setwarranty();
	}
	System.out.print("Update the price? (y)yes (n)no: ");
	NW = sc.nextLine();
	if(NW.equalsIgnoreCase("y")){
	setPrice();
	}
	System.out.print("Update the stock level? (y)yes (n)no: ");
	NW = sc.nextLine();
	if(NW.equalsIgnoreCase("y")){
	setStockLevel();
	}
	System.out.println("The product details has been updated successfully!!!");
	}
	else{
	System.out.println("The product canot be located. Invalid product.");

	}
	}

	void DeleteProduct() {

	Product p =  SearchProduct();
	if(p!=null){
	System.out.print("Do you want to delete "+p.getCode()+"? (y)yes (n)no: ");
	String choice = sc.nextLine();
		if(choice.equalsIgnoreCase("y")){
	products.remove(p);
	System.out.println(p.getCode() +" deleted.");
	}

	}
	else{
	System.out.println("The product canot be located. Invalid product.");
	}
	}

	void Printmethod() {
	double TOTAL = 0;
	out.println("PRODUCT REPORT");
	out.println("========================================");

	for (int i = 0; i < products.size(); i++) {

			out.println("========================================");
					out.println("Product"+(i+1));
				out.println("----------------------------------------");
				out.println(products.get(i).toString() + "\n");
//				System.out.println(products.get(i));
	TOTAL += products.get(i).getPrice();
					out.println("----------------------------------------");
				}
				out.println("TOTAL PRODUCT COUNT:"+products.size());
			out.println("TOTAL PRODUCT VALUE R:"+ TOTAL);
		out.println("TOTAL PRODUCT VALUE R: %.2F"+TOTAL/products.size());
	}
}
