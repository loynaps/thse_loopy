/*
programmer: Lloyd Napata
dtae: 07/02/117
Aprogramme I demontrate a complex while loop in Java
*/

import java.io.Console;
import java.util.Random;

public class DunkWhile {
    
  public static void main(String[] args) {
    Console console = System.console();
    Random skill = new Random();

    boolean isDunked = false;
    int ballsThrown = 0;

    while (!isDunked && ballsThrown < 3 ) {
    	console.printf("Try #%d ...%n", ballsThrown + 1);
    	isDunked = skill.nextBoolean();
    	ballsThrown++;
    }

    if (isDunked) {
    	console.printf("Air punch!!!!%n");
    } else {
    	console.printf("Boo!!!%n");
    }

 }
	/*
	Notes
	-In this program the throw has a maximum three attempts of throwing a ball at the target
	*/
}
