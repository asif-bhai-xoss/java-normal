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
public class Series {
    public static void main(String[] args) {
        double sum1 = 0;
        for (double i = 1.5; i <=20.5; i=i+1) {
            System.out.print(i+" ");
            sum1 = sum1 + i;
        }
        System.out.println();
        System.out.println("sum1 = " + sum1);
        
        int sum2 = 0;
        for (int i = 1; i <=10; i++) {
            System.out.print(i+"*"+i+" ");
            sum2 = sum2 + (i*i);
        }
        System.out.println();
        System.out.println("sum2 = " + sum2);
    }
}
