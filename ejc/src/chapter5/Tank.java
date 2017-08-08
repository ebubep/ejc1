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
public class Tank {
    boolean fill=true;
    static int count;
    int id=count++;
    public void filled(){
        System.out.println("Tank "+id+" is created");        
        fill=true;
    }
    public void empty(){
        System.out.println("Tank "+id+" is created");
        fill=false;
    }
    protected void finalize(){
        if(fill)
            System.out.println("Tank "+id+" must be empty for clean up");
        else
            System.out.println("Tank " +id+ " is cleaned up");        
    }
   
    public static void main(String[]args){
      new Tank().empty();
      new Tank().filled();  
      System.gc();
      
    }
}
