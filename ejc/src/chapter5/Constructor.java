package chapter5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OMOBOLAJI JR
 */
public class Constructor {
    int numbers;
    public Constructor(int i){       
        System.out.println(i);
    }

    /**
     *
     * @param s
     */
    public void Constructor(String s){
        System.out.println(s);
    }
        
    
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=0; i<10; i++){
        Constructor c=new  Constructor (i);
        c.Constructor("Who");
        
        }  
    }
}
