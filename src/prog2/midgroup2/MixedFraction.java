package prog2.midgroup2;

/**
 * The MixedFraction class is a.......
 */
public class MixedFraction extends Fraction {

    /**
     * Holds the whole number part of a mixed fraction object
     */
    private int whole_number;

    /**
     * This constructor inherits from the super class
     */
    public MixedFraction() {
        super();
    }

    /**
     * Overload Constructor for
     *
     * @param whole_number
     * @param fraction
     */
    public MixedFraction(int whole_number, Fraction fraction) {
        setNumerator(fraction.getNumerator());
        setDenominator(fraction.getDenominator());
        this.whole_number = whole_number;
    }

    /**
     * Overload Constructor for explicitly setting the whole number
     * Numerator and denominator of a MixedFraction object
     *
     * @param whole_number
     * @param numerator
     * @param denominator
     */
    public MixedFraction(int whole_number, int numerator, int denominator) {
        this.whole_number = whole_number;
        super.setNumerator(numerator);
        super.setDenominator(denominator);
    }

    /**
     * Constructor that receives a given Fraction. <br>
     * Sets the numerator of a Mixed Fraction to a given numerator of a Fraction <br>
     * Sets the denominator of a Mixed Fraction to a given denominator of a Fraction <br>
     *
     * @param fraction
     */
    public MixedFraction(Fraction fraction) {
        fraction.setNumerator(fraction.getNumerator());
        fraction.setDenominator(fraction.getDenominator());
    }

    /**
     * Mutuator/Setter Method. <br>
     *
     * @param whole_number
     */
    public void setWhole_number(int whole_number) {
        this.whole_number = whole_number;
    }

    /**
     * Mutuator/Setter Method. <br>
     *
     * @param fraction
     */
    public void setFractionPart(Fraction fraction) {
        int denominator = fraction.getDenominator();
        int num = fraction.getNumerator();
        fraction.setNumerator(num);
        fraction.setDenominator(denominator);
    }

    /**
     * Accessor/Getter Method. <br>
     *
     * @return whole_number of a MixedFraction
     */
    public int getWhole_number() {
        return whole_number;
    }

    /**
     * Accessor/Getter Method. <br>
     *
     * @return a fraction object
     */
    public Fraction getFractionPart() {
        Fraction fraction = new Fraction();
        fraction.getNumerator();
        fraction.getDenominator();
        return fraction;
    }

    /**
     * Converts a mixed fraction to an improper fraction. <br>
     * Example Usage: 5 2/3 converts to 17/3 <br>
     */
    public void toFraction() {
        setNumerator(getWhole_number() * getDenominator() + getNumerator());
        setDenominator(getDenominator());
        setWhole_number(0);
    }

    /**
     * Converts an improper fraction to a mixed fraction. <br>
     * ex. 5/3 converts to 1 2/3
     */
    public void toMixedFraction() {
        setWhole_number(getNumerator() / getDenominator());
        setNumerator(getNumerator() % getDenominator());
    }

    /**
     * Adds two Mixed Fractions and overrides the add method of Fraction. <br>
     * <p>
     * Algorithm:
     * 1.
     * 2.
     * 3.
     *
     * @param other receives the passed Fraction instance.
     * @return the sum of a MixedFraction object and a Fraction object
     */
    public MixedFraction add(Fraction other) {
        var sum = new MixedFraction();
        int denominator, num;
        toFraction();
        if (getDenominator() == other.getDenominator()) {
            denominator = getDenominator();
            num = getNumerator() + other.getDenominator();
        } else {
            denominator = computeLCM(getDenominator(), other.getDenominator());
            num = denominator / getDenominator() * getNumerator()
                    + denominator / other.getDenominator() * other.getDenominator();
        }
        toMixedFraction();
        sum.setNumerator(num);
        sum.setDenominator(denominator);
        sum.simplify();
        sum.toMixedFraction();

        return sum;
    }

    /**
     * Adds two Mixed Fractions and overloads the add method of Fraction. <br>
     * <p>
     * Algorithm:
     * 1.
     * 2.
     * 3.
     *
     * @param
     * @return
     */
    public MixedFraction add(MixedFraction other) {
        var sum = new MixedFraction();
        int denominator, num;
        toFraction();
        other.toFraction();
        if (getDenominator() == other.getDenominator()) {
            denominator = getDenominator();
            num = getNumerator() + other.getNumerator();
        } else {
            denominator = computeLCM(getDenominator(), other.getDenominator());
            num = denominator / getDenominator() * getNumerator()
                    + denominator / other.getDenominator() * other.getNumerator();
        }
        toMixedFraction();
        other.toMixedFraction();
        sum.setWhole_number(this.getWhole_number() + other.getWhole_number());
        sum.setNumerator(num);
        sum.setDenominator(denominator);
        sum.simplify();
        sum.toMixedFraction();

        return sum;
    }

    /**
     * Calculates difference of two Fractions and overrides subtract method from parent <br>
     *
     * @param other other Fraction to subtract
     * @return the difference of this Mixed Fraction and another Fraction
     */
    public MixedFraction subtract(Fraction other) {
        var subtract = new MixedFraction();
        int denominator, num;
        toFraction();
        if (getDenominator() == other.getDenominator()) {
            denominator = getDenominator();
            num = getNumerator() + other.getDenominator();
        } else {
            denominator = computeLCM(getDenominator(), other.getDenominator());
            num = denominator / getDenominator() * getNumerator()
                    - denominator / other.getDenominator() * other.getDenominator();
        }
        toMixedFraction();
        subtract.setNumerator(num);
        subtract.setDenominator(denominator);
        subtract.simplify();
        subtract.toMixedFraction();

        return subtract;
    }

    /**
     * Computes for the difference of two Fractions and overloads subtract method. <br>
     *
     * @param other
     * @return the difference of two Mixed Fractions
     */
    public MixedFraction subtract(MixedFraction other) {
        var subtract = new MixedFraction();
        int denominator, num;
        toFraction();
        other.toFraction();
        if (getDenominator() == other.getDenominator()) {
            denominator = getDenominator();
            num = getNumerator() - other.getNumerator();
        } else {
            denominator = computeLCM(getDenominator(), other.getDenominator());
            num = denominator / getDenominator() * getNumerator()
                    - denominator / other.getDenominator() * other.getNumerator();
        }
        toMixedFraction();
        subtract.setNumerator(num);
        subtract.setDenominator(denominator);
        subtract.simplify();
        subtract.toMixedFraction();

        return subtract;
    }

    /**
     * Computes the product of a Mixed Fraction and another Fraction, and overrides multiplyBy method. <br>
     *
     * @param other other Fraction to multiply with
     * @return the product of a Mixed Fraction and another Fraction
     */
    public MixedFraction multiplyBy(Fraction other) {
        var product = new MixedFraction();
        int num = getNumerator() * other.getNumerator();
        int denominator = getDenominator() * other.getDenominator();
        product.setNumerator(num);
        product.setDenominator(denominator);
        product.simplify();
        return product;
    }

    /**
     * Computes the product of two Mixed Fractions and overloads multiplyBy method. <br>
     * @param other
     * @return product
     */
    public MixedFraction multiplyBy(MixedFraction other) {
        var product = new MixedFraction();
        int num, denominator, wN, num2, den2, wN2;
        wN = getWhole_number();
        num = getNumerator();
        denominator = getDenominator();
        num = (wN * denominator) + num;
        wN2 = other.getWhole_number();
        num2 = other.getNumerator();
        den2 = other.getDenominator();
        num2 = (wN2 * den2) + num2;
        num = num * num2;
        denominator = denominator * den2;
        wN = num / denominator;
        num = num % denominator;
        product.setWhole_number(wN);
        product.setNumerator(num);
        product.setDenominator(denominator);
        product.simplify();
        return product;
    }

    /**
     * Computes for the quotient of a Mixed Fraction and other Fraction, and overrides divideBy method. <br>

     * @param other
     * @return quotient
     */
    public MixedFraction divideBy(Fraction other) {
        var quotient = new MixedFraction();

        // numerator into improper
        int num = (getDenominator() * getWhole_number()) + getNumerator();
        int denominator;
        int whole;

        // dividing two fractions
        num = num * other.getDenominator();
        denominator = getDenominator() * other.getNumerator();

        // into mixed fraction
        whole = num / denominator;
        num = num % denominator;

        quotient.setNumerator(num);
        quotient.setDenominator(denominator);
        quotient.setWhole_number(whole);
        quotient.simplify();

        return quotient;
    }   // end of the divideBy method

    /**
     * @param other Mixed Fraction to divide by
     * @return the quotient of two Mixed Fractions
     */
    public MixedFraction divideBy(MixedFraction other) {
        var quotient = new MixedFraction();

        // numerators into improper
        toFraction();
        int num = getNumerator();
        other.toFraction();
        int otherNum = other.getNumerator();
        int denominator;

        // dividing the two fractions
        num = num * other.getDenominator();
        denominator = getDenominator() * otherNum;

        // into mixed fraction
        if (denominator != 0) {
            quotient.setDenominator(denominator);
            quotient.setWhole_number(0);
            quotient.setNumerator(num);
            quotient.simplify();
            quotient.toMixedFraction();
        }

        return quotient;
    }   // end of the divideBy method

    /**
     * Overrides toString method. <br>
     *
     * @return a string containing the mixed fraction
     */
    public String toString() {
        if (getWhole_number() == 0) {
            // from "0 1/2" to "1/2"
            return (getNumerator() + "/" + getDenominator());
        }
        if (getDenominator() == 1) {
            // from "1 2/1" to "3"
            return ("" + (getWhole_number() + getNumerator()));
        } else {
            // from "1 1/2" to "1 1/2"
            return (getWhole_number() + " " + getNumerator() + "/" + getDenominator());
        }
    }   // end of the toString method

    /**
     * @return the decimal value <br>
     */
    public double toDouble() {
        return (whole_number + 1.0 * getNumerator() / getDenominator());
    }

    /**
     * @return the reciprocal of a Mixed Fraction object
     */
    public MixedFraction reciprocal() {
        var result = new MixedFraction();
        int tempD = getDenominator();
        result.setDenominator(getNumerator());
        result.setNumerator(tempD);
        return result;
    }
}
