package ca.jbrains.setup.test;

import ca.jbrains.setup.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by enricooliva on 07/02/2017.
 */
public class ReduceFractionTest {

    @Test
    public void alreadyInLowestTerms() throws Exception {
        assertEquals(new Fraction(3,4),new Fraction(3,4));
    }

    @Test
    public void reduce() throws Exception {


    }
}
