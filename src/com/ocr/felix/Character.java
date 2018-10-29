package com.ocr.felix;

public abstract class Character {
    protected int level;
    protected int health;
    protected int strength;
    protected int agility;
    protected int intelligence;
    protected int damage;

    public Character(int level, int health, int strength, int agility, int intelligence, int damage) {
        this.level = level;
        this.health = health;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.damage = damage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrenght() {
        return strength;
    }

    public void setStrenght(int strenght) {
        this.strength = strenght;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
