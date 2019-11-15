
public class Subclass2 extends AbstractClass {
	private String message = "This is the second subclass";
	 
	public Subclass2() {
	}
	public Subclass2(String message) {
		this.message = message;
	}
	public void printMessage() {
		System.out.println (message);
	}
}