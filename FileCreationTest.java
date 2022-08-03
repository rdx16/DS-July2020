import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCreationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
try {
	System.out.println("Trying to creat a file...........");
	FileOutputStream fout = new FileOutputStream("C:\\Users\\RDI16\\Downloads\\rdx.txt");
	System.out.println("File is created..................");
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter you data: ");
	String str = scan.nextLine();
	
	byte byteArray [] = str.getBytes();
	System.out.println("Converted the string into the bytes array...........");
	
	fout.write(byteArray);
	System.out.println("byte array is written...........");
	fout.close();
	System.out.println("File is closed...........");
	
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	
} catch (IOException e) {
	
		e.printStackTrace();
	}
	}

}
