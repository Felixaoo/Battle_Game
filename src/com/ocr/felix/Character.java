package com.ocr.felix;

public abstract class Character {
    int level;
    int health;
    int strenght;
    int agility;
    int intelligence;

    public Character(int level, int health, int strength, int agility, int intelligence) {
        this.level = level;
        this.health = health;
        this.strenght = strenght;
        this.agility = agility;
        this.intelligence = intelligence;
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
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
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
