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
    boolean responseIsGood;
    int nbAttack;

    public Battle() {
        player1 = createPlayer("Joueur1");
        player2 = createPlayer("Joueur2");
        startGame();

    }

    public Personage createPlayer(String name) {
        System.out.println("Création du personnage du " + name);
        int nbClass = -1;
               do {
           try {
               System.out.println("Veuillez choisir la classe de votre personnage : 1. Guerrier, 2. Mage, 3. Rôdeur");
               nbClass = sc.nextInt();
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
                       break;
               }
           } catch (InputMismatchException e){
               sc.next();
               responseIsGood=false;
               System.out.println("Vous devez saisir un des chiffres proposés");
           }
       }while (responseIsGood == false);
       return null;
    }


    public int askAttack(Personage player) {
                try {
            System.out.println(player.getName() + " (" + player.getHealth() + " vitalité ) veuillez choisir votre action (1. Attaque basique, 2. Attaque spéciale");
            nbAttack = sc.nextInt();
        }catch (InputMismatchException e){
                    sc.next();
        }
        return nbAttack;

    }

    public void startGame() {
        int turn = 1; // variable to determinate who will attack
                do {
            if (turn % 2 == 1) {
                nbAttack = askAttack(player1);
                turn = getTurn(turn, player1, player2);
            }else if (turn % 2 == 0) {
                nbAttack = askAttack(player2);
                turn = getTurn(turn, player2, player1);
            }
        }while (player1.getHealth() > 0 && player2.getHealth() > 0) ;
            if (player1.getHealth() <= 0 && player2.getHealth() <= 0)
                System.out.println("Egalité : les 2 joueurs sont morts en même temps.");
            else if (player2.getHealth() <= 0)
                System.out.println("Le joueur 2 a perdu !!!");
            else if (player1.getHealth() <= 0)
                System.out.println("Le joueur 1 a perdu !!!");
        }

    private int getTurn(int turn, Personage player1, Personage player2) {
        if (nbAttack == 1) {
            player1.normalAttack(player2);
            turn++;
        } else if (nbAttack == 2) {
            player1.specialAttack(player2);
            turn++;
        } else {
            System.out.println("L'attaque n'existe pas.");
        }
        return turn;
    }


}
