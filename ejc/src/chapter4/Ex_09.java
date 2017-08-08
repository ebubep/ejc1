/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

import java.util.*;

/**
 *
 * @author OMOBOLAJI JR
 */
public class Ex_09 {
   public static int fab(int i){
       if (i<=2){
       return 1;}
       return fab(i-1)+fab(i-2);   
   }
    
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int i=sc.nextInt(); 
       for(int n= 1; n <i; n++)
        System.out.println(fab(n));      
    }
} 