
public class MyLong {
	public long value;
	
	public MyLong () {
		value = 1;
	}
	public  MyLong (long newValue) {
		this.value = newValue;
	}
	
	public long getValue() {
		return value;
	}
	
	public boolean isEven() {
		if (value % 2 == 0) { 
		return true;
		}
	return false; 
	}
	
	public boolean isOdd() {
		if (value % 2 != 0) {
			return true;
		}
		return false; 
	}
	
	public boolean isPrime() {
		for (int i = 2; i < value; i++) {
			if (value % 2 != 0) {
				return true; 
			}
		}
		return false;
	}
	public boolean equals() {
		if (value.equals(this.value)) {
	return true;
		}
		return false; 
	}

	public static long[] parseLong(char[] characters) {
		long[] long1 = new long[characters.length];
		for (int i = 0; i < characters.length; i++) {
			long1[i] = (long)characters[i];
		}
		return long1;
	}
	public static long[] parseLong (String str) {
		long[] long2 = new long[100];
		for (int j = 0; j < 100; j++) {
			long2[j] = Long.parseLong(str);
		}
		return long2;
	}
	}


