
public class Manager2 implements Printable {
	String name;
	double age;
	
	public Manager2() {
	}
	
	public Manager2(String name, double age) {
		this.name = name;
		this.age = age;
	}
	public void print() {
		System.out.println ("Manager: ");
		System.out.println ("name = " + name + " age = " + age);
	}
}

