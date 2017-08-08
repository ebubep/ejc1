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
public class Exercise3 {
   String greeting;
   
   Exercise3(){
  greeting = "hello";
       System.out.println(greeting);
  }
   
   Exercise3(String s){
       System.out.println(greeting + " " + s);
   
   }
   
   
   
    public static void main(String[] args) {
        Exercise3 ex3 = new Exercise3();
    }
}
