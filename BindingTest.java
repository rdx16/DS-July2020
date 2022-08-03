
public class BindingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Doctor d = new Doctor();
     d.diagnose();
     
     Surgeon s = new Surgeon();
     s.diagnose();
     
     HeartSurgeon hs = new HeartSurgeon();
     hs.diagnose();
     
     
	}

}
class Doctor{
	void diagnose() {
		System.out.println("Doctor: diagnoses the ENT Scan");
	}
}
class Surgeon extends Doctor{
	void diagnose()
	{
		System.out.println("Surgeon: diagnoses using CT Scan");
	}
}
class HeartSurgeon extends Surgeon{
	void diagnose()
	{
		System.out.println("Heart Surgeon: diagnoses using Angioplasty test");
	}
}