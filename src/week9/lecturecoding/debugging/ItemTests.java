package week9.lecturecoding.debugging;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class ItemTests {

    private static final double TOLERANCE = 0.001;

    @Test
    public void testItemDescription() {
        Item item = new Item("bread", 1.5);
        assertEquals("bread", item.getDescription());

        item.setDescription("milk");
        assertEquals("milk", item.getDescription());
    }

    @Test
    public void testItemPriceWithNoSales() {
        double basePrice = 6.5;
        double expected = 6.5;
        Item item = new Item("cereal", basePrice);
        double actual = item.getPrice();
        assertEquals(expected, actual, TOLERANCE);
    }

    @Test
    public void testItemPriceWithOneSales() {
        double basePrice = 6.5;
        double salePercent = 20.0;
        double expected = 5.2;
        Item item = new Item("cereal", basePrice);
        item.addSale(salePercent);
        double actual = item.getPrice();
        assertEquals(expected, actual, TOLERANCE);
    }

    @Test
    public void testItemPriceWithOneSales_multipleCalls() {
        double basePrice = 100.0;
        double salePercent = 20.0;
        double expected = 80.0;
        Item item = new Item("salmon", basePrice);
        item.addSale(salePercent);
        double actual = item.getPrice();
        assertEquals(expected, actual, TOLERANCE);
        actual = item.getPrice();
        assertEquals(expected, actual, TOLERANCE);
    }


    @Test
    public void testItemPriceWithMultipleSales1() {
        double basePrice = 6.5;
        ArrayList<Double> sales = new ArrayList<>(Arrays.asList(20.0, 15.5));
        double expected = 4.39;
        Item item = new Item("cereal", basePrice);
        for (double sale : sales) {
            item.addSale(sale);
        }
        double actual = item.getPrice();
        assertEquals(expected, actual, TOLERANCE);
    }


    @Test
    public void testItemPriceWithMultipleSales2() {
        double basePrice = 60000.0;
        ArrayList<Double> sales = new ArrayList<>(Arrays.asList(10.0, 20.0));
        double expected = 43200.0;
        Item item = new Item("car", basePrice);
        for (double sale : sales) {
            item.addSale(sale);
        }
        double actual = item.getPrice();
        assertEquals(expected, actual, TOLERANCE);
    }

    @Test
    public void testItemPriceWithMultipleSales2_multipleCalls() {
        double basePrice = 60000.0;
        ArrayList<Double> sales = new ArrayList<>(Arrays.asList(10.0, 20.0));
        double expected = 43200.0;
        Item item = new Item("car", basePrice);
        for (double sale : sales) {
            item.addSale(sale);
        }
        double actual = item.getPrice();
        assertEquals(expected, actual, TOLERANCE);
        actual = item.getPrice();
        assertEquals(expected, actual, TOLERANCE);
    }


    @Test
    public void testItemPriceWithMultipleSales3() {
        double basePrice = 19.95;
        ArrayList<Double> sales = new ArrayList<>(Arrays.asList(11.1, 5.5, 6.0, 15.0));
        double expected = 13.39;
        Item item = new Item("shamwow", basePrice);
        for (double sale : sales) {
            item.addSale(sale);
        }
        double actual = item.getPrice();
        assertEquals(expected, actual, TOLERANCE);
    }

    @Test
    public void testItemTax() {
        double basePrice = 10.0;
        double taxRate = 0.08;
        double expected = 0.8;
        Item item = new Item("crayons", basePrice);
        double actual = item.computeTax(taxRate);
        assertEquals(expected, actual, TOLERANCE);
    }

    @Test
    public void testItemTaxWithSales() {
        double basePrice = 19.95;
        ArrayList<Double> sales = new ArrayList<>(Arrays.asList(11.1, 5.5, 6.0, 15.0));
        double taxRate = 0.0775;
        double expected = 1.04; // 1.0378025;
        Item item = new Item("shamwow", basePrice);
        for (double sale : sales) {
            item.addSale(sale);
        }
        double actual = item.computeTax(taxRate);
        assertEquals(expected, actual, TOLERANCE);
    }

    @Test
    public void testItemReceiptLine() {
        double basePrice = 5.0;
        double taxRate = 0.1;
        String expected = "cereal: $5.5";
        Item item = new Item("cereal", basePrice);
        String actual = item.receiptLine(taxRate);
        assertEquals(expected, actual);
    }

    @Test
    public void testItemReceiptLineWithSales() {
        double basePrice = 19.95;
        ArrayList<Double> sales = new ArrayList<>(Arrays.asList(11.1, 5.5, 6.0, 15.0));
        double taxRate = 0.0775;
        String expected = "shamwow: $14.43";
        Item item = new Item("shamwow", basePrice);
        for (double sale : sales) {
            item.addSale(sale);
        }
        String actual = item.receiptLine(taxRate);
        assertEquals(expected, actual);
    }


}
