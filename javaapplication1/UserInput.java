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
public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //String name = input.next(); eta space er ag porjonto shob print korbe
        System.out.print("Enter your name = ");
        String name = input.nextLine();
        System.out.println("Name = "+name);
        
        System.out.print("Enter your age = ");
        int age = input.nextInt();
        System.out.println("Age = "+age);
        
        
        System.out.print("Enter your cgpa = ");
        double cgpa = input.nextDouble();
        System.out.println("CGPA = "+cgpa);
        
        System.out.print("Enter your section = ");
        char c = input.next().charAt(0);
        System.out.println("Section = "+c);
       
    }
}
