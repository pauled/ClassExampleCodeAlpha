package week11.example4;

import java.util.ArrayList;

public class Item {

    private String description;
    private double price;
    private ArrayList<Double> sales = new ArrayList<>();

    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the price of the item after all sales are applied rounded to 2 decimal places
     */
    public double getPrice() {
        for (double sale : this.sales) {
            this.price *= (100.0 - sale) / 100.0;
        }
        return this.roundToTwoDecimalPlaces(this.price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Adds a sale percentage to the item. Multiple sales should combine multiplicative
     * Ex. If an item has a price of 100 and 2 sales of 10% are added, the finale price of the item is 81
     */
    public void addSale(double salePercent) {
        this.sales.add(salePercent);
    }

    /**
     * Returns the tax charged for this item based on the given tax rate, rounded to 2 decimal places
     */
    public double computeTax(double taxRate) {
        return this.roundToTwoDecimalPlaces(this.getPrice() * taxRate);
    }

    /**
     * Return a line to be printed on a receipt containing the description of the item and its price, including tax
     * (e.g. and Item with a description of "Eggs", a price of 3.0, and a tax rate of 0.05 should return "Eggs: $3.15"
     */
    public String recieptLine(double taxRate) {
        return this.description + ": $" + this.price + this.computeTax(taxRate);
    }

    private double roundToTwoDecimalPlaces(double input) {
        return Math.round(input * 100.0) / 100.0;
    }

}
