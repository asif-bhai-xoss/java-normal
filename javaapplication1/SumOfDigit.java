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
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int temp = num, sum=0, pali=0, r;
        
        while(temp!=0){
            r = temp%10;
            sum = sum + r;
            pali = (pali * 10)+ r;
            System.out.print(r+" ");
            temp = temp/10;
        }
        System.out.println();
        System.out.println("Sum = "+sum);
        System.out.println("Reverse = "+pali);
    }
}
