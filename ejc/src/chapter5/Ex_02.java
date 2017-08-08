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
public class Ex_02 {
    String s="initialize at definition";
    String t;
    Ex_02(String j){
        t=j;                
    }
    public static void main(String[]args){
        Ex_02 e=new Ex_02("initialize at constructor");
        System.out.println(e.s);
        System.out.println(e.t);
        
    }
    
}
