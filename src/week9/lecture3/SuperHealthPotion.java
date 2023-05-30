package week9.lecture3;

public class SuperHealthPotion extends HealthPotion {

    private static final int healingJuiceMultiplier = 10;

    public SuperHealthPotion(double x, double y, int volume){
        super(x, y, healingJuiceMultiplier * volume);
    }

    @Override
    public void use(){
        System.out.println("go us!");
    }

}
