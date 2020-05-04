package cn.xpbootcamp.fizzbuzz;

public class FizzBuzzConverter {
	public String convert(int num) {

		String numStr = "" + num;
		if (num%3 == 0) {
			numStr = "Fizz";
		}
		return numStr;
	}
				
}
