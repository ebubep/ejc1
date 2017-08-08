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
public class Incrementable {
    static int i=47;
    static void increment(int increment){
        i=i++;
        System.out.println("increament="+i);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Incrementable sf=new Incrementable();
        sf.increment(i++);
    }
    
}
