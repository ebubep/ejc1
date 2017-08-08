/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap2;

/**
 *
 * @author PEARLS
 */
public class DataOnly {
   int i;
   double d;
   boolean b;
   
    public static void main(String[] args){
   DataOnly data = new DataOnly();
   data.i = 47;
   data.d = 1.1;
   data.b = false;
   
   System.out.println(data.i);
   System.out.println(data.d);
   System.out.println(data.b);
   }
  

    
}
