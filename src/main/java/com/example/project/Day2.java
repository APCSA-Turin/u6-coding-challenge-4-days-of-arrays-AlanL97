
package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        int j = 0;
        int k = 0;
        String[][] list = new String[2][names.length];
        for (int i = 0; i < names.length; i++) {
            int random = (int) (Math.random()*2);
            if (random == 0) {
                list[0][i] = names[i];
                j++;
            } else {
                list[1][i] = names[i];
                k++;
            }
        }
        return list; //you must return a two dimensional string array
    }

    public static void main(String[] args) {
        
    }
}