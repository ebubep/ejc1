/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap5;

/**
 *
 * @author PEARLS
 */
public class Dog {
   Dog(){
       System.out.println("ouuuuu!");   
       }
   Dog(String s, int i){
   bark(s);
   }
   
   Dog(int i, String s){
   bark("woof woof");
   }
   
    void bark(String sound){
      System.out.println("sound");
  
  }
    
    public static void main(String[] args) {
       
    }
}
