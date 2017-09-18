/*
programmer: Lloyd Napata
dtae: 07/02/17 
In this programme I demontrate a For-each loop in Java
*/

import java.io.Console;

public class EachJacksons {
    
  public static void main(String[] args) {
    Console console = System.console();
    String[] jacksons = {"Michael", "Jackie", "Tito", 
    										 "Jermaine", "Marlon", "Randy"};
    console.printf("The Jackson 5 are: %n");
    //enhanced for loop
    for (String jackson : jacksons) {
    	console.printf("%s Jackson %n", jackson);
    }
	
 }
	/*
	Notes
	-Useful when you require everything in a list or array to be processed
	-More ligible in processing an entire array.
	-reffered to as for in loop or enhanced loop in other languages
	-It is inflexible and should be used only when there is a need to iterate through the elements in sequential manner without knowing the index of currently processed element.
	*/
}
