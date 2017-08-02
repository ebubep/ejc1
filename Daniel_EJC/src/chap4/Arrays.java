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
public class Arrays {
  static  String names[] = {"daniel", "Jamiu", "Paul"};
  static  Integer nums[] = {40,50,60};
    
  public static void main(String[] args) {
  for(String s:names){
      System.out.println(s);
  }
  for (Integer i:nums){
      System.out.println(i);  
  }
  }  
 
}
