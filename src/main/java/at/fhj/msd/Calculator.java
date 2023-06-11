package at.fhj.msd;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static Logger logger = LogManager.getLogger();

    public double add(double number1, double number2){

        logger.debug("Executing add() method with parameters p1: " + number1 + " and p2: " + number2);

        return number1+number2;
    }
    public double minus(double number1, double number2){

        logger.debug("Executing minus() method with parameters p1: " + number1 + " and p2: " + number2);

        return number1-number2;
    }
    public double multiply(double number1, double number2){

        logger.debug("Executing multiply() method with parameters p1: " + number1 + " and p2: " + number2);

        return number1*number2;
    }
    public double divide(double number1, double number2){

        logger.debug("Executing divide() method with parameters p1: " + number1 + " and p2: " + number2);

        if (number2 == 0) {
            logger.error("Division by zero");
            throw new ArithmeticException("Division by zero");
        }
        return number1/number2;
    }

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
