package katas;

public class FizzBuzz {
	
	public String number(int num) {
		String ret = new String();
		if (num % 15 == 0) {
			ret = "FizzBuzz";
		} else if (num % 5 == 0) {
			ret = "Buzz";
		} else if (num % 3 == 0) {
			ret = "Fizz";
		} else {
			ret = Integer.toString(num);
		}
		
		return ret;
	}
	
	public String[] generate(int range) {
		String[] ret = new String[range];
		
		for (int i = 1; i <= range; i++) {
			ret[i-1] = number(i);
		}
		
		return ret;
	}
	
	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz();
		
		for(String out: fb.generate(100)) {
			System.out.print(out + " ");
		}
	}
}
