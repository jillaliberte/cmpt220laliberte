
public class Subclass1 extends AbstractClass {
	private String message = "This is the first subclass";
	 
	public Subclass1() {
	}
	public Subclass1(String message) {
		this.message = message;
	}
	public void printMessage() {
		System.out.println (message);
	}
}
