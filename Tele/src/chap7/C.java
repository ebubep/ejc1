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
  
     A(String s ){
         System.out.println(s);
  
  }
     
}

class B {

    B (String s){
    System.out.println(s);

}

}

 class C extends A {
    
   C(){
   super("A");
   
   } 
   
    

static C c = new C();

    public static void main(String[] args) {
        System.out.println(c);
    }
}
