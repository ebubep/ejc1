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
class BaseClass{
    public void overload(){
        System.out.println("First method");
    }
    public void overload(int i){
        System.out.println("Second method= "+i);
    }
    public void overload(double d){
        System.out.println("third method= "+d);
    }
    
}
public class Ex_13 extends BaseClass {
    public void overload(float f){
        System.out.println("fourth method= "+f);
    }
    public static void main(String[]args){
        Ex_13 a=new Ex_13();
        a.overload();
        a.overload(23);
        a.overload(24.1f);
        a.overload(22.33);
    }
    
}
