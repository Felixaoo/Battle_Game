package com.ocr.felix.entity;

public class Warrior extends Personage {
    public Warrior(int level, int health, int strength, int agility, int intelligence, String name) {
        super(level, health, strength, agility, intelligence, name);
    }

    @Override
    public String cri() {
    return "Woargh";
    }

    @Override
    public void normalAttack(Personage player) { // strike
    int damage = getStrenght();
        System.out.println(getName() + " utilise coup d'épée et inflige " + damage + " dommage(s)");
        player.setHealth(player.getHealth() - damage);
        System.out.println(player.getName() + " perd " + damage + " point(s) de vie");
    }

    @Override
    public void specialAttack(Personage player) { // rage
    int damage = getStrenght()*2;
    System.out.println(getName() + " utilise coup de rage et inflige " + damage + " dommage(s) ");
    player.setHealth(player.getHealth() - damage);
    System.out.println(player.getName() + " perd " + damage + " point(s) de vie");
    System.out.println(getName() + " perd " + getStrenght()/2 + " point(s) de vie");
    setHealth(getHealth()-getStrenght()/2);
    }
}
