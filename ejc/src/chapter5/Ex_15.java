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
public class Ex_15 {
    String s="instance initialization";
    void method(){
        System.out.println(s);
    }
    public static void main(String[]args){
        new Ex_15().method();
    }
    
}