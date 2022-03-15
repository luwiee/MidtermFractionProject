package prog2.midgroup2;

/**
 * The Fraction class is a template for objects that contain
 * a fraction - numerator/denominator
 *
 * @author Lawrence T. Miguel II
 */
import java.util.Scanner;
public class Fraction {
    static Scanner read = new Scanner(System.in);
    // Class data-fields
    /**
     * Stores the numerator of the Fraction object
     */
    private int numerator;

    /**
     * Stores the denominator of the Fraction object
     */
    private int denominator;

    /**
     * Default Constructor for the Fraction object
     * Sets a fraction with the numerator and denominator's value as 0 and 1 <br>
     * This constructor creates a Fraction whose value is equivalent to 0 <br>
     * Usage: Fraction fraction = new Fraction();
     **/

    public Fraction() {

        numerator = 0;
        denominator = 1;
    }
//    public void message(){
//        System.out.println("Input the numerator");
//
//    }

    /**
     * Overload Constructor for the Fraction object with a whole number as a parameter <br>
     * Sets a fraction with the numerator as the whole number and denominator as 1 <br>
     *
     * @param wholeNumVal Usage: Fraction fraction = new Fraction(2);
     */
    public Fraction(int wholeNumVal) {
        this.numerator = wholeNumVal;
        denominator = 1;
    }

	/*
	Alternative version by calling the Fraction overload constructor of parameter numerator, and denominator
	Setting denominator as 1.
		public Fraction(int wholeNumVal) {
		   this(wholeNumVal, 1);
		}
	*/

    /**
     * Overload Constructor for the Fraction object with both numerator and denominator as a parameter <br>
     * Explicitly defining the numerator and denominator of the Fraction object <br>
     * Usage: Fraction fraction = new Fraction(5, 2); <br>
     *
     * @param numerator   passes a value for the Fraction's numerator
     * @param denominator passes a value for the Fraction's denominator
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * Accessor/Getter Method <br>
     *
     * @return the value of the numerator of this fraction
     */
    public int getNumerator() {

        return this.numerator;
    }

    /**
     * Mutator/Setter Method <br>
     *
     * @param numerator sets the value of the numerator of this fraction to numerator
     */
    public void setNumerator(int numerator) {

        this.numerator = numerator;
    }

    /**
     * Accessor/Getter Method <br>
     *
     * @return the value of the denominator of this fraction
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Mutator/Setter Method <br>
     *
     * @param denom sets the value of the denominator of this fraction to denom
     */
    public void setDenominator(int denom) {
        denominator = denom;
    }

    /**
     * String form of the Fraction object.
     *
     * @return a string form of the fraction following the format numerator/denominator
     **/
    public String toString() {  // this is an overridden method from the Object class
        return (numerator + "/" + denominator);
    }

    /**
     * Computes for the decimal equivalent of a Fraction.
     *
     * @return the equivalent value of the fraction in double format
     */
    public double toDouble() {
        return (double) numerator / denominator;
    }

//    Rhyen's mental health is unstable but he will still do the code anyways
    /**
     * Computes for the sum of two Fractions. <br><br>
     * <p>
     * Algorithm:
     * 1.
     * 2.
     *
//     * @param other another Fraction object
     * @return the sum of two Fractions
     */
//    public Fraction add(Fraction other) {
//        Fraction sum = new Fraction();
//        int denominator, numerator = 0;
//        if (this.denominator == other.getDenominator()) { // if the denominators are equal
//            denominator = this.denominator;
//            numerator = numerator + other.getNumerator();
//        } else { // if the denominators are not equal
//            denominator = computeLCM(this.denominator, other.getDenominator());
//            numerator = denominator / this.denominator * numerator + denominator / other.getDenominator() * other.getNumerator();
//        }
//        sum.setNumerator(numerator);
//        sum.setDenominator(denominator);
//        sum.simplify();
//        return sum;
//    }
    public Fraction add(Fraction fractionTwo) {

        int numer = (numerator * fractionTwo.getDenominator()) +
                (fractionTwo.getNumerator() * denominator);
        int denr = denominator * fractionTwo.getDenominator();
//        toMixed(1,4);
        return new Fraction(numer,denr);
    }
    public String addMix(Fraction fractionTwo) {

        int numer = (numerator * fractionTwo.getDenominator()) +
                (fractionTwo.getNumerator() * denominator);
        int denr = denominator * fractionTwo.getDenominator();
//        return new Fraction.toMixed(numer, denr);
        String mixedNum;
        int wholeNum;
        wholeNum = Math.floorDiv(numer,denr);
        mixedNum = wholeNum + " " + (numer - wholeNum*denr) + "/" + denr;
        return mixedNum;
    }

    /**
     * Computes for the difference of two Fractions. <br>
     * Algorithm:
     * 1.
     * 2.
     *
     * @param other
     * @return difference
     */
    public Fraction subtract(Fraction other) {
        Fraction difference = new Fraction();
        int denominator = 0, numerator = 0;
        if (this.denominator == other.getDenominator()) { // if the denominators are equal
            denominator = this.denominator;
            numerator = this.numerator - other.getNumerator();
        } else { // if the denominators are not equal
            denominator = computeLCM(this.denominator, other.getDenominator());
            numerator = (denominator / this.denominator * this.numerator) - (denominator / other.getDenominator() * other.getNumerator());
        }
        difference.setNumerator(numerator);
        difference.setDenominator(denominator);
        difference.simplify();
        return difference;
    }

    /**
     * Computes the product of a Fraction and another Fraction. <br>
     * Algorithm:
     * 1.
     * 2.
     *
     * @param other Fraction to multiply with
     * @return the product of a Fraction and another Fraction
     */
    public Fraction multiplyBy(Fraction other) {
        Fraction product = new Fraction();
        int numerator = this.numerator * other.getNumerator();
        int denominator = this.denominator * other.getDenominator();
        product.setNumerator(numerator);
        product.setDenominator(denominator);
        product.simplify();
        return product;
    }

    /**
     * Computes for the quotient of two Fractions. <br>
     * Algorithm:
     * 1.
     * 2.
     *
     * @param other another Fraction that serves as the divisor
     * @return the quotient of a Fraction and another Fraction
     */
    public Fraction divideBy(Fraction other) {
        Fraction quotient = new Fraction();
        int newNum = numerator * other.getDenominator();
        int newDen = denominator * other.getNumerator();
        quotient.setNumerator(newNum);
        quotient.setDenominator(newDen);
        quotient.simplify();
        return quotient;
    }   // end of the divide method

    /**
     * Returns the reciprocal of a Fraction object. <br>
     * Algorithm:
     * 1.
     * 2.
     *
     * @param fraction_object receives the passed Fraction object instance.
     * @return reciprocal of the passed Fraction object instance
     */
    public Fraction reciprocal(Fraction fraction_object) {
        var result = new Fraction();
        int temporaryDenominator = getDenominator();
        result.setDenominator(fraction_object.getNumerator());
        result.setNumerator(temporaryDenominator);
        return result;
    }


    public void compareFraction(Fraction other) {
        int numerator1 = numerator; // initial value for the 1st Fraction numerator
        int numerator2 = other.getNumerator(); // initial value for the 2nd Fraction numerator
        int denominator1 = denominator; // initial value for the 1st Fraction denominator
        int denominator2 = other.getDenominator(); // placeholder for the 2nd Fraction denominator
        int comparison = numerator1 * denominator2 - numerator2 * denominator1;
        if (comparison > 0) {
            System.out.println(numerator1 + "/" + denominator1 + " is greater than " + numerator2 + "/" + denominator2);
        } else if (comparison == 0) {
            System.out.println(numerator1 + "/" + denominator1 + " and " + numerator2 + "/" + denominator2 + " are equal");
        } else {
            System.out.println(numerator1 + "/" + denominator1 + " is lesser than " + numerator2 + "/" + denominator2);
        }
    }

    /**
     * Simplifies the fraction to its simplest form.
     */
    public void simplify() {
        if (getNumerator() != 0) {
            int gcd = computeGCD(numerator, denominator);
            int newNumerator = numerator / gcd;
            int newDenominator = denominator / gcd;
            setNumerator(newNumerator);
            setDenominator(newDenominator);
        }
    }

    /**
     * Computes the greatest common divisor of the numerator and denominator. <br>
     * by
     *
     * @param numerator   value assigned to data member, numerator
     * @param denominator value assigned to data member, denominator
     * @return greatest common divisor
     */
    private int computeGCD(int numerator, int denominator) {
        int remainder = 1;
        while (remainder != 0) {
            remainder = denominator % numerator;
            denominator = numerator;
            numerator = remainder;
        }
        return denominator;
    }

    /**
     * Computes for the LCM (least common multiplier) of two denominators. <br>
     *
     * @param d1 first denominator
     * @param d2 second denominator
     * @return least common multiplier
     */
    protected int computeLCM(int d1, int d2) {
        int lcm = Math.max(d1, d2);

        while (lcm % d1 != 0 || lcm % d2 != 0) {
            ++lcm;
        }

        return lcm;
    }
    public final void contant() {
        Fraction display = new Fraction();
        Fraction display2 = new Fraction(1, 2);
        System.out.println("\n\n");
        System.out.println("Enter numerator and denominator respectively");
        final int taas = Integer.parseInt(read.nextLine());
        final int baba = Integer.parseInt(read.nextLine());
        Fraction f1 = new Fraction(taas, baba);
        System.out.println(f1.toString());
        System.out.println("Enter numerator and denominator respectively for the second inputs");
       final int taas2 = Integer.parseInt(read.nextLine());
       final int baba2 = Integer.parseInt(read.nextLine());
        Fraction f2 = new Fraction(taas2, baba2);
        Fraction f3 = f1.add(f2);
    }
    public static String toMixed(int numerator, int denominator){
        String mixedNum;
        int wholeNum;
        wholeNum = Math.floorDiv(numerator,denominator);
        mixedNum = wholeNum + " " + (numerator - wholeNum*denominator) + "/" + denominator;
        return mixedNum;
    }
    public void addition(){
        System.out.println("Enter fraction or Mixed depending on your preference: ");
        String preference = read.nextLine();
        System.out.println("You have entered: "+preference);
        if(preference.equalsIgnoreCase("fraction")) {
            System.out.println("\n\n");
            System.out.println("Enter numerator and denominator respectively");
             int taas =  Integer.parseInt(read.nextLine());
             int baba = Integer.parseInt(read.nextLine());
            Fraction f1 = new Fraction(taas, baba);
            System.out.println(f1.toString());
            System.out.println("Enter numerator and denominator respectively for the second inputs");
             int taas2 = Integer.parseInt(read.nextLine());
             int baba2 = Integer.parseInt(read.nextLine());
            Fraction f2 = new Fraction(taas2, baba2);
              Fraction f3 = f1.add(f2);
              System.out.println("result " +f3);

        }
        else if(preference.equalsIgnoreCase("mixed")){
            MixedFraction call = new MixedFraction();
            System.out.println("\n\n");
            System.out.println("Enter numerator and denominator respectively");
            int taas =  Integer.parseInt(read.nextLine());
            int baba = Integer.parseInt(read.nextLine());
            call.toFraction();
            Fraction f1 = new Fraction(taas, baba);
            System.out.println(f1.toString());
            System.out.println("Enter numerator and denominator respectively for the second inputs");
            int taas2 = Integer.parseInt(read.nextLine());
            int baba2 = Integer.parseInt(read.nextLine());
//            call.toFraction();
            int numer = (taas * baba2) + (taas2 * baba);
            int denr = baba * baba2;

//            Fraction f2 = new Fraction(taas2, baba2);
//            Fraction f3 = f1.add(f2);
            System.out.println("result " + toMixed(numer,denr));

        }
        else{
            System.out.println("Invalid! pls input again!");
            addition();
        }
    }
    public void subtraction(){
        System.out.println("Enter fraction or Mixed depending on your preference: ");
        String preference = read.nextLine();
        System.out.println("You have entered: "+preference);
        if(preference.equalsIgnoreCase("fraction")) {
            System.out.println("\n\n");
            System.out.println("Enter numerator and denominator respectively");
            int taas =  Integer.parseInt(read.nextLine());
            int baba = Integer.parseInt(read.nextLine());
            Fraction f1 = new Fraction(taas, baba);
            System.out.println(f1.toString());
            System.out.println("Enter numerator and denominator respectively for the second inputs");
            int taas2 = Integer.parseInt(read.nextLine());
            int baba2 = Integer.parseInt(read.nextLine());
            Fraction f2 = new Fraction(taas2, baba2);
            Fraction f3 = f1.subtract(f2);
            System.out.println("result " +f3);

        }
        else if(preference.equalsIgnoreCase("mixed")){
            MixedFraction call = new MixedFraction();
            System.out.println("\n\n");
            System.out.println("Enter numerator and denominator respectively");
            int taas =  Integer.parseInt(read.nextLine());
            int baba = Integer.parseInt(read.nextLine());
            call.toFraction();
            Fraction f1 = new Fraction(taas, baba);
            System.out.println(f1.toString());
            System.out.println("Enter numerator and denominator respectively for the second inputs");
            int taas2 = Integer.parseInt(read.nextLine());
            int baba2 = Integer.parseInt(read.nextLine());
//            call.toFraction();
//            Fraction f2 = new Fraction(taas2, baba2);
//            Fraction f3 = call.subtract(f1);
//            System.out.println("result " + f3);
            if (baba == baba2) { // if the denominators are equal
                taas = taas - taas2;
            } else { // if the denominators are not equal
                baba = computeLCM(baba, baba2);
                taas = (baba / baba * taas) - (baba / baba2 * taas2);
            }
            System.out.println("result is " + toMixed(taas, baba));
        }
        else{
            System.out.println("Invalid! Pls input again!");
            subtraction();
        }
    }
    public void multiplication(){
        System.out.println("Enter fraction or Mixed depending on your preference: ");
        String preference = read.nextLine();
        System.out.println("You have entered: "+preference);
        if(preference.equalsIgnoreCase("fraction")) {
            System.out.println("\n\n");
            System.out.println("Enter numerator and denominator respectively");
            int taas =  Integer.parseInt(read.nextLine());
            int baba = Integer.parseInt(read.nextLine());
            Fraction f1 = new Fraction(taas, baba);
            System.out.println(f1.toString());
            System.out.println("Enter numerator and denominator respectively for the second inputs");
            int taas2 = Integer.parseInt(read.nextLine());
            int baba2 = Integer.parseInt(read.nextLine());
            Fraction f2 = new Fraction(taas2, baba2);
            Fraction f3 = f1.multiplyBy(f2);
            System.out.println("result " +f3);

        }
        else if(preference.equalsIgnoreCase("mixed")){
            MixedFraction call = new MixedFraction();
            System.out.println("\n\n");
            System.out.println("Enter numerator and denominator respectively");
            int taas =  Integer.parseInt(read.nextLine());
            int baba = Integer.parseInt(read.nextLine());
            call.toFraction();
            Fraction f1 = new Fraction(taas, baba);
            System.out.println(f1.toString());
            System.out.println("Enter numerator and denominator respectively for the second inputs");
            int taas2 = Integer.parseInt(read.nextLine());
            int baba2 = Integer.parseInt(read.nextLine());
//            call.toFraction();
//            Fraction f2 = new Fraction(taas2, baba2);
//            Fraction f3 = call.multiplyBy(f1);
//            System.out.println("result" + f3);
            int numerator = taas * taas2;
            int denominator = baba * baba2;
            System.out.println("Result is " + toMixed(numerator, denominator));
        }
        else{
            System.out.println(" Invalid, input again!");
            multiplication();
        }
    }
    public void division(){
        System.out.println("Enter fraction or Mixed depending on your preference: ");
        String preference = read.nextLine();
        System.out.print("You have entered: "+preference);
        if(preference.equalsIgnoreCase("fraction")) {
            System.out.println("\n\n");
            System.out.println("Enter numerator and denominator respectively");
            int taas =  Integer.parseInt(read.nextLine());
            int baba = Integer.parseInt(read.nextLine());
            if(taas == 0 && baba ==0){
                System.out.println("0/0 is indeterminate! input again!");
                division();
            }
            else if (baba == 0){
                System.out.println("You cannot divide a number by zero! input again!");
                division();
            }
            Fraction f1 = new Fraction(taas, baba);
            System.out.println(f1.toString());
            System.out.println("Enter numerator and denominator respectively for the second inputs");
            int taas2 = Integer.parseInt(read.nextLine());
            int baba2 = Integer.parseInt(read.nextLine());
            if(taas2 == 0 && baba2 ==0){
                System.out.println("0/0 is indeterminate! input again!");
                division();
            }
            else if (baba2 == 0){
                System.out.println("You cannot divide a number by zero");
                division();
            }
            Fraction f2 = new Fraction(taas2, baba2);
            Fraction f3 = f1.divideBy(f2);
            System.out.println("result" +f3);

        }
        else if(preference.equalsIgnoreCase("mixed")){
            MixedFraction call = new MixedFraction();
            System.out.println("\n\n");
            System.out.println("Enter numerator and denominator respectively");
            int taas =  Integer.parseInt(read.nextLine());
            int baba = Integer.parseInt(read.nextLine());
            call.toFraction();
            Fraction f1 = new Fraction(taas, baba);
            System.out.println(f1.toString());
            System.out.println("Enter numerator and denominator respectively for the second inputs");
            int taas2 = Integer.parseInt(read.nextLine());
            int baba2 = Integer.parseInt(read.nextLine());
//            call.toFraction();
//            Fraction f2 = new Fraction(taas2, baba2);
//            Fraction f3 = call.divideBy(f1);
//            System.out.println("result" + f3);
            int newNum = taas * baba2;
            int newDen = baba * taas2;
            System.out.println("Result is " + toMixed(newNum, newDen));
        }
        else{
            System.out.println("Invalid! pls input again");
            division();
        }
    }

} //end of Fraction class

