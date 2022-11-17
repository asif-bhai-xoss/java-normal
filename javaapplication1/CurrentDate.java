/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Asus
 */
public class CurrentDate {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println("Today = "+today);
        
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " +localDate);
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String finalDate = dateFormat.format(today);
        System.out.println("finalDate = " + finalDate);
    }
}
