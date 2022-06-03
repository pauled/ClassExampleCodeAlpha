package Module2;

import Module1.Player;

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
