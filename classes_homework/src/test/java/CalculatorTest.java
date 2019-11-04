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
        assertEquals(4.0, calculator.add(2, 2));
    }

    @Test
    public void canSubtract() {
        assertEquals(5.0, calculator.subtract(10, 5));
    }

}
