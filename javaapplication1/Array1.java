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
public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int arr1[] = new int[n];
        System.out.printf("Enter %d numbers: \n", n);
        for(int i=0; i<n; i++){
            arr1[i] = input.nextInt();
        }
        
        int mx = arr1[0], mn = arr1[0], sum = 0, mul = 1;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] > mx){
                mx = arr1[i];
            }
            if(arr1[i] < mn){
                mn = arr1[i];
            }
            sum = sum + arr1[i];
            mul = mul * arr1[i];
        }
        System.out.println("Max = " + mx);
        System.out.println("Mix = " + mn);
        System.out.println("Sum = " + sum);
        System.out.println("Mul = " + mul);
    }
}
