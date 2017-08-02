/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap5;

/**
 *
 * @author PEARLS
 */
public class Exercise8 {
static void alarm(){
wakeUp(6);
wakeUp(8);
}

static void wakeUp(int time){
    System.out.println("wake up it is " + time + " o'clock");
}

    public static void main(String[] args) {
        alarm();
    }
}
