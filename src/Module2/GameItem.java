package Module2;

import Module3.Player;

public class GameItem {
    private double xLoc;
    private double yLoc;

    public GameItem(double xLoc,double yLoc){
        this.xLoc=xLoc;
        this.yLoc=yLoc;
    }
    public String toString(){
        return "x: "+this.xLoc+" y:"+this.yLoc;
    }
    public void use(Player player){}
}
