package com.ocr.felix;

public class Wizard extends Personage {

    public Wizard(int level, int health, int strength, int agility, int intelligence, String name) {
        super(level, health, strength, agility, intelligence, name);
    }

    @Override
    public String cri() {
        return "Abracadabra";
    }

    @Override
    public int normalAttack() { // fireball attack
    damage = intelligence;
    System.out.println(getName() + " utilise boule de feu et inflige " + damage + " dommages");
    return damage;
    }

    @Override
    public int specialAttack() { // heal attack
    damage = intelligence*-2;
    System.out.println(getName() + " utilise soin et gagne " + damage+ " en vitalité");
    return damage;
    }
}
