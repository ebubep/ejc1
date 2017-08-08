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
public class AccessTut {
   private int rate;
   private int time;
   private int principal;
   AccessTut(int p,int r, int t){
       principal=p;
       rate=r;
       time=t;       
   }
   private int calcsi(){
       int si=principal*rate*time/100;
       return si;
       
   }
}
