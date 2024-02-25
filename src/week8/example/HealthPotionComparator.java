package week8.example;

import week7.Comparator;
import week7.HealthPotion;

public class HealthPotionComparator extends Comparator<HealthPotion> {

    @Override
    public boolean compare(HealthPotion potion1, HealthPotion potion2){
        return potion1.getIncrease() > potion2.getIncrease();
    }

}
