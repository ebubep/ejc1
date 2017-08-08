/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap2;

/**
 *
 * @author PEARLS
 */
public class StaticTest {
   static int i = 47;
 public static void main(String[] args){
StaticTest st1 = new StaticTest(); 
StaticTest st2 = new StaticTest();
 }
 
 class Incrementable{
  void increment(){
 StaticTest.i++;
 }
 
 }
}


