package week11.lecture1;

public abstract class HealthPotion extends GameItem {
    private int increase;

    public HealthPotion(double xLoc, double yLoc, int increase) {
        super(xLoc, yLoc);
        this.increase = increase;
    }

    @Override
    public final void use(Player player) {
        player.takeDamage(-this.increase);
    }

    public int getIncrease(){
        return this.increase;
    }

    @Override
    public String toString() {
        String out = super.toString() + " - Health Potion [" + this.increase + "]";
        return out;
    }

    public static void main(String[] args) {
//        HealthPotion h = new HealthPotion(2, 3, 10);
//        h.move(2, 4);
//        System.out.println(h);
    }
}
