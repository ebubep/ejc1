package chap4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class IFelse {
    static float score = 69.9f;
    
    public static void main(String[] args) {
    if(score<40){
    System.out.println("You Got an F");
    }
    else if((score<45)&&(score>=41)){
    System.out.println("You Got an E");
    }
    else if((score<50)&&(score>46)){
    System.out.println("You Got a D");
    }
    else if((score<60)&&(score>51)){
    System.out.println("You Got a C");
    }
     else if((score<70)&&(score>61)){
    System.out.println("You Got a B");
    }
    else if((score<101)&&(score>71)){
    System.out.println("You Got an A");
    }
    
    System.out.println(score);
  
    }
}
