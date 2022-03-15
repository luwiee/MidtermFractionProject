package prog2.midgroup2;

import java.util.Scanner;
public class FractionTester extends Fraction{
    public static Scanner sc = new Scanner(System.in); // creating object of Scanner class
    static  String smile = "\uD83D\uDE0A";
    static String love = "\uD83D\uDC9C";
    static String woman = "\uD83D\uDC67";
    static String man = "\uD83D\uDC66";

    public static void main(String[] args) throws Exception {
        showIntroduction();
        sc.nextLine();


        while (true) {
            showMenu(); //Displays the menu
        }
    }

    public static void showIntroduction() {
        System.out.println("\n");
        System.out.println("College of Information and Computing Sciences");
        System.out.println(" Saint Louis University");
        System.out.println(" Baguio City ");
        System.out.println("---------------------------------------------");
        for(int index=0; index < 10; index++){
            System.out.print(smile + love + smile + "");
        }
        System.out.println("\n");
        System.out.println(" Group 4 "+ smile);
        System.out.println(" Developers: \n Aliyah Javier" + woman + "\n Eduard Tadeo" + man
                + "\n Lawrence Miguel" + man + "\n Rhyen Natividad" + man);
        System.out.println("\n");
        System.out.print("Please press a key to start the program...");
    }

    public static Fraction createFraction() throws Exception {
        int denominator;
        int numerator;
        System.out.println();

        System.out.println("Enter numerator and denominator respectively (Separated by enter)");
        numerator = Integer.parseInt(read.nextLine());
        denominator = Integer.parseInt(read.nextLine());
        Fraction fraction = new Fraction(numerator, denominator);
        System.out.println(fraction);

        return fraction;
    }

    public static MixedFraction createMixedFraction() throws Exception {
        int denominator;
        int numerator;
        System.out.println();

        System.out.println("Enter whole number, numerator, and denominator respectively (Separated by enter) (Separated by enter)");
        int wholeNumber = Integer.parseInt(read.nextLine());
        numerator = Integer.parseInt(read.nextLine());
        denominator = Integer.parseInt(read.nextLine());
        MixedFraction mFraction = new MixedFraction(wholeNumber ,numerator, denominator);
        System.out.println(mFraction);

        return mFraction;
    }

    public static int getFractionType() {
        System.out.println();
        System.out.println("Tye of Fraction");
        System.out.println("1: Proper Fraction");
        System.out.println("2: Mixed Fraction");

        return Integer.parseInt(sc.nextLine());
    }


    //Methods for adding fractions
    public static void mixedPlusMixed(MixedFraction mFractionOne, MixedFraction mFractionTwo) {
        MixedFraction mResult = mFractionOne.add(mFractionTwo);

        System.out.print(mFractionOne + " + " +
                mFractionTwo + " = " +
                mResult + " or ");

        mResult.simplify();

        System.out.println(mResult);
    }

    public static void mixedPlusProper(MixedFraction mFractionOne, Fraction fractionTwo) {
        MixedFraction mResult = mFractionOne.add(fractionTwo);

        System.out.print(mFractionOne + " + " +
                fractionTwo + " = " +
                mResult.toString() + " or ");

        mResult.simplify();

        System.out.println(mResult);
    }

    public static void properPlusProper(Fraction fractionOne, Fraction fractionTwo) throws Exception {
        Fraction result = fractionOne.add(fractionTwo);
        System.out.print(fractionOne + " + " +
                fractionTwo + " = " +
                result.toString() + " or ");

        result.simplify();

        System.out.println(result);
    }//End of methods for adding fractions

    //methods for subtracting fractions
    public static void mixedMinusMixed(MixedFraction mFractionOne, MixedFraction mFractionTwo) {
        MixedFraction mResult = mFractionOne.subtract(mFractionTwo);

        System.out.print(mFractionOne + " - " +
                mFractionTwo + " = " +
                mResult.toString() + " or ");

        mResult.simplify();

        System.out.println(mResult);
    }

    public static void mixedMinusProper(MixedFraction mFractionOne, Fraction fractionTwo) {
        MixedFraction mResult = mFractionOne.subtract(fractionTwo);

        System.out.print(mFractionOne + " - " +
                fractionTwo + " = " +
                mResult.toString() + " or ");

        mResult.simplify();

        System.out.println(mResult);
    }

    public static void properMinusProper(Fraction fractionOne, Fraction fractionTwo) {
        Fraction result = fractionOne.subtract(fractionTwo);
        System.out.print(fractionOne + " - " +
                fractionTwo + " = " +
                result.toString() + " or ");

        result.simplify();

        System.out.println(result);
    }//End of Methods for subtracting fractions

    //methods for multiplying fractions
    public static void mixedTimesMixed(MixedFraction mFractionOne, MixedFraction mFractionTwo) {
        MixedFraction mResult = mFractionOne.multiplyBy(mFractionTwo);

        System.out.print(mFractionOne + " * " +
                mFractionTwo + " = " +
                mResult.toString() + " or ");

        mResult.simplify();

        System.out.println(mResult);
    }

    public static void mixedTimesProper(MixedFraction mFractionOne, Fraction fractionTwo) {
        MixedFraction mResult = mFractionOne.multiplyBy(fractionTwo);

        System.out.print(mFractionOne + " * " +
                fractionTwo + " = " +
                mResult.toString() + " or ");

        mResult.simplify();

        System.out.println(mResult);
    }

    public static void properTimesProper(Fraction fractionOne, Fraction fractionTwo) {
        Fraction result = fractionOne.multiplyBy(fractionTwo);
        System.out.print(fractionOne + " * " +
                fractionTwo + " = " +
                result.toString() + " or ");

        result.simplify();

        System.out.println(result);
    }//End of Methods for multiplying fractions

    // methods for dividing fractions
    public static void mixedDividedByMixed(MixedFraction mFractionOne, MixedFraction mFractionTwo) {
        MixedFraction mResult = mFractionOne.divideBy(mFractionTwo);

        System.out.print(mFractionOne + " / " +
                mFractionTwo + " = " +
                mResult.toString() + " or ");

        mResult.simplify();

        System.out.println(mResult);
    }

    public static void mixedDividedByProper(MixedFraction mFractionOne, Fraction fractionTwo) {
        MixedFraction mResult = mFractionOne.divideBy(fractionTwo);

        System.out.print(mFractionOne + " / " +
                fractionTwo + " = " +
                mResult.toString() + " or ");

        mResult.simplify();

        System.out.println(mResult);
    }

    public static void properDividedByProper(Fraction fractionOne, Fraction fractionTwo) {
        Fraction result = fractionOne.divideBy(fractionTwo);
        System.out.print(fractionOne + " / " +
                fractionTwo + " = " +
                result.toString() + " or ");

        result.simplify();

        System.out.println(result);
    }//End of Methods for multiplying fractions

    public static void showMenu() throws Exception {
        System.out.println();
        System.out.println("1: ADD");
        System.out.println("2: SUBTRACT");
        System.out.println("3: MULTIPLY");
        System.out.println("4: DIVIDE");
        System.out.println("5: CONVERT FRACTION TO DECIMAL");
        System.out.println("6: Quit");

        System.out.print(">>> ");
        int ch = Integer.parseInt(sc.nextLine()); // reading user's choice

        int typeFraction;

        Fraction fractionOne = null;
        Fraction fractionTwo = null;
        MixedFraction mFractionOne = null;
        MixedFraction mFractionTwo = null;
        switch (ch) {
            case 1 -> {
                typeFraction = getFractionType();
                if (typeFraction == 1) {
                    fractionOne = createFraction();
                } else if (typeFraction == 2) {
                    mFractionOne = createMixedFraction();
                }
                typeFraction = getFractionType();
                if (typeFraction == 1) {
                    fractionTwo = createFraction();
                } else if (typeFraction == 2) {
                    mFractionTwo = createMixedFraction();
                }
                if (fractionOne == null) {
                    if (fractionTwo == null) {
                        mixedPlusMixed(mFractionOne, mFractionTwo);
                    } else {
                        mixedPlusProper(mFractionOne, fractionTwo);
                    }
                } else {
                    if (fractionTwo == null) {
                        mixedPlusProper(mFractionTwo, fractionOne);
                    } else {
                        properPlusProper(fractionOne, fractionTwo);
                    }
                }
                System.out.print("press enter to continue...");
                sc.nextLine();
            }
            case 2 -> {
                typeFraction = getFractionType();
                if (typeFraction == 1) {
                    fractionOne = createFraction();
                } else if (typeFraction == 2) {
                    mFractionOne = createMixedFraction();
                }
                typeFraction = getFractionType();
                if (typeFraction == 1) {
                    fractionTwo = createFraction();
                } else if (typeFraction == 2) {
                    mFractionTwo = createMixedFraction();
                }
                if (fractionOne == null) {
                    if (fractionTwo == null) {
                        mixedMinusMixed(mFractionOne, mFractionTwo);
                    } else {
                        mixedMinusProper(mFractionOne, fractionTwo);
                    }
                } else {
                    if (fractionTwo == null) {
                        mixedMinusProper(mFractionTwo, fractionOne);
                    } else {
                        properMinusProper(fractionOne, fractionTwo);
                    }
                }
                System.out.print("press enter to continue...");
                sc.nextLine();
            }
            case 3 -> {
                typeFraction = getFractionType();
                if (typeFraction == 1) {
                    fractionOne = createFraction();
                } else if (typeFraction == 2) {
                    mFractionOne = createMixedFraction();
                }
                typeFraction = getFractionType();
                if (typeFraction == 1) {
                    fractionTwo = createFraction();
                } else if (typeFraction == 2) {
                    mFractionTwo = createMixedFraction();
                }
                if (fractionOne == null) {
                    if (fractionTwo == null) {
                        mixedTimesMixed(mFractionOne, mFractionTwo);
                    } else {
                        mixedTimesProper(mFractionOne, fractionTwo);
                    }
                } else {
                    if (fractionTwo == null) {
                        mixedTimesProper(mFractionTwo, fractionOne);
                    } else {
                        properTimesProper(fractionOne, fractionTwo);
                    }
                }
                System.out.print("press enter to continue...");
                sc.nextLine();
            }
            case 4 -> {
                typeFraction = getFractionType();
                if (typeFraction == 1) {
                    fractionOne = createFraction();
                } else if (typeFraction == 2) {
                    mFractionOne = createMixedFraction();
                }
                typeFraction = getFractionType();
                if (typeFraction == 1) {
                    fractionTwo = createFraction();
                } else if (typeFraction == 2) {
                    mFractionTwo = createMixedFraction();
                }
                if (fractionOne == null) {
                    if (fractionTwo == null) {
                        mixedDividedByMixed(mFractionOne, mFractionTwo);
                    } else {
                        mixedDividedByProper(mFractionOne, fractionTwo);
                    }
                } else {
                    if (fractionTwo == null) {
                        mixedDividedByProper(mFractionTwo, fractionOne);
                    } else {
                        properDividedByProper(fractionOne, fractionTwo);
                    }
                }
                System.out.print("press enter to continue...");
                sc.nextLine();
            }
            case 5 -> {
                typeFraction = getFractionType();
                if (typeFraction == 1) {
                    fractionOne = createFraction();
                } else if (typeFraction == 2) {
                    mFractionOne = createMixedFraction();
                }

                if (typeFraction == 1) {
                    System.out.println(fractionOne.toDouble());
                } else if (typeFraction == 2) {
                    System.out.println(mFractionOne.toDouble());
                }

                System.out.print("press enter to continue...");
                sc.nextLine();
            }
            case 6 -> {
                System.out.println("\nThank your for using our program! Feel free to come back.");
                for (int index = 0; index < 35; index++) {
                    System.out.print(smile + "");
                }
                System.exit(0);
            }
            default -> System.err.println("Invalid choice! Please make a valid choice.");
        }
    }
    
}
