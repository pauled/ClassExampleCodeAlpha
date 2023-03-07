package week6;

public class HealthPotion extends GameItem {
    private int increase;

    public HealthPotion(double xLoc, double yLoc, int increase) {
        super(xLoc, yLoc);
        this.increase = increase;
    }

    public void use(Player player) {
        player.takeDamage(-this.increase);
    }

    public String toString() {
        String out = "Health potion at " + super.toString();
        return out;
    }

    public static void main(String[] args) {
        HealthPotion h = new HealthPotion(2, 3, 10);
        h.move(2, 4);
        System.out.println(h);
    }
}
