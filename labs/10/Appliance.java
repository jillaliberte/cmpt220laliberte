
public abstract class Appliance {
	private double voltage;
	private String color;
	private String madeIn;
	private double price;
	
	public Appliance (double voltage, String color, String madeIn, double price) {
		this.voltage = voltage;
		this.color = color;
		this.madeIn = madeIn;
		this.price = price;
	}
	
	public double getVoltage() {
		return voltage;
	}
	public String getColor(){
		return color;
	}
	public String getMadeIn(){
		return madeIn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price1) {
		price1 = price;
	}
	public int compareTo (Appliance object) {
		if (getPrice()> object.getPrice())
			return 1;
		else if (getPrice()< object.getPrice())
			return -1;
		else 
			return 0;
	}
	public String toString() {
		return "Price: " + price;
	}
}
