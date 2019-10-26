
public class TestMyLong {
	public static void main (String[] args) {
		MyLong long1 = new MyLong();
		System.out.println("The long value represented by the object is: " + long1);
		System.out.println("The long is even: " + long1.isEven());
		System.out.println("The long is odd: " + long1.isOdd());
		System.out.println("The long is prime: " + long1.isPrime());
		
		MyLong specificLong = new MyLong(27);
		System.out.println("The specified long value is: " + specificLong);
		System.out.println("The long is even: " + specificLong.isEven());
		System.out.println("The long is odd: " + specificLong.isOdd());
		System.out.println("The long is prime: " + specificLong.isPrime());
		
		System.out.println("The object and specific value are equal:" + specificLong.equals (long1));
		
		 char[] characters = {'a', 'b', 'c', 'd', 'f'};
		 System.out.println("the character array as a long value is: "  + MyLong.parseLong(characters));
		 
		 
		 String str = "this is a string";
		System.out.println("the string, ' " + str + " ' as a long value is: "  + MyLong.parseLong(str));
		
	}
}
