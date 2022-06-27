package com.softmakers.level02;

import java.util.Scanner;

class CompareInts {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();

        if(firstNum > secondNum) {
            System.out.print(">");
        } else if(firstNum < secondNum) {
            System.out.print("<");
        } else if(firstNum == secondNum) {
            System.out.print("==");
        }
    }
}
