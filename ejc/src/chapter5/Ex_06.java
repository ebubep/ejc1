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
public class Ex_06 {
    public void bark(){
         System.out.println("barking");        
    }
     public void bark(String s, int i){
         System.out.println("hallowing");         
     }
     public void bark(int i, String s){
         System.out.println("wagging of tail");
     }
    public static void main(String[]args){
        Ex_06 d=new Ex_06();
        d.bark();
        d.bark("String", 33);
        d.bark(1, "string");
        
    }
    
}
