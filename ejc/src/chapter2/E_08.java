/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

/**
 *
 * @author OMOBOLAJI JR
 */
public class E_08 {
    static int i=47;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        E_08 a1=new E_08();
        E_08 a2=new E_08();
        System.out.println(a1.i+"="+a2.i);
        a2.i++;
        System.out.println(a1.i+"="+a2.i);
    }
    
}
