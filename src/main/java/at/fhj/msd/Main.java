package at.fhj.msd;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Main {

    //Creating a logger
    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double number1 = 5.0;
        double number2 = 2.0;

        //+
        System.out.printf("Operation: %f + %f = ", number1, number2);
        System.out.println(calculator.add(number1,number2));
        System.out.println();

        //-
        System.out.printf("Operation: %f - %f = ", number1, number2);
        System.out.println(calculator.minus(number1,number2));
        System.out.println();

        //*
        System.out.printf("Operation: %f * %f = ", number1, number2);
        System.out.println(calculator.multiply(number1,number2));
        System.out.println();

        ///
        System.out.printf("Operation: %f / %f = ", number1, number2);
        System.out.println(calculator.divide(number1,number2));
        System.out.println();

        //!
        System.out.printf("Operation: !%d = ", (int) number1);
        System.out.println(calculator.faculty((int) number1));
        System.out.println();

        logger.info("It is an info logger.");
        logger.error("It is an error logger.");

    }

}
