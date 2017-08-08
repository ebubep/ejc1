package chapter5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OMOBOLAJI JR
 */
public class This {
    int age;
    This(){
        System.out.println("DE called");
    }
    This(String s){
        System.out.println(s);
    }
    This(int i){
        age=22;
        System.out.println(i);
    }
    This(String s,int i){
        this(i);
    }
    public static void main(String[]args){
        This ti=new This();
        This t2=new This("jamaah");
        This t3=new This(33);
        This t4=new This("jamo",32);
        System.out.println(t4.age);
    }
}
