/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

import static chapter3.Dog.compare;

/**
 *
 * @author OMOBOLAJI JR
 */
public class Chapter3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Aliasing a=new Aliasing();
        Aliasing b=new Aliasing();
        a.f=12f;
        b.f=23f;
        System.out.println("a.f: "+a.f);
        System.out.println("b.f: "+b.f);
        a=b;
        System.out.println("a.f: "+a.f);
        System.out.println("b.f: "+b.f );
        a.f=2f;
        System.out.println(a.f);
        System.out.println(b.f);
        
        Velocity v=new Velocity();
        v.f();
        
        Dog d1=new Dog();
        Dog d2=new Dog();
        Dog d3=d1;
        
        d1.name="spot";
        d2.name="scruffy";
        d1.says="Ruff!";
        d2.says="wurlf!";
        
        System.out.println(d1.name+" says "+d1.says);
        System.out.println(d2.name+" says "+d2.says);
         System.out.println("compairing d1 and d2");
          compare(d1, d2);
          System.out.println("compairing d2 and d3");
          compare(d2, d3);
          System.out.println("compairing d1 and d3");
          compare(d1, d3);
          
          Coin c=new Coin();
          c.coin();
          
          Conversion q=new Conversion();
          q.con();
          
          Interest i=new Interest();    
          i.simpleInterest();
          
          QuadraticEquation n=new QuadraticEquation();
          n.calc();
          
         
          
          
          
    }
    
}
