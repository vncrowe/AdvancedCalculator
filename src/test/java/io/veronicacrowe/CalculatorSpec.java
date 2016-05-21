
package io.veronicacrowe;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by veronicacrowe on 5/1/16.
 */
public class CalculatorSpec {

    double delta = 10e-15;

    @Test
    public void addTest() {
        double expectedValue = 4;
        double actualValue = Calculator.add(2, 2);
        assertEquals("Adding two numbers together the value should be 4", expectedValue, actualValue,delta);

    }

    @Test
    public void differenceTest() {
        double expectedValue = 4;
        double actualValue = Calculator.subtract(6, 2);
        assertEquals("Subtracting two numbers and the value should be 4", expectedValue, actualValue,delta);

    }

    @Test
    public void productTest() {
        double expectedValue = 4;
        double actualValue = Calculator.multiply(2, 2);
        assertEquals("Multiplying two numbers together the value should be 4", expectedValue, actualValue,delta);
    }

    @Test
    public void divideTest() {
        double expectedValue = 3;
        double actualValue = Calculator.divide(6, 2);
        assertEquals("Dividing two numbers together the value should be 3", expectedValue, actualValue,delta);
    }

    @Test
    public void squareTest(){
        double expectedValue = 4;
        double actualValue = Calculator.square(2);
        assertEquals(expectedValue,actualValue,delta);
    }

    @Test
    public void sqaureRootTest(){
        double expectedValue= 2;
        double actualyValue = Calculator.squareRoot(4);
        assertEquals(expectedValue, expectedValue,delta);

    }

    @Test
    public void exponentExponent(){
        double expectedValue= 4;
        double actualValue = Calculator.exponent(2,2);
        assertEquals(expectedValue, actualValue, delta);
    }

    @Test
    public void inverseTest(){
        double expectedValue= .5;
        double actualValue = Calculator.inverse(2);
        assertEquals(expectedValue, actualValue, delta);
    }

    @Test
    public void invertSignTest(){
        double expectedValue = -1;
        double actualValue = Calculator.invertSign(1);
        assertEquals(expectedValue, actualValue, delta);
    }

    @Test
    public void logTest(){
        double expectedValue= 10;
        double actualValue = Calculator.log(1);
        assertEquals(expectedValue, actualValue, delta);
    }
    
}