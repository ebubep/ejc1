/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;
/**
 *
 * @author OMOBOLAJI JR
 */
class Amphibian{
    void Amphibians(){
        System.out.println("Amphibians");
    }
    void moveInWater(){
        System.out.println("Amphibians can move in water");
    }
}
public class Frog extends Amphibian{
    @Override
    void moveInWater(){
        System.out.println("Frog moves in water");
    }
    @Override
    void Amphibians(){
    System.out.println("Frogs are Amphibians");
}
    public static void main(String[]args){
        Amphibian f=new Frog();
        f.moveInWater();
        f.Amphibians();
        
    }
    
    
}
