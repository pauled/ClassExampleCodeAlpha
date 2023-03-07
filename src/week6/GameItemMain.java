package week6;

public class GameItemMain {

    public static void main(String[] args) {
        Weapon weapon = new Weapon(3.9, -0.5, 10);
        weapon.use();
        weapon.move(-0.5, 1.3);
    }
}
