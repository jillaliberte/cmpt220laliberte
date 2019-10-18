public class Square{
	public double width;
	
	public Square(){
		width = 1;
		}
	Square(double specificWidth){
		width = specificWidth;
	}
	
	public double getArea() {
		return width*width;
	}
	public double getPerimeter() {
		return (4*width);
	}
}
