
public class TestTriangleException {
	public static void main (String[]args) {
		try {
			new TriangleException(20, 80, 24);
			new TriangleException(0, 0, 3);
			new TriangleException (-2,6,7);
		}
		catch (IllegalTriangleException ex) {
			System.out.println(ex);
		}
	}
}
