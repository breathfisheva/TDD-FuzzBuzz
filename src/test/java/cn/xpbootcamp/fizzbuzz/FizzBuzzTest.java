package cn.xpbootcamp.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {


    @Test
    public void fizzBuzzConvertorLeavesNormalNumbersAlone(){

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("1", fizzBuzz.convert(1));
        Assert.assertEquals("2", fizzBuzz.convert(2));

    }

    @Test
    public void fizzBuzzConvertorMultiplesOfThree(){

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("Fizz", fizzBuzz.convert(3));

    }

    @Test
    public void fizzBuzzConvertorMultiplesOfFive(){

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("Buzz", fizzBuzz.convert(5));

    }
    
    @Test
    public void fizzBuzzConvertorMultiplesOfSevern(){

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("Whizz", fizzBuzz.convert(7));

    }

    @Test
    public void multiplesOfBothThreeAndFive(){
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("FizzBuzz", fizzBuzz.convert(15));
    }
    
    @Test
    public void multiplesOfBothThreeAndSeven(){
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("FizzWhizz", fizzBuzz.convert(21));
    }

    @Test
    public void multiplesOfBothThreeAndFiveAndSeven(){
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("FizzBuzzWhizz", fizzBuzz.convert(105));
    }

    @Test
    public void multiplesOfBothFiveAndSeven(){
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("BuzzWhizz", fizzBuzz.convert(35));
    }
   

}

