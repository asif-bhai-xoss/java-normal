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
public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int c1 = 0;
        int c2 = 0;
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                c1=1;
                break;
            }
        }
        if (c1==0) {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
        
        for (int i = 2; i < num; i++) {
            c2=0;
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    c2=1;
                }
            }
           if(c2==0) {
               System.out.print(i+" ");
           }
        }
        System.out.println();
        
    }
}
