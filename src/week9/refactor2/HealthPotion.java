package week9.refactor2;

public class HealthPotion extends GameItem implements Usable {
    private int increase;

    public HealthPotion(double xLoc, double yLoc, int increase) {
        super(xLoc, yLoc);
        this.increase = increase;
    }

    @Override
    public void use(Player player) {
        player.setHP(player.getHP() + this.increase);
    }

}
