/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap3;

/**
 *
 * @author PEARLS
 */
public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int a = 1;
      int b = 3;
      int c = 2;
      
      double x1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
      double x2 = (-b - Math.sqrt(b*b - 4*a*c))/2*a;
      
      System.out.println("X1 is :" + x1 + " , X2 is :" + x2);
      
      Integer i = new Integer(0x2f);
      String j = Integer.toString(i);
      Integer k = new Integer(10);
      
      
      System.out.println(j);
      
      
     
      
    }
    
}
