/*
programmer: Lloyd Napata
dtae: 07/02/117
A programme to demontrate a nested loops in Java
*/

import java.io.Console;

public class IceC {
    
  public static void main(String[] args) {
    Console console = System.console();
  	String[] sweetFlavours = {"Caramel", "Cinnamon", "Watermelon", 
  														"Baked Beans"};
  	String[] savouryFlavours = {"Sea Salt", "Potato Chip", "Carrot", 
  	                           "Barbeque Sauce"};

  	for (String sweet : sweetFlavours) {
  		for (String savoury : savouryFlavours) {
  			console.printf("%s and %s %n", sweet, savoury);
  		}
  	}

 }
	/*
	Notes
	-In this program the throw has a maximum three attempts of throwing a ball at the target.
	*/
}
