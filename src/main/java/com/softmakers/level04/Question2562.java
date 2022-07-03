package com.softmakers.level04;

import java.util.Scanner;

public class Question2562 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] inputs = new int[9];

        for(int i=0; i<9; i++) {

            if(scanner.hasNextInt()) {
                inputs[i] = scanner.nextInt();
            } else {
                scanner.next();
            }
        } // end of for

        int biggest = inputs[0];
        int index = 0;

        for(int j=0; j<9; j++) {

            if(inputs[j] > biggest) {
                biggest = inputs[j];
                index = j;
            }
        }

        System.out.println(biggest);
        System.out.print(index + 1);
    }
}
