package com.softmakers.level03;

import java.util.Scanner;

class Question10950 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numOfCase = sc.nextInt();
        int[] results = new int[numOfCase];

        Scanner sc2 = new Scanner(System.in);
        for(int i = 0; i < numOfCase; i++) {

            int firstNum = sc2.nextInt();
            int secondNum = sc2.nextInt();
            results[i] = firstNum + secondNum;
        }

        for(int j = 0; j < numOfCase; j++) {

            System.out.println(results[j]);
        }
    }
}
