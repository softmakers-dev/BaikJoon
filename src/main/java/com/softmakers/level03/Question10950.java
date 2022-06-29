package com.softmakers.level03;

/**
 * Special thanks to Polygenelubricants in Stackoverflow
 * https://stackoverflow.com/questions/1794281/java-infinite-loop-using-scanner-in-hasnextint
 */
import java.util.Scanner;

class Question10950 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numOfCase = scanner.nextInt();
        int[] results = new int[numOfCase];

        for(int i=0; i<numOfCase; i++) {

            if(scanner.hasNextInt()) {

                int firstNum = scanner.nextInt();
                int secondNum = scanner.nextInt();
                results[i] = firstNum + secondNum;
            } else {
                scanner.next();
            }
        }

        for(int j=0; j<numOfCase; j++) {

            System.out.println(results[j]);
        }
    }
}
