import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(4.44, calculator.add(2.22, 2.22), 0.01);
    }

    @Test
    public void canSubtract() {
        assertEquals(5.03, calculator.subtract(10.55, 5.52), 0.01);
    }

    @Test
    public void canMultiply() {
        assertEquals(12.90, calculator.multiply(5.56, 2.32), 0.01);
    }

    @Test
    public void canDivide() {
        assertEquals(8.04, calculator.divide(20.67, 2.57), 0.01);
    }


}
