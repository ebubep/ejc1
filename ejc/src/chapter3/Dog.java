package chapter3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OMOBOLAJI JR
 */
public class Dog {
    String name;
    String says;
    static void compare(Dog d1, Dog d2){
       
        System.out.println(d1==d2);
        System.out.println(d1.equals(d2));
        System.out.println(d1.name==d2.name);
        System.out.println(d1.name.equals(d2.name));
        System.out.println(d1.says==d2.says);
        System.out.println(d1.says.equals(d2.says));
      
        
        
    }
    
}
