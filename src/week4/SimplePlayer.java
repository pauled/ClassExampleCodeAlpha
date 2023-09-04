package week4;

public class SimplePlayer {

    private int maxHP;
    private int hp;
    private String name;

    public SimplePlayer(String name, int maxHP) {
        this.setMaxHP(maxHP);
        this.setHP(maxHP);
        this.setName(name);
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public void setHP(int hp) {
        if (hp <= this.maxHP) {
            this.hp = hp;
        } else {
            this.hp = this.maxHP;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        SimplePlayer p1 = new SimplePlayer("Dark Cecil", 10);
        SimplePlayer p2 = new SimplePlayer("Kain", 14);
        SimplePlayer p3 = p1;
        p1.setName("Paladin");
        System.out.println(p3.getName());
    }
}

