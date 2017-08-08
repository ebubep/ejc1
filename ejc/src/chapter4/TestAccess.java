/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;
import chapter5.*;

/**
 *
 * @author OMOBOLAJI JR
 */
public class TestAccess {
    public static void main(String[]args){
        AccessTut at=new AccessTut(2000,2,10);
        int si=at.calcsi();
        System.out.println(si);
    }
}
