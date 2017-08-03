/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap7;

/**
 * exercise 1
 * @author PEARLS
 */
public class Vehicle {
    public static  int noOfTyres = 4;
}

 class Car extends Vehicle {
 static Vehicle ford = new Vehicle();
     public static void main(String[] args) {
         System.out.println(ford.noOfTyres);
     }
}
