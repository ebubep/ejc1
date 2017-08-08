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

class Component13{
    Component13(){
        System.out.println("Component1");
    }
    void dispose(){
        System.out.println("Exiting component1");
    }

}
class Component23{
    Component23(){
        System.out.println("component2");
    }
    void dispose(){
        System.out.println("Exiting component2");
    }
}
class Component33{
    Component33(){
        System.out.println("component3");
    }
    void dispose(){
        System.out.println("Exiting component3");
    }
}
    
class Root3{
    Component13 c1=new Component13();
    Component23 c2=new Component23();
    Component33 c3=new Component33();
    Root3(){
       
        System.out.println("Root");
    }
    void dispose(){
        System.out.println("Exiting root");
        c1.dispose();
        c2.dispose();
        c3.dispose();
    }
    
}
public class Ex_12_Stem extends Root3{
    Component13 c1=new Component13();
    Component23 c2=new Component23();
    Component33 c3=new Component33();
    Ex_12_Stem(){
        System.out.println("Stem");
    }
    void dispose(){
        super.dispose();
        System.out.println("Exiting Stem");
        c1.dispose();
        c2.dispose();
        c3.dispose();
    }
    public static void main(String[]args){
        Ex_12_Stem s=new Ex_12_Stem();
        try{
           
        }
        finally{
            s.dispose();
        }
    }
}
        
    

