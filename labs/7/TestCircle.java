
public class TestCircle {
	public static void main (String []args) {
		Circle c1 = new Circle(2,2,5.5);
		System.out.println ("Radius of circle 1: " + c1.radius);
		System.out.println ("Area of circle 1: " + c1.getArea());
		System.out.println ("Perimeter of circle 1: " + c1.getPerimeter());
		System.out.println ("Circle 1 contains (3,3): " + c1.contains(3.0, 3.0));
		System.out.println ("Circle 1 contains Circle 2: " + c1.contains(new Circle(4,5,10.5)));
		System.out.println ("Circle 2 overlaps Circle 1: " + c1.overlaps(new Circle(3,5,2.3)));
	}
}
