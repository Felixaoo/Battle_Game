package com.ocr.felix;

public class Warrior extends Personage {
    public Warrior(int level, int health, int strength, int agility, int intelligence, String name) {
        super(level, health, strength, agility, intelligence, name);
    }

    @Override
    public String cri() {
    return "woargh";
    }

    @Override
    public int normalAttack() { // strike
    int damage = getStrenght();
    System.out.println(getName() + " utilise coup d'épée et inflige" + damage + " dommages");
    return damage;
    }

    @Override
    public int specialAttack() { // rage
    int damage = getStrenght()*2;
    System.out.println(getName() + " utilise coup de rage et inflige" + damage + " dommages ");
    return damage;
    }
}
