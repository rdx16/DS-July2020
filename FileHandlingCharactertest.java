import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingCharactertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Trying to open the file.........");
			FileReader fin = new FileReader("C:\\Users\\RDI16\\Downloads\\rdxshi.txt");
			System.out.println("File is open....");
			
			int i = fin.read();
			
			while(i!=-1) {
				System.out.print((char)i);
				i = fin.read();
				Thread.sleep(10);
			}
			System.out.println("Trying to close the file.....");
			fin.close();
			System.out.println("File is closed...............");
		} 
		catch (FileNotFoundException e) {
			System.out.println("Problem1"+e);
		} catch (IOException e) {
			System.out.println("Problem2"+e);
			
		} catch (InterruptedException e) {
			System.out.println("Problem3"+e);
		}
	}

}

