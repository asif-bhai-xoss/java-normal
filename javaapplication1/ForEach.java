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
public class ForEach {
    public static void main(String[] args) {
        //String arr1[] = new String[3];
        String names[] = {"Asif", "Oishy", "Fatema"};
        int ages[] = {26, 23, 3};
        
        for(String name : names){
            System.out.println(name);
        }
        for(int age : ages){
            System.out.println(age);
        }
    }
}
