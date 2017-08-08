/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

/**
 *
 * @author OMOBOLAJI JR
 */
public class Ex_17 {
    Ex_17(String s){
        System.out.println(s);
    }
    public static void main(String[]args){
        Ex_17[] array=new Ex_17[5];
        for(int i=0; i<array.length; i++)
        array[i] = new Ex_17(Integer.toString(i));
            
    }
}
