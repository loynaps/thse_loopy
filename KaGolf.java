/*
programmer: Lloyd Napata
dtae: 07/02/17
A programme to demontrate a do while loop in Java
*/

import java.io.Console;
import java.util.Random;

public class KaGolf {
    
  public static void main(String[] args) {
    Console console = System.console();
    Random luck = new Random();//random generator, one if the things it can return is a Boolean
 
    int numberOfPutts = 0;//initializing
    boolean ballInhole = false; //we start out with it false

    do {
	    console.printf("Putt putt %n");
	    ballInhole = luck.nextBoolean();
	    numberOfPutts++; //shorthand for number of putts equals what number of putts plus one
    }	while(!ballInhole);//while the ball is not in the hole

    console.printf("You got it in %d putts %n", numberOfPutts); //%d because its a number 
	}
	/*
	Notes
	-Some concept as the while loop
	-When you don't know how iterations it will take
	-But you want to ensure the loop caaries out a minimum of one iteration. 
	-This is where a do while loop comes in
	-It carries out what is reffered o as a post check.
	1.do while loop starts with the execution of the statement(s). There is no checking of any condition for the first time.
	2.After the execution of the statements, and update of the variable value, the condition is checked for true or false value. If it is evaluated to true, next iteration of loop starts.
	3.When the condition becomes false, the loop terminates which marks the end of its life cycle.
	*/
}
