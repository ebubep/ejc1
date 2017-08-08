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
public class StaticTest {
    static int a=23;
    int b=34;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StaticTest st1=new StaticTest();
        StaticTest st2=new StaticTest();
        StaticTest st3=new StaticTest();
        st1.a++;
        st2.a++;
        st3.a++;
        st1.b++;
        st2.b++;
        st3.b++;
        System.out.println("a= "+st1.a);
        System.out.println("a= "+st2.a);
        System.out.println("b= "+ st1.b);
        System.out.println("b= "+st2.b);
        System.out.println("a= "+st3.a);
        System.out.println("b= "+ st3.b);

       
    }
    
}
