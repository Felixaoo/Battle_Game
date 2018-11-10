package com.ocr.felix;

public class Hunt extends Personage {
    public Hunt(int level, int health, int strength, int agility, int intelligence, String name ) {
        super(level, health, strength, agility, intelligence, name);
    }

    @Override
    public String cri() {
        return "Hya";
    }

    @Override
    public int normalAttack() { // arrowShot attack
    damage = getAgility();
    System.out.println(getName() + " utilise tir à l'arc et inflige " + damage + " dommages");
    return damage;
    }

    @Override
    public int specialAttack() { // concentration attack
    agility = getAgility() + getLevel()/2;
    System.out.println(getName() + " utilise concentration et gagne " + getLevel()/2 + " d'agilité");
    return agility;
    }
}
