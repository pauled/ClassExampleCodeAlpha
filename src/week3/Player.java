package week3;

public class Player {

    private int maxHP;
    private int hp;
    private int attackPower = 4;
    private String name;

    public Player(String name, int maxHP) {
        this.setMaxHP(maxHP);
        this.setHP(maxHP);
        this.setName(name);
    }

    public int getMaxHP() {
        return this.maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getHP() {
        return this.hp;
    }

    public void setHP(int hp) {
        if (hp <= this.maxHP) {
            this.hp = hp;
        } else {
            this.hp = this.maxHP;
        }
    }

    public int getAttackPower() {
        return this.attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        String out = "health: " + this.hp + "/";
        out += this.maxHP;
        return out;
    }

    public void takeDamage(int damage) {
        this.hp -= damage;
    }

    public void attack(Player otherPlayer) {
        otherPlayer.takeDamage(this.attackPower);
    }

    public static void main(String[] args) {
        Player p1 = new Player("Dark Cecil", 10);
        Player p2 = new Player("Kain", 14);
        Player p3 = p2;
        p1.attack(p2);
        p1.attack(p2);
        p1.setName("Paladin");
        System.out.println(p1.getName());
        System.out.println(p2);
        System.out.println(p3);
    }
}
