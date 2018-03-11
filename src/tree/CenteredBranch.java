/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author klimek
 */
public class CenteredBranch extends Branch implements BranchCreatorInterface {

    public CenteredBranch(int height, char character) {
        super(height, character);
    }

    @Override
    public void printBranch(int height, char character) {
        for (int i = 0; i < height; i++) {
            printBlanks(i, height);
            printLeaves(i, character);
            System.out.println();
        }
    }

    @Override
    public void printLeaves( int level, char character) {
        for (int i = 0; i < level * 2 + 1; i++) {
            System.out.print(character);
        }
    }

    @Override
    public void printBlanks(int level, int height) {
        for (int i = 0; i < height - level - 1; i++) {
            System.out.print(" ");
        }
    }

}
