package com.company;

public class Example2 {

    public static void main(String[] args) {

        int sum = 0;
        int[] numbers = {1, 1, 1, 1, 1, 1, 1, 1};

        // for-each loop
        for (int i : numbers) {
            sum += i;
        }

        // for loop
        /*
        for (int i = 0; i < 5; i++) {
            System.out.println("Name");
        }
        */

        System.out.println("Suma niza je: " + sum);
    }
}
