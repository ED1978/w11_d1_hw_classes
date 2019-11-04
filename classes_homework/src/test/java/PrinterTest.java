import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(50, 100);
    }

    @Test
    public void hasSheets() {
        assertEquals(50, printer.getSheets());
    }

    @Test
    public void hasToner() {
        assertEquals(100, printer.getToner());
    }

    @Test
    public void canPrintEnoughPaper() {
        printer.print(6, 4);
        assertEquals(26, printer.getSheets());
    }

    @Test
    public void canPrintNotEnoughPaper() {
        printer.print(10, 6);
        assertEquals(50, printer.getSheets());
    }

    @Test
    public void canUseToner() {
        printer.useToner();
        printer.useToner();
        assertEquals(98, printer.getToner());
    }

    @Test
    public void canUseTonerWhenPrinting() {
        printer.print(5, 2);
        assertEquals(90, printer.getToner());
    }

}
