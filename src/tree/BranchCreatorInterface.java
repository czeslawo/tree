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
public interface BranchCreatorInterface {
    public void printBranch(int level, char character);
    public void printLeaves(int level, char character);
    public void printBlanks(int level, int heigth);
}
