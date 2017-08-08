/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;
import java.util.*;

/**
 *
 * @author OMOBOLAJI JR
 */
public class Velocity {
    Double distance;
    Double time;
    Double velocity;
    Random a=new Random();
    public void f(){
        //create a seeded random number generator
        distance=a.nextDouble();
        time=a.nextDouble();
        velocity=distance/time;
        System.out.println("velocity= "+velocity);
        
    }
    
    
    
}
