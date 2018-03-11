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
public class HeightValidator {

    public static boolean validateHeight(int toValidate) {
        try {
            if (toValidate > -1 && toValidate < Integer.MAX_VALUE) {
                return true;
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }
        System.out.println(CommonMessages.WRONGINPUT);
        return false;
    }
}
