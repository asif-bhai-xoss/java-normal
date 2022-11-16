/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Asus
 */
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        
        System.out.println(numbers);
        
        System.out.println();
        numbers.remove(1); //index
        for(int number : numbers){
            System.out.print(number +" ");
        }
        System.out.println();
        
        //to delete all from ArrayList
        //numbers.clear();
        
        boolean check = numbers.isEmpty();//false
        boolean hasValue = numbers.contains(30); //true
        
        int pos = numbers.indexOf(30); //1
        
        int getValue = numbers.get(1);
        
        //replace value
        numbers.set(0, 100);
        
        
        Iterator it = numbers.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println("\nArrayList size = "+numbers.size());
    
    }
}
