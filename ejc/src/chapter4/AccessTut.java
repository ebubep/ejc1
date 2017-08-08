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
public class AccessTut {
    public int rate;
    public int time;
    public int principal;
    public AccessTut(int p,int r, int t){
       principal=p;
       rate=r;
       time=t;       
   }
    public int calcsi(){
       int si=principal*rate*time/100;
       return si;
       
   }
}
