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
public class Constructor_1 {
    int age;
    String str;
    double d;
    Constructor_1(){
        str="Jamovilla";
    }
    Constructor_1(String s){
        str=s;     
    }
    Constructor_1(int i){
        age=i;
    }
    int getLength(){
        return str.length();
    }
  
    public static void main(String[]args){
        Constructor_1 t1=new Constructor_1();
        Constructor_1 t2=new Constructor_1("Omobolaji");
        Constructor_1 t3=new Constructor_1(25);
        int a=t1.getLength();
        int b=t2.getLength();
        int c= t3.age;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
    }
    
}
