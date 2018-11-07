package com.ocr.felix;

public class Warrior extends Personage {
    public Warrior(int level, int health, int strength, int agility, int intelligence, String name) {
        super(level, health, strength, agility, intelligence, name);
    }

    public int strike(){
        int damage = strength;
        return damage;
    }
    public int rage (){
        int damage = strength*2;
        return damage;
    }

}
