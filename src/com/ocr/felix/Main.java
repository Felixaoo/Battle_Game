package com.ocr.felix;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static Personage createPlayer(String name)

    {
        System.out.println("Création du personnage du " + name );
        int nbClass = -1;
        boolean responseIsGood = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez choisir la classe de votre personnage : 1. Guerrier, 2. Mage, 3. Rôdeur");
        do {
            try {
                nbClass = sc.nextInt();
                responseIsGood = true;
            } catch (InputMismatchException e) {
                sc.next();
                responseIsGood = false;
            }

            switch (nbClass) {
                case 1:
                    Warrior warrior = new Warrior(0, 0, 0, 0, 0, name);
                    warrior.createCharacter();
                    System.out.println("Je suis le guerrier " + warrior.getName() + " de niveau " + warrior.getLevel() + " je possède " + warrior.getHealth() + " de vitalité ," + warrior.getStrenght() + " de force" + warrior.getAgility() + " d'agilité et " + warrior.getIntelligence() + " d'intelligence.");
                    return warrior;
                case 2:
                    Hunt hunt = new Hunt(0, 0, 0, 0, 0, name);
                    hunt.createCharacter();
                    System.out.println("Je suis le rodeur " + hunt.getName() + " de niveau " + hunt.getLevel() + " je possède " + hunt.getHealth() + " de vitalité ," + hunt.getStrenght() + " de force " + hunt.getAgility() + " d'agilité et " + hunt.getIntelligence() + " d'intelligence.");
                    return hunt;
                case 3:
                    Wizard wizard = new Wizard(0, 0, 0, 0, 0, name);
                    wizard.createCharacter();
                    System.out.println("Je suis le mage " + wizard.getName() + " de niveau " + wizard.getLevel() + " je possède " + wizard.getHealth() + " de vitalité ," + wizard.getStrenght() + " de force " + wizard.getAgility() + " d'agilité et " + wizard.getIntelligence() + " d'intelligence.");
                    return wizard;
                default:
                    responseIsGood = false;
                    System.out.println("Vous devez saisir un des chiffres proposés");
                    return null;
            }
        }while (!responseIsGood);
    }

    public static void main(String[] args) {
      /**  Player player1 = new Player("Player 1", Ch);
        System.out.println("Création du personnage " + player1.getName());
        int nbClass = -1;
        boolean responseIsGood = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez choisir la classe de votre personnage : 1. Guerrier, 2. Mage, 3. Rôdeur");
            do {
                try {
                    nbClass = sc.nextInt();
                    responseIsGood = true;
                    } catch (InputMismatchException e) {
                    sc.next();
                    responseIsGood = false;
                }
                    switch (nbClass) {
                    case 1:
                    Warrior warrior = new Warrior(0, 0, 0, 0, 0);
                    warrior.createCharacter();
                    System.out.println("Je suis le guerrier " + player1.getName() + " de niveau " + warrior.getLevel() + " je possède " + warrior.getHealth() + " de vitalité ," + warrior.getStrenght() + " de force" + warrior.getAgility() + " d'agilité et " + warrior.getIntelligence() + " d'intelligence.");
                    break;
                    case 2:
                    Hunt hunt = new Hunt(0, 0, 0, 0, 0);
                    hunt.createCharacter();
                    System.out.println("Je suis le rodeur " + player1.getName() + " de niveau " + hunt.getLevel() + " je possède " + hunt.getHealth() + " de vitalité ," + hunt.getStrenght() + " de force " + hunt.getAgility() + " d'agilité et " + hunt.getIntelligence() + " d'intelligence.");
                    break;
                    case 3:
                    Wizard wizard = new Wizard(0, 0, 0, 0, 0);
                    wizard.createCharacter();
                    System.out.println("Je suis le mage " + player1.getName() + " de niveau " + wizard.getLevel() + " je possède " + wizard.getHealth() + " de vitalité ," + wizard.getStrenght() + " de force " + wizard.getAgility() + " d'agilité et " + wizard.getIntelligence() + " d'intelligence.");
                    break;
                    default:
                    responseIsGood = false;
                    System.out.println("Vous devez saisir un des chiffres proposés");
                    break;
                }
            }while (!responseIsGood);

        }
    }

*/
      Personage player1 = createPlayer("Joueur 1");
      Personage player2 = createPlayer("Joueur 2");


    }

}
