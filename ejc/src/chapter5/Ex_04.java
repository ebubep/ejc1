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
public class Ex_04 {
    String a;
     Ex_04(){
        System.out.println("print a message");
    }
     Ex_04(String s){
         a=s;
         System.out.println("overload constructor");
         
     }
    public static void main(String[]args){
        Ex_04 e=new Ex_04();
        Ex_04 f=new Ex_04("overload constructor");
        
       
        
    }
    
}
