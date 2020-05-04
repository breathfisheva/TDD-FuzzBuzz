package cn.xpbootcamp.fizzbuzz;

public class FizzBuzzConverter {
	public String convert(int num) {

		String numStr = "" + num;
		if (num%3 == 0) {
			numStr = "Fizz";
			
			if(num%5 == 0) {
				numStr += "Buzz";
				
				if(num%7 == 0) {
					numStr += "Whizz";
				}
			}
			else if(num%7 == 0) {
				numStr += "Whizz";
			}
		}
		else if (num%5 == 0) {
			numStr = "Buzz";
			
			if(num%7 == 0) {
				numStr += "Whizz";
			}
		}
		else if (num%7 == 0) {
			numStr = "Whizz";
		}
		return numStr;
	}
				
}
