package ca.jbrains.setup.test;

import ca.jbrains.setup.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by enricooliva on 06/02/2017.
 */
public class FractionEqualsTest {
    @Test
    public void sameNumeratorlAndDenominator() throws Exception {
        assertEquals(new Fraction(3,5), new Fraction(3,5));
    }

    @Test
    public void differentNumerator() throws Exception {
        assertNotEquals(new Fraction(2,5),new Fraction(5,5));
    }
}
