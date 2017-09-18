/*
programmer: Lloyd Napata
dtae: 07/02/17 
A programme to demontrate a while loop in Java
*/

import java.io.Console;
 
public class Questions {
    
  public static void main(String[] args) {
    Console console = System.console();

    String anyQuestions = console.readLine("Are there any questions? ");
    while (anyQuestions.equals("yes")) {
    	//the code will loop each time as long as things equals yes
    	String question = console.readLine("What is your question? ");
    	console.printf("I do no understand: %s \n", question);
    	anyQuestions = console.readLine("Are there any more questions? ");
    }

    console.printf("Next slide...");
 
  }

/*
NOTES
-A loop is sequence of instructions that are continually repeated until a certain condition is reached
-A while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition. 
-The while loop can be thought of as a repeating if statement.
-While loops are commonly used when there is an unkown number of iterations to perform
-Java provides both a pre-check as well as a post-check style
-Pre-check offers the ability to actually never loop

*/
}
