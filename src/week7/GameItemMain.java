package week7;

public class GameItemMain {

    public static void main(String[] args) {
        Weapon weapon = new Weapon(1.3, 0.7, 100);
        HealthPotion potion = new HealthPotion(10.0, 0.0, 6);
        weapon.use();
        potion.use();
        System.out.println(weapon);
        System.out.println(potion);
    }
}
