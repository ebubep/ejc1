/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap5;
import java.util.*;
/**
 *
 * @author User
 */
public class AccessControl {
    private int principal;
    private int  rate;
    private int  time;
    
    AccessControl(int p,int r,int t){
    this.principal = p;
    this.time = t;
    this.rate = r;}
    
    public int calcSimpleInterest(){
        int si = (principal*rate*time)/100;
        return si;
    }
    
}
