import junit.framework.TestCase;

public class ExcelSheetColumnTitleTest extends TestCase {
    public void testProfit(){
        int columnNumber = 1701;
        String actualPrices = Main.Solution.convertToTitle(columnNumber);
        String expectedPrices = "BMK";
        assertEquals(expectedPrices, actualPrices);
    }

    public void testZeroProfit(){
        int columnNumber = 701;
        String actualPrices = Main.Solution.convertToTitle(columnNumber);
        String expectedPrices = "ZY";
        assertEquals(expectedPrices, actualPrices);
    }

}