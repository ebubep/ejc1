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
public class Ex_15 {
     public int method(){
         int i;
         int count=0;
            for( i=0; i<10; i++)
                for(int j=0; j<i; j++)
                    if(j/i==0)
                        count++;
             System.out.println(count);
            return count;
        }
    public static void main(String[]args){
        Ex_15 e=new Ex_15();
        e.method();
        System.out.println(e.method());
        
    }
    
}
