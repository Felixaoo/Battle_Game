package com.ocr.felix;

public class Wizard extends Character {

    public Wizard(int level, int health, int strength, int agility, int intelligence, int damage) {
        super(level, health, strength, agility, intelligence, damage);
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
