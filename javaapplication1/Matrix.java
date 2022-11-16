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
public class Matrix {
    static int[][] matrix_input(int[][] mat){
        Scanner input = new Scanner(System.in);
                for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.printf("Mat[%d][%d] = ", i, j);
                mat[i][j] = input.nextInt();
            } 
        }
        return mat;
    }
    
    static void matrix_print(int[][] mat){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]+" ");
            } 
            System.out.println();
        }
    }
    
    static int[][] matrix_sum(int[][] matA, int[][] matB){
        Scanner input = new Scanner(System.in);
        int[][] matC = new int[matA.length][matA[0].length];
        int sum = 0;
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[0].length; j++) {
                sum = matA[i][j] + matB[i][j];
                matC[i][j] = sum;
            } 
        }
        return matC;
    }
    
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int row = 2;
        int col = 3;
        /*
        5 8 7 || 1 2 3
        3 2 1 || 4 5 6
        */
        int[][] matA = new int[row][col];
        int[][] matB = new int[row][col];
        int[][] matC = new int[row][col];
        
        System.out.println("Enter elements for matrix A: ");
        matA = matrix_input(matA);
        System.out.println("\nMatrix A = ");
        matrix_print(matA);
        
        System.out.println("\nEnter elements for matrix B: ");
        matB = matrix_input(matB);
        System.out.println("\nMatrix B = ");
        matrix_print(matB);
        
        matC = matrix_sum(matA, matB);
        System.out.println("\nMatrix C = ");
        matrix_print(matC);
        
                
        
        
        //matrix B, A + B, sum of diagonal, upper triange, lower ttriangle etc..
        
        
        
        
    }
}
