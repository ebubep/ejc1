/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;
import java.util.*;
/**
 *
 * @author OMOBOLAJI JR
 */
public class Ex_18 {
    static Random rnd=new Random();
     static final int i=23;
      final int j =29;
      final int k=rnd.nextInt();
      static final int l=rnd.nextInt();
    public String toString(){
        return "i= "+i+" j= "+j+" k="+k+" l="+l;
    }
    public static void main(String[]args){
        Ex_18 e=new Ex_18();
        Ex_18 f=new Ex_18();
        Ex_18 g=new Ex_18();
        e.toString();
        f.toString();
      System.out.println(e);
      System.out.println(f);
      System.out.println(g);
    }
    
}
