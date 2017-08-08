/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap7;

/**
 *
 * @author PEARLS
 */
class Component1 {

    Component1(String s){
    System.out.println(s);
}

}

class Component2 {

Component2(String s){
    System.out.println(s);   
    
}
}

class Component3 {

    
    Component3(String s){
        System.out.println(s);
    }
}

class Root{
Component1 c1 = new Component1("comp1");
Component2 c2 = new Component2("comp2");
Component3 c3 = new Component3("comp3");
void dispose(){System.out.println("disposed");}
}

class Stem extends Root{
  Component1 cp1 = new Component1("cp1");
Component2 cp2 = new Component2("cp2");
Component3 cp3 = new Component3("cp3");  
    void dispose(){super.dispose();}
    public static void main(String[] args) {
        
        Stem s = new Stem();
        System.out.println(s);
        
    }
   
}
