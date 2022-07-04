package com.softmakers.level04;

import java.util.Scanner;

public class Question2577 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] inputs = new int[3];

        for(int i=0; i<3; i++) {

            if(scanner.hasNextInt()) {
                inputs[i] = scanner.nextInt();
            } else {
                scanner.next();
            }
        }

        int mulVal = inputs[0] * inputs[1] * inputs[2];
        String sMulVal = Integer.toString(mulVal);
        int[] results = new int[10];

        for(int j=0; j<sMulVal.length(); j++) {

            switch (sMulVal.substring(j, j+1)) {
                case "0": results[0] += 1; break;
                case "1": results[1] += 1; break;
                case "2": results[2] += 1; break;
                case "3": results[3] += 1; break;
                case "4": results[4] += 1; break;
                case "5": results[5] += 1; break;
                case "6": results[6] += 1; break;
                case "7": results[7] += 1; break;
                case "8": results[8] += 1; break;
                case "9": results[9] += 1; break;
                default: return;
            }
        }

        for(int k=0; k<10; k++) {
            System.out.println(results[k]);
        }

    }
}
