package assignmet;

import static java.lang.System.out;
import java.util.Scanner;

public class PROG6112AssignmentST10091881 {
	
private static void OpenScreen() {
System.out.println("BRIGHT FUTURE TECHNOLOGIES APPLICATION");
System.out.println("**************************************");
System.out.println("Enter (1) to launch menu or any other key to exit");
}
private static void DispalyOpt() {
out.println("\nPlease select one of the menu itemn: \n");
	out.println("(1) Capture a new product.");
	out.println("(2) Search for a product.");
	out.println("(3) Update a product.");
	out.println("(4) Delete a product.");
	out.println("(5) Print report.");
	out.println("(6) Exit Application.");
}
static Functions newFunctions;

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) 
		{	
	Scanner TEXT = new Scanner(System.in);	
		newFunctions = new Functions();	
			while (true) {
				OpenScreen();
					String choice = TEXT.nextLine();
						if (!choice.equals("1")) {
									break;
									}		
		
	while(true){	
	DispalyOpt();
	 choice = TEXT.nextLine();
	if(choice.equals("6"))
	break;
	switch (choice){
		case "1": 
			newFunctions.CaptureProduct();
			break;
			
		case "2":
			Product p = newFunctions.SearchProduct();
				if( p!= null)
					out.println(p);
					else
						System.out.println("The product canot be located. Invalid product.");
						
			
		case "3":
			newFunctions.UpdateProduct();
			break;
		case"4":
			newFunctions.DeleteProduct();
			break;		
		case "5":   
			newFunctions.Printmethod();
			break;			
		case "6":
			System.exit(6);
	}
	}	
	}


}
}	
