/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap3;

/**
 *
 * @author User
 */
public class QuadraticEquation {
    static int a = 1;
    static int b = 3;
    static int c = 2;
    
    public static void main(String[] args) {
    double x1 = (-b+ Math.sqrt(b*b-4*a*c))/2*a;
    double x2 = (-b- Math.sqrt(b*b-4*a*c))/2*a;
    System.out.println(x1);
    System.out.println(x2);
    }
}
