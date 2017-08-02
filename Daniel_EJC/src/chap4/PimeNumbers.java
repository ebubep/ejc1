package chap4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class PimeNumbers {
    static int i;
    static int j;
    
    public static void main(String[] args) {
    for(i=1; i<10; i++){
        for(j=1; j<=10; j++){
        if((j%i==0)&&(j%j==0)){
        
            System.out.println(j);
        }
        }
    }
    }     
}
