package module1;

public class Party {
    private Character[] members;
    private int battlesWon;
    private int numMembers;

    public Party(){
        this.battlesWon=0;
        this.numMembers=0;
        this.members=new Character[10];
    }
    public void addCharacter(Character member){
        if (this.numMembers<this.members.length) {
            this.members[this.numMembers] = member;
            this.numMembers++;
        }
    }
    public void winBattle(int xp){
        this.battlesWon++;
        for (int x=0;x<this.numMembers;x++){
            this.members[x].winBattle(xp);
        }
    }

    public static void main(String[] args) {
        Character hero=new Character();
        Character hero2=new Character();
        hero.winBattle(10);
        Party party=new Party();
        party.addCharacter(hero);
        party.addCharacter(hero2);
        party.winBattle(20);
    }
}
