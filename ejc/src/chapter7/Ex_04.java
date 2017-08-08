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
class Maths{
    Maths(int j){
        for(int i=5; i<100; i=i+5){
            j=i;
            System.out.println(j);
        }
    }
}
public class Ex_04 extends Maths {
    public Ex_04(int k) {
        super(k);
        System.out.println(k);
    }
    public static void main (String[]args){
        Ex_04 e=new Ex_04(22);
        
    }
    
}
