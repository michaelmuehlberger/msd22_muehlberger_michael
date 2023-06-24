package at.fhj.msd;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Calculator includes basic math operations
 *
 * Calculator with the operations: add, minus, multiply, divide and faculty
 * @author Michael Muehlberger
 */

public class Calculator {

    /**
     * Logger object used for logging in ex5
     */
    private static Logger logger = LogManager.getLogger();

    /**
     * Creates the sum of two numbers number1 and number2
     * summand1 + summand2 = sum
     *
     * @param number1 first summand
     * @param number2 second summand
     * @return sum of the addition
     * @author Michael Muehlberger
     */
    public double add(double number1, double number2){

        logger.debug("Executing add() method with parameters p1: " + number1 + " and p2: " + number2);

        return number1+number2;
    }

    /**
     * Creates the difference of two numbers number1 and number2
     * minuend - subtrahend = difference
     *
     * @param number1 being the minuend
     * @param number2 being the subtrahend
     * @return difference of operation
     * @author Michael Muehlberger
     */
    public double minus(double number1, double number2){

        logger.debug("Executing minus() method with parameters p1: " + number1 + " and p2: " + number2);

        return number1-number2;
    }

    /**
     * Creates the product of two numbers number1 and number2
     * factor1 * factor2 = product
     *
     * @param number1 first factor
     * @param number2 second factor
     * @return product of the multiplication
     * @author Michael Muehlberger
     */
    public double multiply(double number1, double number2){

        logger.debug("Executing multiply() method with parameters p1: " + number1 + " and p2: " + number2);

        return number1*number2;
    }

    /**
     * Creates the division of two numbers number1 and number2
     * dividend / divisor = quotient
     *
     * @param number1 being the divident
     * @param number2 being the divisor
     * @return quotient of operation
     * @throws ArithmeticException when division by zero
     * @author Michael Muehlberger
     */
    public double divide(double number1, double number2){

        logger.debug("Executing divide() method with parameters p1: " + number1 + " and p2: " + number2);

        if (number2 == 0) {
            logger.error("Division by zero");
            throw new ArithmeticException("Division by zero");
        }
        return number1/number2;
    }

    /**
     * Creates the faculty of a number
     *
     * @param number faculty will be calculated based on this parameter
     * @return faculty of number
     * @author Michael Muehlberger
     */
    public int faculty(int number){

        int faculty = 1;

        if(number<0){
            return 0;
        } else if (number == 0) {
            return 1;
        }

        for(int i = 1; i <= number; i++){
            faculty = faculty * i;
        }

        return faculty;
    }
}
