import java.util.InputMismatchException;
import java.util.Scanner;

public class PoliticalRally {
	public static void main(String[] args) {

		System.out.println("Begin main");

		try 
		{
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter numerator : ");
			int i= scan1.nextInt();
			System.out.println("i "+i);
			
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Enter denominator : ");
			int j= scan2.nextInt();
			System.out.println("j "+j);
			
			
			int k= i/j; // --> JVM if(j is non zero)-> CPU
						// else ArithmeticException e = new ArithmeticException("/ by zero");
						// throw e;
			System.out.println("k "+k);
		}
		catch(ArithmeticException ex) {
			System.out.println("Problem1 : "+ex.getMessage());
		}
		catch(InputMismatchException ex) {
			System.out.println("Please supply number....");
		}
		
		
		Messaging2 m = new Messaging2();
		m.printMessage();
		
		
		System.out.println("End main");

	}
}

class Messaging2
{
	String str="john";
	
	void printMessage() {
	
		try {
			System.out.println("str "+str.toUpperCase());
			System.out.println("3rd letter in "+str+" is "+str.charAt(13));
		}
		catch(NullPointerException ex) {
			System.out.println("Problem1 : "+ex.getMessage());
		}
		catch(StringIndexOutOfBoundsException ex) {
			System.out.println("Problem2 : "+ex.getMessage());
		}
	}

}


			
		