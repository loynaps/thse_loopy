/*
programmer: Lloyd Napata
dtae: 07/02/117
Aprogramme to demontrate a complex for loop in Java
*/

import java.io.Console;
import java.util.Random;

public class DunkFor {
    
  public static void main(String[] args) {
    Console console = System.console();
    Random skill = new Random();

    boolean isDunked = false;
    for (int ballsThrown = 1; !isDunked && ballsThrown <= 3; ballsThrown++) {
    	console.printf("Try #%d ...%n", ballsThrown);
    	isDunked = skill.nextBoolean();
    }

    if (isDunked) {
    	console.printf("Air punch!!!!%n");
    } else {
    	console.printf("Boo!!!%n");
    }

 }
	/*
	Notes
	-In this program the throw has a maximum three attempts of throwing a ball at the target.
	*/
}
