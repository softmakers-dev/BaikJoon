package com.softmakers.level03;

import java.util.Scanner;

public class Question10818 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] numbers = new int[count];

        for(int j=0; j<count; j++) {

            if (scanner.hasNextInt()) {
                numbers[j] = scanner.nextInt();
            } else {
                scanner.next();
            }
        }

        int highest = -1000000;
        int lowest = 1000000;

        for(int i=0; i<count; i++) {

            if(numbers[i] > highest) {
                highest = numbers[i];
            }

            if(numbers[i] < lowest) {
                lowest = numbers[i];
            }
        } // end of for

        System.out.print(lowest + " " + highest);
    }
}
