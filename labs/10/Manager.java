
public class Manager extends Employee{
	String name;
	double age;
	double hourRate;
	
	public Manager() {
	}
	
	public Manager (String name, double age, double hourRate) {
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
