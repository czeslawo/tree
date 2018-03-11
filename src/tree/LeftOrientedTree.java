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
public class LeftOrientedTree extends Tree{
    
    public LeftOrientedTree(int level, char character){
        setBranch(new LeftOrientedBranch(level, character));
        getBranch().printBranch(level, character);
        
    }
}
