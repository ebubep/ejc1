/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

/**
 *
 * @author OMOBOLAJI JR
 */
public class Grade {
   static double s=69.9;
    
      public static void main(String[] args) {
        // TODO code application logic here
          if(s<40){
              System.out.println("F");
          }
          else if(40<=s && s<45){
              System.out.println("E");
              
          }
          else if(45<=s && s<50){
              System.out.println("D");
          }
          else if(50<=s && s<60){
              System.out.println("C");
          }
          else if(60<=s && s<70){
          System.out.println("B");
      }
          else if(70<=s || s<=100){
              System.out.println("A");
              
          }
                      
    }
    
}
