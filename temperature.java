import  java.util.Scanner;
public class temp{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Celcius -> farenheit, enter temp in Celcius: ");
		double celcius = in.nextInt();
		
		double farenheit = celcius*9.0/5.0 +32;
		
		System.out.printf("%.1f C = %.1f F",celcius, farenheit);
	
	}
}
