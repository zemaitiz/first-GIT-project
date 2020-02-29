package fundamentals.tdd;


import org.junit.Assert;
import org.junit.Test;
import sdacademy.fundamentalstesting.tdd.Euro;

public class EuroTest {

    @Test
    public void getAmountInText() {
        Assert.assertEquals("EUR 2.00", new Euro(2).toString());
        Assert.assertEquals("EUR 7.00", new Euro(7).toString());
    }

    @Test
    public void testEquality() {
        Assert.assertTrue(new Euro(2).equal(new Euro(2)));
        Assert.assertFalse(new Euro(17).equals(new Euro(170)));
    }

    @Test
    public void testSubtraction() {
        Euro euro = new Euro(10);
        Assert.assertEquals(4, euro.subtract(6));
    }

    @Test
    public void division() {
        Assert.assertEquals(9, new Euro(18).divide(new Euro(2)), 0.01);
    }

    @Test
    public void testMultiplication() {
        Euro euro = new Euro(10);
        Assert.assertEquals(20, euro.multiply(2), 0);
    }
}
