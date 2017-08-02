package chap4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Loops {
    static int i = 0;
    
    public static void main(String[] args) {
        
        for(i=0; i<=100; i++){
         System.out.println(i);
         if(i==99){
         break;
         }
        }
    }
}
