package com.ocr.felix;

public class Hunt extends Character {
    public Hunt(int level, int health, int strength, int agility, int intelligence, int damage) {
        super(level, health, strength, agility, intelligence, damage);
    }
    public int arrowShot (){
        damage = agility;
        return damage;
    }
    public int concentration(){
        agility += level/2;
        return agility;
    }
}
