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
public class RightOrientedBranch extends Branch implements BranchCreatorInterface  {

    public RightOrientedBranch(int heigth, char character){
        super(heigth, character);
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
        for(int i = 0; i<level*2+1;i++){
            System.out.print(character);
        }
    }

    @Override
    public void printBlanks(int level, int heigth) {
        for(int i=heigth*2-1 - level*2-1; i>0;i--){
            System.out.print(" ");
        }
    }

}
