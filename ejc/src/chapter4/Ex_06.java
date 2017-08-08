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
public class Ex_06 {
static boolean test(int testval, int begin, int end) {
    boolean result=false;
    if(testval>=begin && testval <= end)
    result=true;
    return result;
}
  public static void main(String[] args) {
System.out.println(test(10, 5, 3));
System.out.println(test(5, 10, 13));
System.out.println(test(5, 5, 16));
}
    
}