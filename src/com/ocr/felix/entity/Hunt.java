package com.ocr.felix.entity;

public class Hunt extends Personage {
    public Hunt(int level, int health, int strength, int agility, int intelligence, String name ) {
        super(level, health, strength, agility, intelligence, name);
    }

    @Override
    public String cri() {
        return "Hya";
    }

    @Override
    public void normalAttack(Personage player) { // arrowShot attack
    damage = getAgility();
    System.out.println(getName() + " utilise tir à l'arc et inflige " + damage + " dommage(s)");
    player.setHealth(player.getHealth()-damage);
    System.out.println(player.getName() + " perd " + damage + " points de vie");
    }

    @Override
    public void specialAttack(Personage player) { // concentration attack
    System.out.println(getName() + " utilise concentration et gagne " + getLevel()/2 + " d'agilité");
    setAgility(getAgility() + getLevel()*1/2);
    }
}
