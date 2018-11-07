package com.ocr.felix;

public class Warrior extends Character {
    public Warrior(int level, int health, int strength, int agility, int intelligence) {
        super(level, health, strength, agility, intelligence);
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
