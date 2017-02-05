package ca.jbrains.setup.test;

import ca.jbrains.setup.Fraction;
import org.junit.Assert;
import org.junit.Test;
import org.junit.matchers.JUnitMatchers;

/**
 * Created by enricooliva on 04/02/2017.
 */
public class FractionTest {

    @Test
    public void isEqual() throws Exception {
        Fraction f1 = new Fraction(2,3);
        Fraction f2 = new Fraction(2,3);

        Assert.assertTrue(f1.equals(f2));

    }
}
