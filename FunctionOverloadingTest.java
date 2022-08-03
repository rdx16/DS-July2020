
public class FunctionOverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Trigonometry trigonometryObj = new Trigonometry();
   
   trigonometryObj.dimension();
   trigonometryObj.dimension(4);
   trigonometryObj.dimension(4.5f, 4);
   trigonometryObj.dimension(4, 6.3f);
   
   
	}

}
class Trigonometry
{
	void dimension()
	{
       System.out.println("Height():  Height of the object.......");
	}
	
	
	void dimension(int height)
	{
       System.out.println("Height():  Height of the object......."+height);
	}
	
	void dimension(int height, int length)
	{
       System.out.println("Height():  Height of the object......."+height+"Length of The object"+length);
	}
	
	void dimension(int height, float length)
	{
       System.out.println("Height():  Height of the object......."+height+"Length of The object"+length);
	}
	
	void dimension(float height, int length)
	{
	       System.out.println("Height():  Height of the object......."+height+"Length of The object"+length);
		}
}
