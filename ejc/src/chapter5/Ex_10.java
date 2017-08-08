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
public class Ex_10 {
    protected void finalize(){
        System.out.println("finalize maethod");
        
    }
    public static void main(String[]args){
        Ex_10 e=new Ex_10();
        
    }
}
