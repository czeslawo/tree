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
public class LeftOrientedBranch extends Branch implements BranchCreatorInterface  {

    public LeftOrientedBranch(int heigth, char character){
        super(heigth, character);
    }
    @Override
    public void printBranch(int level, char character) {

        for (int i = 0; i < level; i++) {
            printLeaves(i, character);
            System.out.println();

        }
    }



    @Override
    public void printLeaves( int level, char character) {
        for(int i = 0; i<level*2+1;i++){
            System.out.print(character);
        }
    }

    @Override
    public void printBlanks(int level, int heigth) {
        //not needed
    }

}
