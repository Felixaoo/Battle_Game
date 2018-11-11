package com.ocr.felix.service;

import com.ocr.felix.entity.Hunt;
import com.ocr.felix.entity.Personage;
import com.ocr.felix.entity.Warrior;
import com.ocr.felix.entity.Wizard;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Battle {

    Personage player1;
    Personage player2;
    Scanner sc = new Scanner(System.in);


    public Battle() {
        player1 = createPlayer("Joueur1");
        player2 = createPlayer("Joueur2");
        startGame();

    }

    public Personage createPlayer(String name) {
        System.out.println("Création du personnage du " + name);
        int nbClass = -1;
        boolean responseIsGood = true;
        System.out.println("Veuillez choisir la classe de votre personnage : 1. Guerrier, 2. Mage, 3. Rôdeur");
        do {


            switch (nbClass) {
                case 1:
                    Warrior warrior = new Warrior(0, 0, 0, 0, 0, name);
                    warrior.createCharacter();
                    System.out.println(warrior.cri() + " Je suis le guerrier " + warrior.getName() + " de niveau " + warrior.getLevel() + " je possède " + warrior.getHealth() + " de vitalité , " + warrior.getStrenght() + " de force " + warrior.getAgility() + " d'agilité et " + warrior.getIntelligence() + " d'intelligence.");
                    return warrior;
                case 2:
                    Wizard wizard = new Wizard(0, 0, 0, 0, 0, name);
                    wizard.createCharacter();
                    System.out.println(wizard.cri() + " Je suis le mage " + wizard.getName() + " de niveau " + wizard.getLevel() + " je possède " + wizard.getHealth() + " de vitalité , " + wizard.getStrenght() + " de force " + wizard.getAgility() + " d'agilité et " + wizard.getIntelligence() + " d'intelligence.");
                    return wizard;
                case 3:
                    Hunt hunt = new Hunt(0, 0, 0, 0, 0, name);
                    hunt.createCharacter();
                    System.out.println(hunt.cri() + " Je suis le rodeur " + hunt.getName() + " de niveau " + hunt.getLevel() + " je possède " + hunt.getHealth() + " de vitalité , " + hunt.getStrenght() + " de force " + hunt.getAgility() + " d'agilité et " + hunt.getIntelligence() + " d'intelligence.");
                    return hunt;

                default:
                    responseIsGood = false;
                    System.out.println("Vous devez saisir un des chiffres proposés");
                    return null;
            }
        } while (!responseIsGood);
    }

    private int inputMismatchException(int nbClass) {
        boolean responseIsGood;
        try {
            nbClass = sc.nextInt();
            responseIsGood = true;
        } catch (InputMismatchException e) {
            sc.next();
            responseIsGood = false;
        }
        return nbClass;
    }

    public int askAttack(Personage player) {
        System.out.println(player.getName() + " (" + player.getHealth() + " vitalité ) veuillez choisir votre action (1. Attaque basique, 2. Attaque spéciale");
        int nbAttack = sc.nextInt();
        return nbAttack;
    }

    public void startGame() {
        int turn = 1; // variable to determinate who will attack
        int nbAttack = -1;
        do {
            if (turn % 2 == 1) {
                nbAttack = askAttack(player1);
                if (nbAttack == 1) {
                    player1.normalAttack(player2);
                    turn++;
                } else if (nbAttack == 2) {
                    player1.specialAttack(player2);
                    turn++;
                } else {
                    System.out.println("L'attaque n'existe pas.");
                }
            }else if (turn % 2 == 0) {
                nbAttack = askAttack(player2);
                if (nbAttack == 1) {
                    player2.normalAttack(player1);
                    turn++;
                }else if (nbAttack == 2) {
                    player2.specialAttack(player1);
                    turn++;
                }else {
                        System.out.println("L'attaque n'existe pas.");
                    }
                }

        }while (player1.getHealth() > 0 && player2.getHealth() > 0) ;
            if (player1.getHealth() <= 0)
                System.out.println("Le joueur 1 a perdu !!!");
            else if (player2.getHealth() <= 0)
                System.out.println("Le joueur 2 a perdu !!!");


        }


    }
