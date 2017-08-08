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
public class Coin {
    static void coin(){
    Random r=new Random();
    boolean d=r.nextBoolean();
    if(d){
        System.out.println("HEAD");
    }
    else{
        System.out.println("TAIL");
    }
    
    }
    
}
