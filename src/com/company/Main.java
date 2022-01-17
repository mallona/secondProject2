package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[][] array = createMatrix();
        System.out.println("Initial matrix");
        displayArray(array);
        System.out.println("New matrix");
        replaceNumbers(array);
    }

    public static int[][] createMatrix() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter integer number");
        int size1 = s.nextInt();
        int size2 = size1;
        int[][] matrix = new int[size1][size2];

        Random r = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = r.nextInt(-10, 10);
            }
        }
        return matrix;
    }

    public static void displayArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void replaceNumbers(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%5d", matrix[i][matrix.length - 1 - j]);
            }
            System.out.println();
        }
    }
}


