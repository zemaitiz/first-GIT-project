package fundamentals.basics;

import org.junit.jupiter.api.Test;
import sdacademy.fundamentalstesting.Calculator;

import static org.junit.Assert.assertEquals;

public class Example2 {

    @Test
    public void testAdd() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = (int) calculator.add(5, 9);
        //then
//        assert result == 8;
        assertEquals(result, 14);
    }
@Test
    public void testDivision() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.divide(4, 2);

        //then
        assertEquals(result, 2);
    }
@Test
    public void testSubtraction() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.subtract(10, 5);

        //then
        assertEquals(result, 5);
    }
@Test
    public void testMultiplication() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.multiply(7, 3);

        //then

        assertEquals(result, 21);
    }
}
