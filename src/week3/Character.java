package week3;

public class Character {
    private int battlesWon;
    private int expPoints;

    public Character() {
        this.battlesWon = 0;
        this.expPoints = 0;
    }

    public void winBattle(int xp) {
        this.battlesWon++;
        this.expPoints += xp;
    }
}
