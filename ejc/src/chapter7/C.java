/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

/**
 *
 * @author OMOBOLAJI JR
 */
class A{
    A(){
        System.out.println("Announce A");
    }
}
class B{
    B(){
        System.out.println("Announce B");
    }
}
public class C extends A {
    B b=new B();
    public static void main(String[]args){
        C c=new C();
    }
}
