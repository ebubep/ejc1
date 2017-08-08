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
public class Ex_09 {
    Ex_09(String s){
        System.out.println("String s="+s);
    }
    Ex_09(int i){
        this("strings");
        
    }
    public static void main(String[]args){
        Ex_09 e=new Ex_09(22);
        Ex_09 f=new Ex_09("strings");
    }
}
