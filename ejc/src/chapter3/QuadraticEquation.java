/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;
/**
 *
 * @author OMOBOLAJI JR
 */
public class QuadraticEquation {
    int a=1;
    int b=3;
    int c=2;
    double x1;
    double x2;
    public void calc(){
        x1=(-b+Math.sqrt(((b*b)-(4*a*c))))/2*a;
        x2=(-b-Math.sqrt(((b*b)-(4*a*c))))/2*a;
        System.out.println(x1);
        System.out.println(x2);
    }
            
}
