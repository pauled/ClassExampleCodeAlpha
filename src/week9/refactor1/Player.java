package week9.refactor1;

import week9.refactor2.Usable;

import java.util.ArrayList;

public class Player extends GameItem {
    private int maxHP;
    private int HP;
    private int damageDealt;
    private ArrayList<GameItem> inventory;

    public Player(int maxHP) {
        super(0, 0);
        this.maxHP = maxHP;
        this.HP = maxHP;
        this.damageDealt = 4;
        this.inventory = new ArrayList<>();
    }

    public void useItem(GameItem item){
        item.use(this);
    }

    public void pickUpItem(GameItem item) {
        this.inventory.add(item);
    }

    public void useAllInventoryItems() {
        for (GameItem item : this.inventory) {
            item.use(this);
        }
        this.inventory = new ArrayList<>();
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
        if(this.HP > this.maxHP){
            this.HP = this.maxHP;
        }
    }

    public void setDamageDealt(int damage) {
        this.damageDealt = damage;
    }

    public static void main(String[] args) {
        Player player = new Player(50);
        player.setHP(25);
        Weapon weapon = new Weapon(-5.0, 2.0, 15);
    }

    @Override
    void use(Player player) {
        player.setHP(player.getHP() - this.damageDealt);
    }

}
