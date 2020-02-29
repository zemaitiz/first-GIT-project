package fundamentals.basics;

import org.junit.Assert;
import org.junit.Test;

public class Example3 {

    @Test
    public void testAssertEquals() {

        // given
        int firstNum = 2;
        int secondNum = 32;

        // when
        int result = firstNum * secondNum;

        // then
        Assert.assertEquals(result, 2 * 32);
        Assert.assertNotEquals("Values are not equal", 1, 2);
    }

    @Test
    public void testAssertTrueFalse() {

        // given


        // when


        // then
        Assert.assertTrue(3 == 3);
        Assert.assertEquals("Values are not equal", 1, 2);
    }

    @Test
    public void testArrayEquals() {

        // given
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {1, 2, 3};

        //when


        Assert.assertArrayEquals(firstArray, secondArray);
    }

    @Test
    public void testAssertNull() {
        String s = null;
        Assert.assertNull(s);
    }

    @Test
    public void testAssertSame() {
        String s1 = "abc";
        String s2 = "acc";
        Assert.assertNotSame(s1, s2);
    }


}

