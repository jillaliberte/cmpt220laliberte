
public class Rectangle implements Printable   {
	double length;
	double width;
	
	public Rectangle() {
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public void print() {
		System.out.println ("Rectangle: ");
		System.out.println ("length = " + length + " height = " + width);
	}
}
