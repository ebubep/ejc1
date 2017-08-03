/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap7;

/**
 *
 * @author PEARLS
 */
class Art {   
    
    Art() { System.out.println("Art constructor"); } 
} 

class Drawing extends Art {  
  
    Drawing() { System.out.println("Drawing constructor"); }

} 

public class Cartoon extends Drawing {   
    
    public static void main(String[] args) {    
        Cartoon x = new Cartoon(); 
    System.out.println(x);
    }
} 


