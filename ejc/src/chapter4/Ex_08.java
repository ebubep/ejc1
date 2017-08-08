package chapter4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OMOBOLAJI JR
 */
public class Ex_08 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=0; i<20; i=i+2){
            switch(i){
                case 2:System.out.println("case 2");
                    break;
                case 4:System.out.println("case 4");
                    break;
                case 6:System.out.println("case 6");
                    break;
                case 8:System.out.println("case 8");
                    break;
                default:System.out.println(i);
                    
                  
            }
        }
          System.out.println("");
        //removing break
         for(int i=0; i<20; i=i+2){
            switch(i){
                case 2:System.out.println("case 2");
                 
                case 4:System.out.println("case 4");
                  
                case 6:System.out.println("case 6");
                   
                case 8:System.out.println("case 8");
                   
                default:System.out.println(i);
    
}
}
    }
}
