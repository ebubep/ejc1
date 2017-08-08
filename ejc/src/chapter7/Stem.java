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
class Component1{
    Component1(){
        System.out.println("Component1");
    }

}
class Component2{
    Component2(){
        System.out.println("component2");
    }
}
class Component3{
    Component3(){
        System.out.println("component3");
    }
}
    
class Root{
    Root(){
        Component1 c1=new Component1();
        Component2 c2=new Component2();
        Component3 c3=new Component3();
        System.out.println("Root");
    }
    
}
public class Stem extends Root {
    Stem(){
        Component1 c1=new Component1();
        Component2 c2=new Component2();
        Component3 c3=new Component3();
        System.out.println("Stem");
    }
    public static void main(String[]args){
        Stem s=new Stem();
    }
}
