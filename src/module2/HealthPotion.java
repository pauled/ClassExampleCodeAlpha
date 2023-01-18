package module2;

import week3.Player;

public class HealthPotion extends GameItem{
    private int increase;

    public HealthPotion(double xLoc,double yLoc, int increase){
        super(xLoc,yLoc);
        this.increase=increase;
    }
    public void use(Player player){
        player.takeDamage(-this.increase);
    }
}
