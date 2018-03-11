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
public class DirectionValidator {
    public static final String UP = "UP";
    public static final String LEFT = "LEFT";
    public static final String RIGHT = "RIGHT";
    public static final String EXIT = "X";


    public static boolean validateDirection(String toValidate) {
        try {
            switch (toValidate) {
                case UP:

                case LEFT:

                case RIGHT:
                    return true;
                default:
                    System.out.println(CommonMessages.WRONGINPUT);
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }
        return false;
    }

}
