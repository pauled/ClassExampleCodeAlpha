package week9.lecture3;

public abstract class HealthPotion extends GameItem {
    private int increase;

//    public HealthPotion(){
//        super(0.0, 0.0);
//        this.increase = 5;
//    }

    public HealthPotion(double xLoc, double yLoc, int increase) {
        super(xLoc, yLoc);
        this.increase = increase;
    }

    public static void doThings(){}

    public void use(Player player) {
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
        HealthPotion h = new SuperHealthPotion(0.0, 0.0, 5);
        h.move(2, 4);
        System.out.println(h);
    }
}
