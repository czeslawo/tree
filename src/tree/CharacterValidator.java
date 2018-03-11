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
public class CharacterValidator {

    public static boolean validateCharacter(String toValidate) {
        try {
            char validated = toValidate.charAt(0);

            return true;

        } catch (Exception ex) {
            System.err.println(ex);
        }
        System.out.println(CommonMessages.WRONGINPUT);
        return false;
    }
}
