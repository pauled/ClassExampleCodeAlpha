package week9.refactor2;

public class Weapon extends GameItem implements Usable {
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

}
