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
class Component12{
    Component12(int i){
        System.out.println("Component1: "+i);
    }

}
class Component22{
    Component22(float f){
        System.out.println("component2: "+f);
        
    }
}
class Component32{
    Component32(double d){
        System.out.println("component3; "+d);
    }
}
    
class Root2{
    Root2(String s){
        Component12 c1=new Component12(12);
        Component22 c2=new Component22(22.54f);
        Component32 c3=new Component32(32.8);
        System.out.println("Root: "+s);
    }
    
}
public class Stem2 extends Root2 {
    Component12 c1=new Component12(21);
    Component22 c2=new Component22(23f);
    Component32 c3=new Component32(33.7);
    Stem2(String s){
        super(s);
        System.out.println("Stem: "+s);
    }
    public static void main(String[]args){
        Stem2 d=new Stem2("Strings");
        
    }
}
