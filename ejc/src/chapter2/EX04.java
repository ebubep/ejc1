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
public class EX04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        class DataOnly {
	int i;
	double d;
	boolean b;
	void show() {
	System.out.println(i);
	System.out.println(d);
	System.out.println(b);	
 }
}	
	DataOnly data = new DataOnly();
	data.i = 3;
	data.d = 2.71828;
	data.b = false;		
	data.show();
	}
}
    
    

