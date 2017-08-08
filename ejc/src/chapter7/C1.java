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
class A1{
    A1(String s){
        System.out.println("Announce A= "+s);
    }
}
class B1{
    B1(int i){
        System.out.println("Announce B= "+i);
    }
}
public class C1 extends A1 {
    C1(String s){
        super(s);
        
    }
    B1 b=new B1(2);
    public static void main(String[]args){
        C1 c=new C1("Strings");
    }
}

