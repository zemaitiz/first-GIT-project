package fundamentals.basics;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import sdacademy.fundamentalstesting.Calculator;

import java.util.Random;

public class Example5 {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldThrowExceptionWhenDividedBy0() {
        // give
        expectedException.expect(ArithmeticException.class);
        expectedException.expectMessage("/ by zero");
        Calculator calculator = new Calculator();
        int number = new Random().nextInt();

        // when
        calculator.divide(number, 0);

        // then
        // should throw exception

    }
}
