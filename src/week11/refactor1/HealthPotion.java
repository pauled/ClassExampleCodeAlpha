package week11.refactor1;

public class HealthPotion extends GameItem {
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
