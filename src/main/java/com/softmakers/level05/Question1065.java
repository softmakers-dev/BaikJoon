package com.softmakers.level05;

import java.util.Scanner;

public class Question1065 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arg = scanner.nextInt();
        getSameDiffNumbers(arg);
    }

    public static void getSameDiffNumbers(int arg) {

        int resultCount = 0;
        for (int i=1; i<=arg; i++) {

            if (i < 10) {
                resultCount++;
            } else if (i <100 && i >=10) {
                resultCount++;
            } else if (i >= 100) {

                int first = (int)(i / 100);
                int second = (int)((i % 100) / 10);
                int third = i % 10;

                if (first - second == second - third) {
                    resultCount++;
                }
            }
        }

        System.out.print(resultCount);
    }
}
