import calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 6, calculator.fact(3), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 5040, calculator.fact(7), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 120, calculator.fact(3), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 24, calculator.fact(6), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding power for True Positive", 1024, calculator.power(4, 5), DELTA);
        assertEquals("Finding power for True Positive", 36, calculator.power(6, 2), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power for False Positive", 6, calculator.power(2, 2), DELTA);
        assertNotEquals("Finding power for False Positive", -7.3, calculator.power(2, 3), DELTA);
    }

    @Test
    public void logTruePositive(){
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), DELTA);
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), DELTA);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Finding natural log for False Positive", 6, calculator.naturalLog(2.4), DELTA);
        assertNotEquals("Finding natural log for False Positive", 7.3, calculator.naturalLog(2.1), DELTA);
    }

    @Test
    public void sqrootTruePositive(){
        assertEquals("Finding square root for True Positive", 4, calculator.squareroot(16), DELTA);
        assertEquals("Finding square root for True Positive", 9, calculator.squareroot(81), DELTA);
    }

    @Test
    public void sqrootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 5, calculator.squareroot(36), DELTA);
        assertNotEquals("Finding square root for False Positive", 4, calculator.squareroot(9), DELTA);
    }
}
