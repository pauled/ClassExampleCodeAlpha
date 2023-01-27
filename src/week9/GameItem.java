package week9;

public abstract class GameItem {
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


}
