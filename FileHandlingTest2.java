import java.io.FileInputStream;

public class FileHandlingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class MyFileReader
{
	FileInputStream fin;
	
	MyFileReader(String filename) {
		// TODO Auto-generated constructor stub
		System.out.println("Trying to open the file");
		try {
			fin = new FileInputStream (filename);
		}catch (FileNotFoundException e) {
			System.out.println("problem1 :"+e);
		}
		System.out.println("File is open");
    
		
	void readFileData() {
		try {
			byte b = (byte) fin.read();
			System.out.println("[");
			while(b!)
		}
	}
	}
}