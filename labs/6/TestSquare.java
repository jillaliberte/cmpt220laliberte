
public class TestSquare {
	public static void main(String[]args) {
		
		Square square1 = new Square(40);
		System.out.println ("the width of the first square is " + square1.width);
		System.out.println ("the area of the first square is " + square1.getArea());
		System.out.println ("the perimeter of the first square is " + square1.getPerimeter());
		
		System.out.println (" ");
		
		Square square2 = new Square(35.9);
		System.out.println ("the width of the second square is " + square2.width);
		System.out.println ("the area of the second square is " + square2.getArea());
		System.out.println ("the perimeter of the second square is " + square2.getPerimeter());
	}

}

