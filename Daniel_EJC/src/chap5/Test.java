/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap5;

/**
 *
 * @author User
 */
public class Test {
   String str;
   int age;
   
   Test(){
       System.out.println("DC called");
   }
   Test(String s){
       System.out.println(s);
   }
   Test(int i){
       System.out.println(i);
   } 
   Test(String s, int i){
     this(s);
   }
   
     public static void main(String[] args) {
         Test t1 = new Test();
         Test t2 = new Test("java");
         Test t3 = new Test(25);
         Test t4 = new Test ("daniel", 16);
         
         int i1 = t1.getLength();
         int i2 = t2.getLength();
         
         System.out.println(i1);
         System.out.println(i2);
         System.out.println(t3);
         System.out.println(t4);
     }
        int getLength(){
            
        return str.length();
        }
}
