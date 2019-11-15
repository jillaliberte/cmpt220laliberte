
public class TestAbstract {
	public static void main (String[]args) {
		AbstractClass testSub1 = new Subclass1 ();
		AbstractClass testSub2 = new Subclass2 ();
		
		testSub1.printMessage();
		testSub2.printMessage();
	}
}
