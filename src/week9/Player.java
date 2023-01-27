package week9;

import java.util.ArrayList;

public class Player extends GameItem {
    private int maxHP;
    private int HP;
    private int damageDealt;
    private ArrayList<Usable> inventory;

    public Player(int maxHP){
        super(0,0);
        this.maxHP=maxHP;
        this.HP=maxHP;
        this.damageDealt=4;
        this.inventory = new ArrayList<>();
    }

    public void pickUpItem(Usable item){
        this.inventory.add(item);
    }

    public void useAllInventoryItems(){
        for(Usable item : this.inventory){
            item.use(this);
        }
        this.inventory = new ArrayList<>();
    }

    public int getMaxHP() {
        return maxHP;
    }
    public int getHP() {
        return HP;
    }
    public void setDamageDealt(int damage){this.damageDealt=damage;}

    public String toString(){
        String out="health:"+this.HP+"/";
        out+=this.maxHP+super.toString();
        return out;
    }

    public void takeDamage(int damage){
        this.HP-=damage;
    }
    public void attack(Player otherPlayer){
        otherPlayer.takeDamage(this.damageDealt);
    }

    public static void main(String[] args) {
        Player player=new Player(50);
        Player player2=new Player(20);
        player.attack(player2);
        GameItem p1=player;
        GameItem p2=player2;
//      p1.attack(p2);//illegal because of type

        Usable smallHealthPotion = new HealthPotion(3.5, 2.6, 10);
        HealthPotion largeHealthPotion = new HealthPotion(5.5, 0.0, 30);
        //break
        Weapon weapon = new Weapon(-5.0, 2.0, 15);

        player.pickUpItem(smallHealthPotion);
        player.pickUpItem(largeHealthPotion);
        player.pickUpItem(weapon);

        player.useAllInventoryItems();
    }
}
