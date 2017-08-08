/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

import java.util.Random;

/**
 *
 * @author OMOBOLAJI JR
 */
class Mathematics{
    Random rnd=new Random();
     final void Addition(int a, int b){
        a=rnd.nextInt(12);
        b=rnd.nextInt(22);
        System.out.println(a+"*"+b+"= "+a*b);
    }
}
public class Ex_21 extends Mathematics{
    @Override
    final void Addition(int a, int b){
        super.Addition(a, b);
        a=rnd.nextInt(12);
        b=rnd.nextInt(22);
        System.out.println(a+"*"+b+"= "+a*b);
    }
    public static void main(String[]args){
        Ex_21 e=new Ex_21();
        e.Addition(12, 32);
    }
    
}
