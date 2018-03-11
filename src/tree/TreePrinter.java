/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import java.util.Scanner;

/**
 *
 * @author klimek
 */
public class TreePrinter {

    Scanner scanner;

    public TreePrinter() {
        //scanner = new Scanner
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String direction = "";
        //String direction = "LEFT";

        //char character = '*';
        do {
            System.out.println("UP/LEFT/RIGHT or 'X' to exit");

            direction = sc.next();
            if (!direction.equals("X")) {
                boolean directionValidated = DirectionValidator.validateDirection(direction);
                System.out.println("Heigth");
                int heigth = sc.nextInt();
                boolean heightValidated = HeightValidator.validateHeight(heigth);
                System.out.println("character");
                String chara = sc.next();
                boolean characterValidated = CharacterValidator.validateCharacter(chara);
                System.out.println();
                if (directionValidated && heightValidated && characterValidated) {
                    char character = chara.charAt(0);
                    switch (direction) {
                        case "LEFT":
                            new LeftOrientedTree(heigth, character);
                            break;
                        case "UP":
                            new StraightTree(heigth, character);
                            break;
                        case "RIGHT":
                            new RightOrientedTree(heigth, character);
                            break;
                        default:
                            System.out.println("Wrong choice");

                    }

                }
            }
        } while (!direction.equals("X"));
    }

}
