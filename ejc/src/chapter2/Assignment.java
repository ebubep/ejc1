/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

/**
 *
 * @author OMOBOLAJI JR
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        E_01 e_01 = new E_01();
        
         E_06 x=new E_06();
        x.print();
        
         Byte a=2;
         byte a1=a;
         Short b=3;
         short b1=b;
         Long c=4l;
         long c1=c;
         Integer d=1;
         int d1=d;
         Float e=2.3f;
         float e1=e;
         Double f=2.3;
         double f1=f;
         Boolean g=true;
         boolean g1=g;
         Character h='X';
         char h1=h;
        System.out.println("byte="+a1);
        System.out.println("short="+b1);
        System.out.println("long="+c1);
        System.out.println("int="+d1);
        System.out.println("float="+e1);
        System.out.println("double="+f1);
        System.out.println("boolean="+g1);
        System.out.println("char="+h1);
        
         DataOnly data=new DataOnly();
        data.i=47;
        data.d=1.1;
        data.b=true;
        System.out.println("data.i="+data.i);
        System.out.println("data.d="+data.d);
        System.out.println("data.b="+data.b);
        
    }
    
}

