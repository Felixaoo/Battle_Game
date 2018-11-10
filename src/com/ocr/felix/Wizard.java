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
    public void normalAttack(Personage player) { // fireball attack
    damage = intelligence;
    System.out.println(getName() + " utilise boule de feu et inflige " + damage + " dommages");
    player.setHealth(player.getHealth() - damage);
    System.out.println(player.getName() + " perd " + damage + " point(s) de vie");
    }

    @Override
    public void specialAttack(Personage player) { // heal attack
    damage = intelligence*2;
    int maxHealth = getLevel()*5;
    if (getHealth()+ damage <= maxHealth ) {
        System.out.println(getName() + " utilise soin et gagne " + damage + " en vitalité");
        setHealth(getHealth() + damage);
    }
        else{
            System.out.println(getName() + " utilise soin et gagne " + (maxHealth-getHealth()) + " de vitalité");
            setHealth(maxHealth);
    }

    }

    }

