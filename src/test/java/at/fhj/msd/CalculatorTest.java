package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calc;

    @BeforeEach
    void setup(){
        calc = new Calculator();
    }

    //Test add()
    @DisplayName("Test1 of add() method")
    @Test
    void testAdd1(){
        double result = calc.add(3,4);
        assertEquals(7,result);
    }

    @DisplayName("Test2 of add() method")
    @Test
    void testAdd2(){
        double result = calc.add(5,5);
        assertEquals(10,result);
    }

    @DisplayName("Test3 of add() method")
    @Test
    void testAdd3(){
        double result = calc.add(-1,20);
        assertEquals(19,result);
    }

    //Test minus()
    @DisplayName("Test1 of minus() method")
    @Test
    void testMinus1(){
        double result = calc.minus(15,6);
        assertEquals(9,result);
    }

    @DisplayName("Test2 of minus() method")
    @Test
    void testMinus2(){
        double result = calc.minus(-6,-2);
        assertEquals(-4,result);
    }

    @DisplayName("Test3 of minus() method")
    @Test
    void testMinus3(){
        double result = calc.minus(3,4);
        assertEquals(-1,result);
    }

    //Test multiply()
    @DisplayName("Test1 of multiply() method")
    @Test
    void testMultiply1(){
        double result = calc.multiply(-2,-2);
        assertEquals(4,result);
    }

    @DisplayName("Test2 of multiply() method")
    @Test
    void testMultiply2(){
        double result = calc.multiply(1,6);
        assertEquals(6,result);
    }

    @DisplayName("Test3 of multiply() method")
    @Test
    void testMultiply3(){
        double result = calc.multiply(-3,4);
        assertEquals(-12,result);
    }

    //Test divide()
    @DisplayName("Test1 of divide() method")
    @Test
    void testDivide1(){
        double result = calc.divide(1,8);
        assertEquals(0.125,result);
    }

    @DisplayName("Test2 of divide() method")
    @Test
    void testDivide2(){
        double result = calc.divide(3,4);
        assertEquals(0.75, result);
    }

    @DisplayName("Test3 of divide() method")
    @Test
    void testDivide3(){
        assertThrows(ArithmeticException.class, () -> {
            double result = calc.divide(5,0);
        });
    }

    //Test faculty()

    @DisplayName("Test1 of faculty() method")
    @Test
    void testFaculty1(){
        int result = calc.faculty(-10);
        assertEquals(0, result);
    }

    @DisplayName("Test2 of faculty() method")
    @Test
    void testFaculty2(){
        int result = calc.faculty(0);
        assertEquals(1, result);
    }

    @DisplayName("Test3 of faculty() method")
    @Test
    void testFaculty3(){
        int result = calc.faculty(5);
        assertEquals(120, result);
    }

    @DisplayName("Test4 of faculty() method")
    @Test
    void testFaculty4(){
        int result = calc.faculty(9);
        assertEquals(362880, result);
    }

}
