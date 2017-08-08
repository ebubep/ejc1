/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap2;

/**
 *
 * @author PEARLS
 * @version 1.0
 * @since 2017
 *
 */
public class AllTheColorsOfTheRainbow {
    static int anIntegerRepresentingColors;
    
    /**
     * @return a new color:
     * <ol>
     * <li>rgb value of new color
     * <li>color name
     * </ol>
     * @param  rgb value of a value
     * @deprecated 
     */
     void changeTheHueOfTheColor(int newHue) {     
    AllTheColorsOfTheRainbow.anIntegerRepresentingColors = newHue;
  }     
}
