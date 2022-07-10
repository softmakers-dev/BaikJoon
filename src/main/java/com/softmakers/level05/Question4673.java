package com.softmakers.level05;

public class Question4673 {

    public static void main(String[] args) {

        showSelfNumbers();
    }

    public static void showSelfNumbers() {

        for(int i=1; i<=10000; i++) {

            for(int j=1; j<=i; j++) {

                if (j == i) {

                    System.out.println(j);
                } else {

                    if (calculate(j) == i) {
                        break;
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public static int calculate(int num) {

        return (num +
                (int)(num / 1000) +
                (int)((num % 1000) / 100) +
                (int)(((num % 1000) % 100) / 10) +
                ((((num % 1000) % 100) % 10) / 1)
        );
    }
}
//
//class Test4673 {
//
//    public static void showSelfNumbers() {
//
//        for(int i=1; i<=10000; i++) {
//
//            for(int j=1; j<=i; j++) {
//
//                if (j == i) {
//
//                    System.out.println(j);
//                } else {
//
//                    if (calculate(j) == i) {
//                        break;
//                    } else {
//                        continue;
//                    }
//                }
//            }
//        }
//    }
//
//    public static int calculate(int num) {
//
//        return (num +
//                (int)(num / 1000) +
//                (int)((num % 1000) / 100) +
//                (int)(((num % 1000) % 100) / 10) +
//                ((((num % 1000) % 100) % 10) / 1)
//        );
//    }
//}
