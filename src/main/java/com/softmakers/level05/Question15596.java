package com.softmakers.level05;

public class Question15596 {

    public static void main(String[] args) {

        int[] a = {1, 2, 4};
        Test test = new Test();
        System.out.println(test.sum(a));
    }
}

class Test {

    public static long sum(int[] a) {

        long result = 0;
        for(int i=0; i<a.length; i++) {
            result += a[i];
        }

        return result;
    }
}

