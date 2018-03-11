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
public class StraightTree extends Tree {

    public StraightTree(int level, char character) {
        setBranch(new CenteredBranch(level, character));
        getBranch().printBranch(level, character);
    }
}
