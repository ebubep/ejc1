/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

/**
 *
 * @author OMOBOLAJI JR
 */
public class Ex_11 {
      protected void finalize(){
        System.out.println("finalize maethod");
        
    }
    public static void main(String[]args){
       new Ex_10();
        System.gc();       
        
    }
}
