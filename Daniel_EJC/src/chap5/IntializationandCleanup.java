/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap5;

/**
 *
 * @author User
 */
public class IntializationandCleanup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AccessControl at = new AccessControl(2000,2,100);
        int si = at.calcSimpleInterest();
        System.out.println(si);
    }
    
}
