package com.ocr.felix.entity;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Personage {
    protected int level;
    protected int health;
    protected int strength;
    protected int agility;
    protected int intelligence;
    protected int damage;
    protected String name;
    protected Scanner sc = new Scanner(System.in);
    private int nbResponse;
    private boolean responseIsGood;


    /**
     * Constructeur
     *
     * @param level
     * @param health
     * @param strength
     * @param agility
     * @param intelligence
     */
    public Personage(int level, int health, int strength, int agility, int intelligence, String name) {
        this.level = level;
        this.health = level *5;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.name = name;
    }

    /**
     * Getter and Setter
     */
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

    public void setStrenght(int strength) {
        this.strength = strength;
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

    public String getName() {
        return name;
    }





    /**
     * permit to ask about the stat
     *
     * @param stat
     * @return int nbresponse
     */
    public int askOthers(String stat) {

        do {
            try {
                responseIsGood = true;
                System.out.println(stat + " du personnage");
                nbResponse = sc.nextInt();
            } catch (InputMismatchException e) {
                responseIsGood = false;
                sc.next();
                System.out.println("Veuillez saisir un nombre !");
            }
        }while (!responseIsGood);
        return nbResponse;
    }

    public int askLevel() {
        String stat = "Niveau";
        return askOthers(stat);
    }

    public int askStrength() {
        String stat = "Force";
        return askOthers(stat);
    }

    public int askAgility() {
        String stat = "Agilité";
        return askOthers(stat);
    }

    public int askIntelligence() {
        String stat = "Intelligence";
        return askOthers(stat);
    }

    public void createCharacter() {
        level = askLevel();
        setLevel(level);
        health = level * 5;
        setHealth(health);
        do {
            strength = askStrength();
            setStrenght(strength);
            agility = askAgility();
            setAgility(agility);
            intelligence = askIntelligence();
            setIntelligence(intelligence);
            if (strength + agility + intelligence != level)
                System.out.println("La somme de la force, de l'agilité et de l'intelligence de votre personnage doit être égale à son niveau.");
        }while ( strength + agility + intelligence != level);

    }



    public abstract String cri();
    public abstract void normalAttack(Personage player);
    public abstract void specialAttack(Personage player);




    }



