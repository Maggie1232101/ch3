import java.util.Scanner;

public class convertTime{
	public static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
	
	System.out.print("Input Seconds: ");
	
	int sec = in.nextInt();
	int h = sec/3600;
	int min = sec%3600/60;
	int seconds = sec%3600%60;
	
	
	System.out.printf("%d Seconds = %d hours, %d minutes, and %d seconds",sec, h, min, seconds);
	
	
	}
}
