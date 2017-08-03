/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap7;

/**
 *EXERCISE 5
 * @author PEARLS
 */
 class A {
  
     A(){
         System.out.println("A");
  
  }
     
}

class B {

    B(){
    System.out.println("B");

}

}

public class C extends A {
B b = new B();
static C c = new C();

    public static void main(String[] args) {
        System.out.println(c);
    }
}
