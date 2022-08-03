import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;

public class testHashSet {
    public static void main(String[] args) throws ClassNotFoundException {
        TestClass new1 = new TestClass("Hello", "male", true);
        TestClass new2 = new TestClass("Goodbye", "female", true);
        TestClass new3 = new TestClass("Something", "other", false);
        HashSet<TestClass> hSet = new HashSet<TestClass>();
        hSet.add(new1);
        hSet.add(new2);
        hSet.add(new3);
        System.out.println(hSet);
        for(int i = 0; i < hSet.size(); i++) {
            try {
                FileOutputStream fileOut = new FileOutputStream("C:\\Users\\RDI16\\Downloads\\rdx.txt");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(hSet);
                out.close();
                fileOut.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
class TestClass implements Serializable
{
	String Greetings;
	String Gender;
	boolean b;
	public TestClass(String greetings, String gender, boolean b) {
		super();
		Greetings = greetings;
		Gender = gender;
		this.b = b;
	}
	@Override
	public String toString() {
		return "TestClass [Greetings=" + Greetings + ", Gender=" + Gender + ", Negation=" + b + ", toString()="
				+ super.toString() + "]";
	}
	
	
}