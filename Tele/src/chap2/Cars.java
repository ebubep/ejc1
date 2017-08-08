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
public class Cars {
    
    static int noOfTyres = 4;
    
    public static void main(String[] args){
    Cars Ferrari = new Cars();
    Cars Ford = new Cars();
    Cars Tesla = new Cars();
    Cars.addTyre();
    System.out.println(Ferrari.noOfTyres);
      System.out.println(Tesla.noOfTyres);
        System.out.println(Ford.noOfTyres);
    
    }
    
    static void addTyre(){
    Cars.noOfTyres++;
    }
   
 
    
}
