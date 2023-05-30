package at.fhj.msd;

public class Calculator {

    public double add(double number1, double number2){
        return number1+number2;
    }
    public double minus(double number1, double number2){
        return number1-number2;
    }
    public double multiply(double number1, double number2){
        return number1*number2;
    }
    public double divide(double number1, double number2){

        if (number2 == 0) {
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
