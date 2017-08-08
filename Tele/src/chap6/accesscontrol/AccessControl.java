/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap6.accesscontrol;

/**
 *
 * @author PEARLS
 */
public class AccessControl {
public int principal;
public int time;
public int rate;

AccessControl(int p, int r, int t){
this.principal = p;
this.time = t;
this.rate = r;
}

public int calcSimpleinterest(){
int si = (principal * rate * time)/100;
return si;
}
    
}
