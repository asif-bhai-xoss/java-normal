/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Asus
 */
public class java {
    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<Integer>();
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        ArrayList<Integer> numbers3 = new ArrayList<Integer>();
        
        numbers1.add(10);
        numbers1.add(30);
        numbers1.add(20);
        System.out.println("numbers1 = " + numbers1);
        
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        System.out.println("numbers2 = " + numbers2);
        
        numbers3.addAll(numbers1);
         System.out.println("numbers3 = " + numbers3);
        
        boolean isEqual = numbers1.equals(numbers2);
        System.out.println(isEqual);
        
        Collections.sort(numbers1);
        Collections.sort(numbers1,Collections.reverseOrder());
        
        
        
    }
}
