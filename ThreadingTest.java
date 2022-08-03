public class ThreadingTest {
	public static void main(String[] args) {
		
		Politician m1 = new Politician("Water"); //3
		Politician m2 = new Politician("\tLight AAP"); //3
		Politician m3 = new Politician("\t\tHealth"); //3
		Politician m4 = new Politician("\t\t\tEducation"); //3

		m1.start();
		m2.start();
		m3.start();
		m4.start();
		
		
	}
}

class Politician extends Thread 
{
	String mni;
	
	Politician(String m) {
		mni = m;
	}
	
	public void run() { 
		for (int i = 1; i < 100; i++) {
			System.out.println(mni+ " "+i);
		}
	}
}