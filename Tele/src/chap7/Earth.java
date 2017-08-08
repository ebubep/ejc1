/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap7;

/**
 *
 * @author PEARLS
 */
class Planet {
Planet(String name){
    System.out.println("planet " + name);
}

}


 class Earth extends Planet{

    Earth(){
        super("Earth");
        System.out.println("Earth");
    
    }
    Earth(String color){
        super("Earth");
        System.out.println("a " + color + " planet");
    
    }
    
    public static void main(String[] args) {
        Earth e = new Earth("blue");
    }

}
