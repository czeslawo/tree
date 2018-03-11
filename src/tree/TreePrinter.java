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
        String i = "";
        //String direction = "LEFT";

        //char character = '*';
        while (!i.equals("X")) {
            System.out.println("UP/LEFT/RIGHT or 'X' to exit");
            //if (!i.equals("X")) {
                i = sc.next();
                System.out.println("Heigth");
                int heigth = sc.nextInt();
                System.out.println("character");
                String chara = sc.next();
                System.out.println();
                char character = chara.charAt(0);
                switch (i) {
                    case "LEFT":
                        new LeftOrientedTree(heigth, character);
                        break;
                    case "UP":
                        new StraightTree(heigth, character);
                        break;
                    case "RIGHT":
                        new RightOrientedTree(heigth, character);
                        break;
                    case "X":
                        System.exit(0);
                    default:
                        System.out.println("Wrong choice");
               // }
            }
        }
    }
}
