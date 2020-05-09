package cn.xpbootcamp.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
	public void should_show_fizz_when_countoff_given_contains7_divided_by3_not_divided_by7() {
        
		FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("Fizz", fizzBuzz.convert(27));
        
	}
	
	@Test
	public void should_show_Whizz_when_countoff_given_contains7_divided_by7_not_divided_by3() {
		 
		FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

	     Assert.assertEquals("Whizz", fizzBuzz.convert(77));
		
	}
	
	@Test
	public void should_show_numbers_when_countoff_given_contains7_divided_by5_not_divided_by7or3() {

		 
		FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

	    Assert.assertEquals("275", fizzBuzz.convert(275));
		
	}
	
	@Test
	public void should_show_fizzwhizz_when_countoff_given_contains7_divided_by3and7() {
		
		 
		FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

	    Assert.assertEquals("FizzWhizz", fizzBuzz.convert(147));
		
		
	}
	
	@Test
	public void should_show_fizz_when_countoff_given_contains7_divided_by3and5_not_divided_by7() {
		
		 
		FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

	    Assert.assertEquals("Fizz", fizzBuzz.convert(75));
		
		
	}
	
	@Test
	public void should_show_Wizz_when_countoff_given_contains7_divided_by5and7_not_divided_by3() {
		
		 
		FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

	    Assert.assertEquals("Whizz", fizzBuzz.convert(70));
		
	}


	@Test
	public void should_show_Buzz_when_countoff_given_contains5_not_contains7_divided_by5_not_divided_by7() {
		
		 
		FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

	    Assert.assertEquals("Buzz", fizzBuzz.convert(50));
		
	}
	
	@Test
	public void should_show_Whizz_when_countoff_given_contains5_not_contains7_divided_by7_not_divided_by5() {
		
		 
		FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

	    Assert.assertEquals("Whizz", fizzBuzz.convert(56));
		
	}

	@Test
	public void should_show_number_when_countoff_given_contains5_not_contains7_divided_by3_not_divided_by5and7() {
		
		 
		FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

	    Assert.assertEquals("51", fizzBuzz.convert(51));
		
	}
	
	@Test
	public void should_show_buzzwhizz_when_countoff_given_contains5_not_contains7_divided_by5and7() {
		
		 
		FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

	    Assert.assertEquals("BuzzWhizz", fizzBuzz.convert(35));
		
	}
	
	@Test
	public void should_show_buzz_when_countoff_given_contains5_not_contains7_divided_by3and5_not_divided_by7() {
		
		 
		FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

	    Assert.assertEquals("Buzz", fizzBuzz.convert(15));
		
	}
	
	@Test
	public void should_show_Whizz_when_countoff_given_contains5_not_contains7_divided_by3and7_not_divided_by5() {
		
		 
		FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

	    Assert.assertEquals("Whizz", fizzBuzz.convert(588));
		
	}
	
	@Test
	public void should_show_fizz_when_countoff_given_contains3_not_contains5and7() {
		
		 
		FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

	    Assert.assertEquals("Fizz", fizzBuzz.convert(13));
		
	}

    @Test
    public void should_show_number_when_countoff_given_not_contains3and5and7_cannot_divided_by3and5and7(){

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("1", fizzBuzz.convert(1));
        Assert.assertEquals("2", fizzBuzz.convert(2));

    }

    @Test
    public void should_show_fizz_when_countoff_given_not_contains3and5and7_can_divided_by3(){

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("Fizz", fizzBuzz.convert(3));

    }

    @Test
    public void should_show_fizz_when_countoff_given_not_contains3and5and7_can_divided_by5(){

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("Buzz", fizzBuzz.convert(5));

    }
    
    @Test
    public void should_show_fizz_when_countoff_given_not_contains3and5and7_can_divided_by7(){

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("Whizz", fizzBuzz.convert(7));

    }

    @Test
    public void should_show_fizz_when_countoff_given_not_contains3and5and7_can_divided_by3and5(){
        
    	FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("FizzBuzz", fizzBuzz.convert(60));
    }
    
    @Test
    public void should_show_fizz_when_countoff_given_not_contains3and5and7_can_divided_by3and7(){
       
    	FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("FizzWhizz", fizzBuzz.convert(21));
    }

    @Test
    public void should_show_fizz_when_countoff_given_not_contains3and5and7_can_divided_by3and5and7(){
        
    	FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("FizzBuzzWhizz", fizzBuzz.convert(210));
    }

    @Test
    public void should_show_fizz_when_countoff_given_not_contains3and5and7_can_divided_by5and7(){
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("BuzzWhizz", fizzBuzz.convert(35));
    }
   

}

