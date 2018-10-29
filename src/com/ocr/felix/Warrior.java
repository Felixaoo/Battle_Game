package com.ocr.felix;

public class Warrior extends Character {
    public Warrior(int level, int health, int strength, int agility, int intelligence, int damage) {
        super(level, health, strength, agility, intelligence, damage);
    }

    public int strike(){
        damage = strength;
        return damage;
    }
    public int rage (){
        damage = strength*2;
        return damage;
    }
}
