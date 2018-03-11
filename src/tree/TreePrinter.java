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
    }

    public static void main(String[] args) {
        System.out.println(CommonMessages.STARTMESSAGE);
        Scanner sc = new Scanner(System.in);
        String direction = "";
        do {
            System.out.println(CommonMessages.DIRECTION);

            direction = sc.next();
            if (!direction.equals("X")) {
                boolean directionValidated = DirectionValidator.validateDirection(direction);
                System.out.println(CommonMessages.HEIGHT);
                int heigth = sc.nextInt();
                boolean heightValidated = HeightValidator.validateHeight(heigth);
                System.out.println(CommonMessages.CHARACTER);
                String chara = sc.next();
                boolean characterValidated = CharacterValidator.validateCharacter(chara);
                System.out.println();
                if (directionValidated && heightValidated && characterValidated) {
                    char character = chara.charAt(0);
                    switch (direction) {
                        case DirectionValidator.LEFT:
                            new LeftOrientedTree(heigth, character);
                            break;
                        case DirectionValidator.UP:
                            new StraightTree(heigth, character);
                            break;
                        case DirectionValidator.RIGHT:
                            new RightOrientedTree(heigth, character);
                            break;
                        default:
                            System.out.println(CommonMessages.WRONGCHOICE);

                    }

                }
            }
        } while (!direction.equals(DirectionValidator.EXIT));
        System.out.println(CommonMessages.BYE);
    }

}
