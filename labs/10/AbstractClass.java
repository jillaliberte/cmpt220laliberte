
public abstract class AbstractClass {
	private String message = " ";

	
	protected AbstractClass() {
		message = " ";
	}
	protected AbstractClass(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void printMessage() {
		System.out.println (message);
	}
}
