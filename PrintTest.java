import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintTest {

	public static void main(String[] args) {
		  FileOutputStream fout;
	      try {
			fout = new FileOutputStream("C:\\Users\\RDI16\\Downloads\\rdx16.txt");
			System.out.println("File is ready.........");
		      
		      PrintStream ps = new PrintStream(fout);
		      
		      System.out.println("Print stream is ready..............");
		      ps.println("Hello file1");
		      ps.println("Hello file2");
		      ps.println("Hello file3");
		      ps.println("Hello file4");
		      
		      ps.close();
		      fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      
	}
}
 
	 
