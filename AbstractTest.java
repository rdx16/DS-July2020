
public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Headphones h = new Headphones();
	}

}

abstract class Players{
	abstract void playSound();
	
}
class Headphones extends Players
{
	void playSound() {
		System.out.println("Sound is available");
	}
}
class Earphones extends Headphones
{
	
}
