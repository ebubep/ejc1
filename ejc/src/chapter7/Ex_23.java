/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;
import java.util.*;

/**
 *
 * @author OMOBOLAJI JR
 */
class Aa1{
    static{
        System.out.println("Aa1");
    }
    public static int AA(){
        Random rnd=new Random();
        int i=rnd.nextInt(22);
        System.out.println(i);
        return i;
    }
}
public class Ex_23 {
    public static void main(String[]args){
        System.out.println("main1");
        Aa1.AA();
        System.out.println("villa");
        Aa1 a=new Aa1();
      
        
        
    }
    
}
