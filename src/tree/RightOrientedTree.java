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
public class RightOrientedTree extends Tree {

    public RightOrientedTree(int height, char character) {
        setBranch(new RightOrientedBranch(height, character));
        getBranch().printBranch(height, character);
    }
}
