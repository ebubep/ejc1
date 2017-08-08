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
public class Ex_08 {
    void method1(){
        method2();
        this.method2();
        
    }
    void method2(){
        System.out.println("method 2");
    }
    public static void main(String[]args){
        Ex_08 e=new Ex_08();
        e.method1();
                
    }
}
