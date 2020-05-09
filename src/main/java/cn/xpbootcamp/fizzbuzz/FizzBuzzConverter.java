package cn.xpbootcamp.fizzbuzz;
public class FizzBuzzConverter {
	
	public String convert(int num) {
	    String numStr = "" + num;


	    //优先级1:包含7 ，只考虑3，7整除情况  （75 Fizz）
	    if (numStr.contains("7")) {
	      if(num % 3 == 0) {
	          numStr = "Fizz";
	          if (num % 7 == 0){
	              numStr += "Whizz";
	          }
	      }
	      else if(num % 7 == 0){
	          numStr = "Whizz";
	      }
	    }


	    //优先级2: 包含5 ，只考虑5，7整除情况 （35 BuzzWhizz）
	    else if (numStr.contains("5")) {
	      if(num % 5 == 0) {
	          numStr = "Buzz";
	          if (num % 7 == 0){
	              numStr += "Whizz";
	          }
	      }
	      else if(num % 7 == 0){
	          numStr = "Whizz";
	      }
	    } 


	    //优先级3:包含3，只说Fizz （13 Fizz）
	    else if (numStr.contains("3")) {
		      numStr = "Fizz";
		    }
	    
	    //优先级4: 3 fizz 5 buzz 7 whizz  组合
	    else {
		      if (num % 3 == 0) {
		        numStr = "Fizz";
		        if (num % 5 == 0) {
		          numStr += "Buzz";
		          if (num % 7 == 0) {
		            numStr += "Whizz";
		          }
		        } else if (num % 7 == 0) {
		          numStr += "Whizz";
		        }
		      } else if (num % 5 == 0) {
		        numStr = "Buzz";
		        if (num % 7 == 0) {
		          numStr += "Whizz";
		        }
		      } else if (num % 7 == 0) {
		        numStr = "Whizz";
		      }
		  }
	    
	    return numStr;
	}
}

