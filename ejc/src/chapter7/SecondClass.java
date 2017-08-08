/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

/**
 *
 * @author OMOBOLAJI JR
 */
class Simple{
    String s;
    Simple(){
        s="simple";
        System.out.println(s);
    }
       public String toString(){
       return s;     
        }
    }
public class SecondClass {
      String s;
     public String toString(){
         if(s==null)
             s="lazy initialization";
       return s;     
        }
  
    public static void main (String[]args){
        Simple s=new Simple();
        SecondClass sc=new SecondClass();
        System.out.println(sc);        
    }
    
}
