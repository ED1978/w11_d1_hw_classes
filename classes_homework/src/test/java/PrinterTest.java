import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(50);
    }

    @Test
    public void hasSheets() {
        assertEquals(50, printer.getSheets());
    }

}
