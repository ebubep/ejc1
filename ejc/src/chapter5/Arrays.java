package chapter5;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OMOBOLAJI JR
 */
public class Arrays {
    public static void main(String[]args){
        Random rnd=new Random(27);
        int[] a=new int[rnd.nextInt(45)];
        System.out.println(a.length);
        for(int i = 0; i < a.length; i++){
            a[i]=rnd.nextInt(45);
            System.out.println(i);
        }
    }
}
