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
import java.util.*;
public class Rndom {
 static int i;   
 static int j;
 static int k;
 static Random rnd = new Random(45);
 
    public static void main(String[] args) { 
        System.out.println("Random Numbers");
        while(1==1){
    for(i=0; i<=25; i++){
        j=rnd.nextInt(100);
        k=rnd.nextInt(100);
       System.out.println(j);
       System.out.println(k);
       
    if(j<k){
      System.out.println("Lesser"); } 
      else if (j==k){
              System.out.println("Equal");
              }
      else if (j>k){
              System.out.println("Greater");
              }
    }
    
    }
    }
}