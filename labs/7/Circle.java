
public class Circle {
	private double x, y, x1, y1, newRadius;
	public double radius;
	
	public Circle(){
		x = 0;
		y = 0;
		radius = 1;
	}
	public Circle (double x1, double y1, double newRadius){
		this.x = x1;
		this.y = y1;
		this.radius = newRadius;
	}
	public double getArea() {
		return radius * radius * Math.PI;
	}
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void getRadius(double newRadius) {
		radius = newRadius;
	}
	public boolean contains (double x1, double y1) {
		if (((x - x1)*(x-x1) + (y-y1)*(y-y1)) < (radius * radius)) {
		return true;
		}
		return false;
	}
	public boolean contains (Circle circle) {
		if (((x - x1)*(x-x1) + (y-y1)*(y-y1)) < ((radius - newRadius)*(radius - newRadius))) {
		return true;
		}
		return false;
	}
	public boolean overlaps (Circle circle) {
		if (((radius - newRadius)*(radius - newRadius)) < ((x - x1)*(x-x1) + (y-y1)*(y-y1)) && 
				((x - x1)*(x-x1) + (y-y1)*(y-y1)) < ((radius - newRadius)*(radius - newRadius))) {
			return true;
		}
		return false;
	}
}
