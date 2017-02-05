package ca.jbrains.setup;

import static java.lang.Math.abs;

/**
 * Created by enricooliva on 05/02/2017.
 */
public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) throws Exception {

        if (denominator==0){
            throw new Exception("no zero based");
        }

        this.numerator = numerator;
        this.denominator = denominator;
        fraction_reduce();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fraction)) return false;

        Fraction fraction = (Fraction) o;

        if (numerator != fraction.numerator) return false;
        return denominator == fraction.denominator;

    }

    @Override
    public int hashCode() {
        int result = numerator;
        result = 31 * result + denominator;
        return result;
    }

    /**
     * Calculates the greatest common divisor.
     * @param num1
     * @param num2
     * @return GCD
     */
    private int util_gcd(int num1, int num2)
    {
        int tmp;
        num1 = abs(num1);
        num2 = abs(num2);
        while (num1 > 0) {
            tmp = num1;
            num1 = num2 % num1;
            num2 = tmp;
        }
        return num2;
    }

    /**
     * Reduce a fraction to the lowest terms
     */
    private void fraction_reduce()
    {
        int gcd;
        gcd = util_gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
