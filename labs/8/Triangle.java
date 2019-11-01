
public class Triangle 
		extends GeometricObject{ 
	private double side1 = 1.0; 
	private double side2 = 2.0; 
	private double side3 = 3.0; 
		
	public Triangle () {
	}
	
	public Triangle (double side1, double side2, double side3 ){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	
	}
	public double get1() {
		return side1;
	}
	public double get2() {
		return side2;
	}
	public double get3() {
		return side3;
	}
	public double getPerimeter() {
		return side1+side2+side3;
	}
		
	public double getArea() {
		double perimeter = getPerimeter()/2;
		return Math.sqrt (perimeter*((perimeter - side1) * (perimeter - side2) * (perimeter - side3)));
		}
	public String toString() {
		return "Triangle side 1 = " + side1 + " side 2 = " + side2 + " side 3 = " + side3;
	}
}
