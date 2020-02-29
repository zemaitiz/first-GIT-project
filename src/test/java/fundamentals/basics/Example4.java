package fundamentals.basics;

import org.junit.Test;
import sdacademy.fundamentalstesting.Calculator;


import java.util.Random;

public class Example4 {

    @Test(expected = ArithmeticException.class)
    public void shouldThrowExceptionWhenDividingBy0() {
        //given
        Calculator calculator = new Calculator();
        int number = new Random().nextInt();

        //when
        calculator.divide(number, 0);

        //then
        //should throw exception
    }
}
