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
public class Ex_14 {
    static String s="initialized";
    static String t;
    static{
        t="static block";
    }
    static void method(){
        System.out.println(s);
        System.out.println(t);
    }
    public static void main(String[]args){
        new Ex_14().method();
        
    }
    
}
