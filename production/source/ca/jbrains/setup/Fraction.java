package ca.jbrains.setup;

import static java.lang.Math.abs;

/**
 * Created by enricooliva on 05/02/2017.
 */
public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        //fraction_reduce();
    }

    public Fraction(int numerator) {
        this(numerator,1);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fraction)) return false;

        Fraction fraction = (Fraction) o;

        if (numerator != fraction.numerator) return false;
        return denominator == fraction.denominator;

    }

    //hashCode need to be consistent with equals
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
        //this.numerator /= gcd;
        //this.denominator /= gcd;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    public Fraction plus(Fraction that) {
        if (this.denominator != that.denominator){
            return new Fraction(this.numerator * that.denominator + that.numerator * this.denominator,
                    this.denominator * that.denominator);
        }else {
            return new Fraction(this.numerator + that.numerator, this.denominator);
        }
    }

    public int intValue() {
        return this.numerator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }
}
