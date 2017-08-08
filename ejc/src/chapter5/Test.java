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
public class Test {
 String str;
    
    Test(){
        str="Jamiu";        
    }
    Test(String s){
        str=s;
    }
    int getLenght(){
    return str.length();
}

public static void main(String[]args){
    Test t=new Test();
    Test t2=new Test("Jamiu");
    int l=t2.getLenght();
    int len=t.getLenght();
    System.out.println(len);
    System.out.println(l);

}

}