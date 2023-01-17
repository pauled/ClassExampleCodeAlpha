package module2;

import module1.Player;

public class Teleporter extends GameItem{
    private double dx;
    private double dy;

    public Teleporter(double xloc,double yLoc,double dx,double dy){
        super(xloc,yLoc);
        this.dx=dx;
        this.dy=dy;
    }
    public void use(Player player){
        player.move(this.dx,this.dy);
    }

    public static void main(String[] args) {
        Player p1=new Player(1.0,2.0,10);
        Teleporter t=new Teleporter(2,2,3,3);
        t.use(p1);
        System.out.println(p1);
        System.out.println(t);
    }
}
