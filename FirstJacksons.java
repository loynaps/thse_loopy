/*
programmer: Lloyd Napata
dtae: 07/02/17 
In this programme I demontrate a Arrays in Java
*/

import java.io.Console;

public class FirstJacksons {
    
  public static void main(String[] args) {
    Console console = System.console();
    String[] jacksons = {"Michael", "Jackie", "Tito", 
    										 "Jermaine", "Marlon", "Randy"};//This is the shortcut syntax to create and initialize an array
    console.printf("The Jackson 5 are: %n");
    for (int i = 0; i < jacksons.length; i++ ) {
    	String jackson = jacksons[i];
    	console.printf("%s Jackson %n", jackson);
    	
    }
	

 }
	/*
	Notes
	-Arrays are used to store many objects of the same type ina single variable
	-Zero-based: First element can be referenced by index 0.
	-Have a length property that returns the number of elemnts that are in the variable
	
	
	*/
}
