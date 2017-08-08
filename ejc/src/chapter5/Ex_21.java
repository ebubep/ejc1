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
public class Ex_21 {
    enum PaperCurrencyTypes {
ONE, TWO, FIVE, TEN, TWENTY, FIFTY
}
public static void main(String args[]) {
for(PaperCurrencyTypes s : PaperCurrencyTypes.values())
System.out.println(s + ", ordinal " + s.ordinal());
}
    
}
