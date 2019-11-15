
public class SportCar implements Printable {
	String brand;
	double miles;
	
	public SportCar() {
	}
	
	public SportCar(String brand, double miles) {
		this.brand = brand;
		this.miles = miles;
	}
	public void print() {
		System.out.println ("Sports Car: ");
		System.out.println ("brand = " + brand + " miles = " + miles);
	}
}
