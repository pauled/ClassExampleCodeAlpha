package week6;

import week3.Player;

public class GameItem {
    private double xLoc;
    private double yLoc;

    public GameItem(double xLoc,double yLoc){
        this.xLoc=xLoc;
        this.yLoc=yLoc;
    }
    public void move(double dx,double dy){
        this.xLoc+=dx;
        this.yLoc+=dy;
    }

    @Override
    public String toString(){
        return "x: "+this.xLoc+" y:"+this.yLoc;
    }
    public void use(Player player){}
}
