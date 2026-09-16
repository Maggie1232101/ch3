import java.util.Random;
import java.util.Scanner;

public class guessMyNumber{
	public static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
	
	//initial text
	System.out.println("Guess my number between 1 and 100! ");
	System.out.print("Type a number: ");
	
	//your number
	int ynumber = in.nextInt();
	System.out.println ("Your guess is: " + ynumber);
	
	//pick a random number
	Random random = new Random();
	int number = random.nextInt(100) + 1;
	
	//final message
	int dif = ynumber - number;
	System.out.printf ("My number was: %d \nYou were off by %d", number, dif);
	
	
	}

}
