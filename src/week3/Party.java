package week3;

import java.util.ArrayList;

public class Party {
    private ArrayList<Character> members;
    private int battlesWon = 0;

    public Party() {
        this.members = new ArrayList<>();
    }

    public void addCharacter(Character member) {
        this.members.add(member);
    }

    public void winBattle(int xp) {
        this.battlesWon++;
        for (int x=0; x < this.members.size(); x++) {
            this.members.get(x).winBattle(xp);
        }
    }

    public static void main(String[] args) {
        Character hero = new Character();
        hero = new Character();
        Character fighter = new Character();
        hero.winBattle(10);
        Party party = new Party();
        party.addCharacter(hero);
        party.addCharacter(fighter);
        party.winBattle(20);
        party = new Party();
    }
}
