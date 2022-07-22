
public class FunctionTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Calculator myCalci;
		
		myCalci = new Calculator();
		
		myCalci.subs1();
		myCalci.subs2(20, 5);
		double sub1 = myCalci.subs3( 9, 5);
		System.out.println("sub1 "+sub1);
		double sub = myCalci.subs4();
		System.out.println("sub "+sub);
	}
    
}
class Calculator
{
	   void subs1()
	   {
	      int x=80;     int y=40;
	      float sub=(x-y);
	      System.out.println("subs1:" +sub);
	   }
	   
	   void subs2(int x, int y)
	   {
	      float sub=(x-y);
	      System.out.println("subs1:" +sub);
	   }
	   
	   double subs3(int x, int y)
	   {
	      System.out.println("subs3:");
	      return (x-y);
	   }
	   
	   double subs4()
	   {
	      System.out.println("subs4:");
	      return (25-4);
	   }
}
