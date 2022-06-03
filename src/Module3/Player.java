package Module3;

import Module1.Queue;
import Module2.GameItem;

public class Player {
    private double xLoc;
    private double yLoc;
    private int maxHP;
    private int HP;
    private int damageDealt;
    private GameItem[] inventory;
    private int invSize;

    public Player(double xLoc, double yLoc, int maxHP){
        this.xLoc=xLoc;
        this.yLoc=yLoc;
        this.maxHP=maxHP;
        this.HP=maxHP;
        this.damageDealt=4;
        this.inventory=new GameItem[10];
        this.invSize=0;
    }
    public void pickupItem(GameItem item){
        if (invSize<inventory.length){
            inventory[invSize]=item;
            invSize++;
        }
    }
    public void useItem(int loc){
        if (loc<invSize){
            inventory[loc].use(this);
        }
    }
    public String toString(){
        String out="location x:"+this.xLoc+" y:";
        out+=this.yLoc+"\n health:"+this.HP+"/";
        out+=this.maxHP;
        return out;
    }
    public void takeDamage(int damage){
        this.HP-=damage;
    }
    public void attack(Player otherPlayer){
        otherPlayer.takeDamage(this.damageDealt);
    }
    public void move(double dx,double dy){
        this.xLoc+=dx;
        this.yLoc+=dy;
    }

    public static void main(String[] args) {
        Player p1=new Player(1,2,3);
        Player p2=new Player(4,5,6);
        p1.move(1,1);
        p1.attack(p2);
        p1.attack(p2);
        System.out.println(p2);
    }
}
