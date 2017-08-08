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

//to
class School{
    School(){
        System.out.println("This is a tertiary institution");
    }
}
class EngineeringFaculty extends School{
    EngineeringFaculty(){
        System.out.println("This is the Engineering faculty");
    }
}
public class Ex_03 extends EngineeringFaculty {    
    
    public static void main(String[]args){
        Ex_03 e=new Ex_03();
        
    }
    
}
