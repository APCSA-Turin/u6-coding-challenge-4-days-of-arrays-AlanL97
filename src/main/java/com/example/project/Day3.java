package com.example.project;

public class Day3 {
      public static String[][] generateSnowflake(int size) { //you will be tested on this method
        String[][] grid = new String[size][size];
        int k = 0;
        for (int i = 0; i < size; i++) {
          for (int j = 0; j < size; j++) {
            if (j == k || j == size/2 || j == size-1-k) {
              grid[i][j] = "*";
            } else if (i == size/2) {
              grid[i][j] = "*";
            } else {
              grid[i][j] = " ";
            }
          }
          k++;
        }
        return grid;
    }

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
        for (int i = 0; i < 11; i++) {
          for (int j = 0; j < 11; j++) {
            System.out.print(snowflake[i][j]);
          }
          System.out.println();
        }
    }

    // Test for the snowflake generation
    public static void main(String[] args) {
      printSnowflake(generateSnowflake(11));
    }
}
