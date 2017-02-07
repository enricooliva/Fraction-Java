package ca.jbrains.setup.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by enricooliva on 07/02/2017.
 */
public class GreaterCommonDivisorTest {

    @Test
    public void reflexive() throws Exception {
        assertEquals(1, gcd(1,1));
        assertEquals(2, gcd(2,2));
        assertEquals(1, gcd(-1,-1));
    }

    @Test
    public void relativePrime() throws Exception {
        assertEquals(1, gcd(4,7));
    }

    @Test
    public void commonFactor() throws Exception {
        assertEquals(2, gcd(6,8));
    }

    @Test
    public void negative() throws Exception {
        assertEquals(4, gcd(-24,28));
    }

    private int gcd(int a, int b) {
        while(b!=0){
            int t = b;
            b = a % t;
            a = t;
        }
        return Math.abs(a);
    }
}
