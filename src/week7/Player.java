package week7;

public class Player extends GameItem {

    private int maxHP;
    private int HP;
    private int damageDealt;


    public Player(int maxHP) {
        super(0, 0);
        this.maxHP = maxHP;
        this.HP = maxHP;
        this.damageDealt = 4;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getHP() {
        return HP;
    }

    public void setDamageDealt(int damage) {
        this.damageDealt = damage;
    }

    public String toString() {
        String out = "health:" + this.HP + "/";
        out += this.maxHP + super.toString();
        return out;
    }

    public void takeDamage(int damage) {
        this.HP -= damage;
    }

    public void attack(Player otherPlayer) {
        otherPlayer.takeDamage(this.damageDealt);
    }

    public static void main(String[] args) {
        Player p1 = new Player(3);
        Player p2 = new Player(6);
        Player p3 = p2;
        p1.attack(p2);
        p1.attack(p2);
        System.out.println(p2);
        System.out.println(p3);
    }
}
