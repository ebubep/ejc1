/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

/**
 *
 * @author OMOBOLAJI JR
 */
public class Arrays {
    public static void main(String[] args) {
        int[][] s1 = {{10, 20, 30},{40,50,60},{70,80,90}};
        int[][] s2 = {{4, 5, 6},{7,8,9},{1,2,3}};
        int[] m1 = {s1[0][0]+s2[0][0],s1[0][1]+s2[0][1],s1[0][2]+s2[0][2],
        s1[1][0]+s2[1][0],s1[1][1]+s2[1][1],s1[1][2]+s2[1][2],s1[2][0]+s2[2][0],
        s1[2][1]+s2[2][1],s1[2][2]+s2[2][2]};
        for (int a:m1){
        System.out.println(a);
    }
    }
}
