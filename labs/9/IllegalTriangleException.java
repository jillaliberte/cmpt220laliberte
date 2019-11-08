
public class IllegalTriangleException 
	extends Exception{
	private double side1, side2, side3; 
	private double perimeter = side1 + side2 + side3;
	
	public IllegalTriangleException (double side1, double side2, double side3) {
		super ("Invalid perimeter" + side1 + side2 + side3);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getPerimter() {
	return perimeter; 
	}
}
