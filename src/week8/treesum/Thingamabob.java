package week8.treesum;

public class Thingamabob {

    private double theNumber;
    private String description;

    public Thingamabob(double value, String description) {
        this.theNumber = value;
        this.description = description;
    }

    public double getTheNumber() {
        return theNumber;
    }

    public void setTheNumber(double theNumber) {
        this.theNumber = theNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
