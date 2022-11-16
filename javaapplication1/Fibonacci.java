/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int a=0, b=1, sum=0;
        System.out.print(a+" ");
        System.out.print(b);
        for (int i = 0; i < num-2; i++) {
            sum = a + b;
            System.out.print(" "+sum);
            a = b;
            b = sum;
        }
        System.out.println();
    }
}
