/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap4;
import java.util.*;

/**
 *
 * @author PEARLS
 */
public class Controllingexecution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      exercise3();
      exercise5();
      exercise6(6,1,10);
      exercise7();
      exercise8();
      exercise9(10);
      
       
    }
    
    static void exercise3(){
        int i;
        int m = 0;
        int n;
        Random rand = new Random(45);
         for(i=0;i<25;i++){
      n = rand.nextInt(100);
      if( n > m && m != 0) {
      System.out.println(n + " is Greater than: " + m);
      }else if (n == m){
       System.out.println(n + " is Equal to: " + m);
      }else if(n < m){
       System.out.println(n + " is less than: " + m);
      }else if (m == 0){
      System.out.println(n);
      }
      m = n;
      i--;
     }
    }
    
    static void exercise5(){
        Integer i = new Integer(0x2f);
      String j = Integer.toBinaryString(i);
      Integer k = new Integer(10);
      
      
      System.out.println(j);
    
    
    }
    
    static void exercise6(int testval, int begin, int end){
    if (begin < end){
        if(testval >= begin && testval <= end){
        System.out.println("Your value is within the range of " + begin + " and " + end );
        
        }
    
    }else{
    
    System.out.println("Invalid arguments : Begin value must be smaller than end");
    }
    
    }
    
    static void exercise7(){
        int i;
       for(i=0;i<=100;i++){
            System.out.println(i);
           if (i == 99){
           return;
           }
   
    
    }
    
    }
    
    static void exercise8(){
    int i;
    for(i=0;i<=10;i++){
    switch(i){
        case 1: System.out.println("Bad");break;
        case 2: System.out.println("Poor");break; 
        case 3: System.out.println("Fair");break; 
        case 4: System.out.println("Okay");break;
        case 5: System.out.println("Pass");break; 
        case 6: System.out.println("Good");break;
        case 7: System.out.println("Very Good");break;  
        case 8: System.out.println("Excellent");break;
        case 9: System.out.println("Awesome");break;
        case 10: System.out.println("Astonishing");break;
        default: System.out.println("Very Bad");
    
    }
    
    }
  }
  
    static void exercise9(int j){
        int i;
        int o = 0;
        int n = 1;
        int m = 1;
        for(i=0;i<j;i++){
            
         System.out.println(n);
         n = m + o;
         o = m;
         m = n;
         
           
         
         
         
                
            
        
        }
    
    }
}
