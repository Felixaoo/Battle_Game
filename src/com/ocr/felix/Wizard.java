package com.ocr.felix;

public class Wizard extends Personage {

    public Wizard(int level, int health, int strength, int agility, int intelligence, String name) {
        super(level, health, strength, agility, intelligence, name);
    }
    public int fireBall(){
        damage = intelligence;
        return damage;
    }
    public int heal (){
        damage = intelligence*-2;
        return damage;
    }
}
