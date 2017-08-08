/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

/**
 *
 * @author OMOBOLAJI JR
 */
public class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue){
        anIntegerRepresentingColors=newHue;
         System.out.println("colors= "+ anIntegerRepresentingColors );
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AllTheColorsOfTheRainbow a=new AllTheColorsOfTheRainbow ();
        a.changeTheHueOfTheColor(34);
       
    }
    
}
