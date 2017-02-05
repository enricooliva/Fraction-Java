package ca.jbrains.setup.test;

import ca.jbrains.setup.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by enricooliva on 05/02/2017.
 */
public class AddFractionTest {

    @Test
    public void zeroPlusZero() throws Exception {
        assertEquals(0, new Fraction(0).plus(new Fraction(0)).intValue());
    }

    @Test
    public void nonZeroPlusZero() throws Exception {
        assertEquals(3,new Fraction(3).plus(new Fraction(0)).intValue());
    }

    @Test
    public void zeroPlusNonZero() throws Exception {
        assertEquals(3, new Fraction(0).plus(new Fraction(3)).intValue());
    }

    @Test
    public void nonZeroPlusNonZero() throws Exception {
        assertEquals(7, new Fraction(3).plus(new Fraction(4)).intValue());
    }
}
