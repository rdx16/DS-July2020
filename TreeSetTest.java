import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		System.out.println("Creating the content....");
		Chemical c1 = new Chemical("Hydrogen","H" , 1, 1.0097f);
		Chemical c2 = new Chemical("Helium","He" , 2, 4f);
		Chemical c3 = new Chemical("Lithium","Li" , 3, 6.941f);
		Chemical c4 = new Chemical("Berilium","Be" , 4, 9f);
		Chemical c5 = new Chemical("Boron","B" , 5, 12.30f);
		
		System.out.println("Content is creaeted....");
		
		System.out.println("Creating container....");
		LinkedList<PhoneContact> phoneBook = new LinkedList<PhoneContact>();
		System.out.println("Container is ready....");
		
		TreeSet<Chemical> periodTable = new TreeSet<Chemical>();
		
		while(iterator.hasNext()) {
			PhoneContact theContact = iterator.next();
			System.out.println("The Contact : "+theContact);
		}
	}
}
class Chemical implements Comparable<Chemical>
{
	String atomicName;
	String atomicSymbol;
	int atomicNumber;
	float atomicWeight;
	public Chemical(String atomicName, String atomicSymbol, int atomicNumber, float atomicWeight) {
		super();
		this.atomicName = atomicName;
		this.atomicSymbol = atomicSymbol;
		this.atomicNumber = atomicNumber;
		this.atomicWeight = atomicWeight;
	}
	@Override
	public String toString() {
		return "Chemical [atomicName=" + atomicName + ", atomicSymbol=" + atomicSymbol + ", atomicNumber="
				+ atomicNumber + ", atomicWeight=" + atomicWeight + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int compareTo(Chemical o) {
		
		return Integer.compare(atomicNumber, o.atomicNumber);
	}
		
}
