package week11.lecture1;


public class RealHealthPotion extends HealthPotion {

    public RealHealthPotion(){
        super(0.0, 0.0, 100);
    }

    public void use(){
        System.out.println("For real health potion");
    }

    public static void main(String[] args) {
        Object obj = new RealHealthPotion();
    }
}
