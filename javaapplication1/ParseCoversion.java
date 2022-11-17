/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Asus
 */
public class ParseCoversion {
    public static void main(String[] args) {
        // convert int, double to string
        int i = 5;
        double d = 5.56;
        
        String s1 = Integer.toString(i);
        System.out.println("s1 = " + s1);
        String s2 = Double.toString(d);
        System.out.println("s2 = " + s2);
        
        // convert String to int, double
        String s3 = "32";
        int i2 = Integer.parseInt(s3);
        System.out.println("i2 = " + i2);
        
    }
}
