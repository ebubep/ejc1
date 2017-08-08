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
public class EX_04 {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1; i<100; i++){                       
            int count=0;
            for(int j=2; j<i; j++){
                 
                if ((i%j)==0){++count;}
            }
            if(count<1) System.out.println(i+" is a prime number");
                  
    }
    }
}
                
            
    

   
        
    

