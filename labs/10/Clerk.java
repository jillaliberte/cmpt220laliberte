
public class Clerk extends Employee{
	String name;
	double age;
	double hourRate;
	
	public Clerk() {
	}
	
	public Clerk(String name, double age, double hourRate) {
		this.name = name;
		this.age = age;
		this.hourRate = hourRate;
	}
	
	public double salary(double hours) {
		return hours * hourRate;
	}
	public String toString() {
		return "name= " + name + " age=" + age + " hourRate="
				+ hourRate;
	}
}
