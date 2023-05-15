package at.fhj.msd;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double number1 = 2.0;
        double number2 = 4.0;

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

        //+
        System.out.printf("Operation: %f / %f = ", number1, number2);
        System.out.println(calculator.divide(number1,number2));
        System.out.println();

    }

}
