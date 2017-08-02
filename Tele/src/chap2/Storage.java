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
public class Storage {
  
    public static int storage(String s){
    return s.length() * 2;
    }
    
    public static void main(String[] args ){
    Storage store = new Storage();
    
    store.storage("adetele");
    
    }
}
