import java.util.Scanner;
public class TestTriangle {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println ("Enter 3 values for the sides of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		System.out.println ("If the triangle is filled enter 'True' if it is not filled enter 'False'");
		String x = input.nextLine();
		if (x.equals("True"));
		boolean filled = true; 

		System.out.println ("Enter the color of the triangle:  ");
		String color = input.nextLine();
		
		
		Triangle triangle1 = new Triangle(side1, side2, side3);
		
		triangle1.setFilled (filled);
		triangle1.setColor(color);
		
		System.out.println ("The area of the triangle is: " + triangle1.getArea());
		System.out.println ("The perimeter of the triangle is: " + triangle1.getPerimeter());
		System.out.println (triangle1.toString());
		System.out.println ("The color of the triangle is: " + triangle1.getColor());
		System.out.println ("The triangle is filled: " + triangle1.isFilled());
		
		input.close();
	}
}
