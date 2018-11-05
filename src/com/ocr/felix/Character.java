package com.ocr.felix;

import java.util.Scanner;

public abstract class Character {
    protected int nbClass;
    protected int level;
    protected int health;
    protected int strength;
    protected int agility;
    protected int intelligence;
    protected int damage;
    protected Scanner sc = new Scanner(System.in);

    public Character(int level, int health, int strength, int agility, int intelligence) {
        this.level = level;
        this.health = health;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.nbClass = nbClass;
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

    public int askClass(){
            int nbChoice;
            System.out.println(" Veuillez choisir la classe de votre personnage : 1. Guerrier, 2. Mage, 3. Rôdeur");
            do {
                nbChoice = sc.nextInt();
                System.out.println(" Veuillez rentrer un chiffre entre 1 et 3 correspondant à la classe que vous souhaitez");
            } while (nbChoice <= 0 || nbChoice >= 4);
            return nbChoice;

    }
    public int askOthers(String stat){
        int nbResponse;
        System.out.println(stat + "du personnage");
        nbResponse = sc.nextInt();
    }
    public int askLevel(){
        String stat = "Niveau";
        return askOthers(stat);
    }
    public int askStrenght(){
        String stat = "Force";
        return askOthers(stat);
    }
    public int askAgility(){
        String stat = "Agilité";
        return askOthers(stat);
    }
    public int askIntelligence(){
        String stat = "Intelligence";
        return askOthers(stat);
    }

    public void creatCharacter(Player player){
        System.out.println("Création du personnage du "+ player);
        nbClass = askClass();
        level = askLevel();
        health = level*5;
        strength = askStrenght();
        agility = askAgility();
        intelligence = askIntelligence();
        switch (nbClass){
            case 1:
                Warrior warrior = new Warrior(level, health, strength, agility, intelligence);
                break;
            case 2:
                Hunt hunt = new Hunt(level, health, strength, agility, intelligence);
                break;
            case 3 :
                Wizard wizard = new Wizard(level, health, strength, agility, intelligence);
                break;
                }

        }



    }

