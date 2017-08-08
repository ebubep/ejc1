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
class Base{
    Base(int i){
        System.out.println("int i= "+i);
    }
}
public class Derive extends Base {
    Derive(int i){
        super(i);
        System.out.println("Derived "+i);
        
    }
    Derive(){
        super(44);
        System.out.println("No-args");
    }
    public static void main(String[]args){
        Derive d=new Derive();
        Derive e=new Derive(45);
    }
}
