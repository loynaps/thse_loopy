/*
programmer: Lloyd Napata
dtae: 07/02/17 
A programme to demontrate a For loop in Java
*/

import java.io.Console;
import java.util.Random;

public class Ubisi {
    
  public static void main(String[] args) {
    Console console = System.console();

    for (int i = 99; i > 0; i--) {//it will be dcrementing
    	console.printf("%d bottles of milk on the wall... %n", i);
	}

 }
	/*
	Notes
	-When you know exactly how iterations you want to perform
	-It is an old school way of looping over an Array
	-A for statement consumes the initialization, condition and increment/decrement in one line thereby providing a shorter, easy to debug structure of looping.
	
	*/
}
