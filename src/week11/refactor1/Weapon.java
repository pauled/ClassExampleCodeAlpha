package week11.refactor1;


public class Weapon extends GameItem {
    private int damage;

    public Weapon(double xloc, double yLoc, int damage) {
        super(xloc, yLoc);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void use(Player player) {
        player.setDamageDealt(this.damage);
    }

    public static void main(String[] args) {
        Player player = new Player(50);
        Weapon weapon1 = new Weapon(1.0, 1.0, 10);
        GameItem weapon2 = new Weapon(1.0, 1.0, 10);
        Object weapon3 = new Weapon(1.0, 1.0, 10);
        weapon1.use(player);
        weapon2.use(player);
//        weapon3.use(player); Does not compile
    }

}
