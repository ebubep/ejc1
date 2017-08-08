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
public class Dog {
     void bark(){
         System.out.println("barking");        
    }
     void bark(String s){
         System.out.println("hallowing");         
     }
     void bark(int i){
         System.out.println("wagging of tail");
     }
    public static void main(String[]args){
        Dog d=new Dog();
        d.bark();
        d.bark("String");
        d.bark(1);
        
    }
    
    
}
