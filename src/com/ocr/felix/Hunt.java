package com.ocr.felix;

public class Hunt extends Personage {
    public Hunt(int level, int health, int strength, int agility, int intelligence, String name ) {
        super(level, health, strength, agility, intelligence, name);
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
