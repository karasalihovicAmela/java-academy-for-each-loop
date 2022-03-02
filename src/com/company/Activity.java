package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Activity {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr;
        System.out.print("Enter the length of array: ");
        int limit = scanner.nextInt();

        arr = new int[limit];

        for (int i = 0; i < limit; i++) {
            arr[i] = (int) (Math.random() * 100.0);
        }

        System.out.println(Arrays.toString(arr));

        for (int num : arr) {
            System.out.println(num + " * 13 = " + num * 13);
        }

        //Drugi zadatak
        scanner.nextLine();
        System.out.println("Unesite jedan string!");
        String stringText = scanner.nextLine();
        String[] stringArr = stringText.split(" ");

        for (String str : stringArr) {
            if ((str.substring(0, 1).equals(str.substring(0, 1).toUpperCase()))) {
                System.out.println("This word is Uppercase:" + (str.toUpperCase()));
            } else {
                System.out.println("This word is lowercase:" + (str.toLowerCase()));
            }
        }

        for (int i = 1; i < 100; i++) {
            if (i % 10 == 0){
                System.out.println(i + " ");
                continue;
            }
            System.out.print(i + " ");
        }

    }
}
