package prog2.midgroup2;

/**
 * GroupName /Group Number: _____
 * CLASS CODE &amp; Schedule: ______
 * Date: _____________
 *
 * Summary of exception handling added to the MixedFraction project:
 * 1. description of what is being targeted by the
 * exception handling code...
 * // copy of the code as used in the code
 *
 * 2. description of what is being targeted by the
 * * exception handling code...


 * The InvalidMixedFractionException class is thrown
 * to prevent an invalid Mixed Fraction object
 * from being created
 *
 * @author Lawrence Miguel II
 * @version 0.1
 */
public class InvalidMixedFractionException extends Exception {
    /**
     * @param message passes the obtained String parameter containing the Exception to the Superclass' constructor
     */
    InvalidMixedFractionException(String message) {
       super(message);
    }

}
