/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;

/**
 *
 * @author Asus
 */
public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int num1 = rand.nextInt(10); // 0 to 9
        System.out.println("num1 = " + num1);
        
        int num2 = rand.nextInt(11) + 5; // 5 to 10
        System.out.println("num2 = " + num2);
        
        int num3 = (int) (Math.random()*100 + 1); // 1 to 99
        System.out.println("num3 = " + num3);
    }
}
