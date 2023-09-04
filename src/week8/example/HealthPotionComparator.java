package week8.example;

import week6.Comparator;
import week6.HealthPotion;

public class HealthPotionComparator extends Comparator<HealthPotion> {

    @Override
    public boolean compare(HealthPotion potion1, HealthPotion potion2){
        return potion1.getIncrease() > potion2.getIncrease();
    }

}
