/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

/**
 *
 * @author OMOBOLAJI JR
 */
public class Ex_19 {
    static void printStrings(String... strs) {
    for(String s : strs)
    System.out.println(s);
}
    public static void main(String args[]) {
    printStrings("These", "are", "strings","of","integers");    
    }
}