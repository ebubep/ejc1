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
public class ForEach {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String names[]={"daniel","jamiu","paul"};
        Integer nums[]={40,50,60};
        for(String s:names){
            System.out.println(s);
        }
        for(Integer i:nums){
            System.out.println(i);
        }
    }
    
}
