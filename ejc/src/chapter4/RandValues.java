package chapter4;
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
public class RandValues {
    static int i;
    static int j;
    static int b;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rnd= new Random();
        for(i=0; i<=25; i++){
            b=j;
            j=rnd.nextInt(33);
            
            System.out.println(j);
            
            if(j>b)
                System.out.println("first>second");
            else if(j<b)
                System.out.println("first<second");
            else if(j==b)
                System.out.println("first=second");
        
    }
    }
    
}
