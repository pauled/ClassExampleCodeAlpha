package week11.starting_point;

public class Weapon extends GameItem {
    private int damage;

    public Weapon(double xloc, double yLoc, int damage) {
        super(xloc, yLoc);
        this.damage = damage;
    }

    public void use() {
        System.out.println("Damage dealt: " + this.damage);
    }

    @Override
    public void use(Player player) {
        player.setDamageDealt(this.damage);
    }

    public String toString() {
        String out = "Weapon Damage: " + this.damage;
        return out;
    }

    public static void main(String[] args) {
        Player p1 = new Player(10);
        Weapon w = new Weapon(1, 2, 20);
        w.use(p1);
        System.out.println(p1);
        System.out.println(w);
    }
}
