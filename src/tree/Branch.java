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
public abstract class Branch implements BranchCreatorInterface {
    
    private char character;
    private int height;
    
    public Branch(int height, char character){
        this.height = height;
        this.character = character;
    }
    

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    
}
