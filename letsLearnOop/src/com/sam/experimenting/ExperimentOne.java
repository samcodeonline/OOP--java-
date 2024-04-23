package com.sam.experimenting;

import java.util.Scanner;

public class ExperimentOne {

    public static void main(String[] args) {
        Scanner rowCol = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = rowCol.nextInt();
        System.out.print ("Enter the number of columns: ");
        int col = rowCol.nextInt();
        int [][] arr = new int[row][col];

        int rowCount = 0;
        while (rowCount < arr.length) {
            for (int colCount = 0; colCount < arr[rowCount].length; colCount++) {
                arr[rowCount][colCount] = rowCol.nextInt();
            }
            rowCount++;
        }
        for (int[] integer : arr) {
            System.out.print("\n");
            for (int anInt : integer) {
                System.out.print(anInt + " ");
            }
        }
    }
}
