/*
programmer: Lloyd Napata
dtae: 07/02/117
A programme to demontrate a Branching in Java
*/

import java.io.Console;

public class Prizes {
    
  public static void main(String[] args) {
    Console console = System.console();
  	String[] rsvps = Rsvps.shuffled(); 
  	int prizesGivenAway = 0;
  	int drawingNumber = 0;

  	while (prizesGivenAway < 5) {
  		String winner = rsvps[drawingNumber];
  		drawingNumber++;
  		console.printf("Is %s present? ", winner);
  		String isHere = console.readLine();
  		if (isHere.equalsIgnoreCase("no")) {
  			continue;
  		}
  		String size = console.readLine("what is your shirt size ");
  		prizesGivenAway++;
  	}

 }
	/*
	Notes
	break - Exits the iteration
	continue- stops executing the current iteration and starts a new iteration if applicable
	Labels - are not common they are same as GoTo
	return - you can return if you are in a method, this immediately exits the method, even if you are in an iteration
	*/
}
