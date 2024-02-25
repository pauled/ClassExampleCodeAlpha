package week7;

public class GameItem {
    private double xLoc;
    private double yLoc;

    public GameItem(double xLoc, double yLoc) {
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }

    public void move(double dx, double dy) {
        this.xLoc += dx;
        this.yLoc += dy;
    }

    public double getX() {
        return xLoc;
    }

    public double getY() {
        return yLoc;
    }

    @Override
    public String toString() {
        return "x: " + this.xLoc + " y:" + this.yLoc;
    }

    public void use() {
        System.out.println("Item Used");
    }

    public void use(Player player) {
    }
}
