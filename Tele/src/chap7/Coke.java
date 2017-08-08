/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap7;

/**
 *exercise 4
 * @author PEARLS
 */

class Juice {

    Juice(){System.out.println("a drink");
    
    }
    
}

class ColaDrink extends Juice{

ColaDrink(){
    System.out.println("a cola drink");}
}

public class Coke extends ColaDrink {

    Coke(){
        System.out.println("it's coke !");
    
    }
    
    public static void main(String[] args) {
        Coke ck = new Coke();
        System.out.println(ck);
    }
        
}
