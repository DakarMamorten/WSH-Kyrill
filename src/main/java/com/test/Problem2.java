package com.test;

public class Problem2 {
    public static void main(String[] args) {
        int start = 10;
        int end = 20;
        int base = start + (int) (Math.random() * end);
        System.out.println("base = " + base);
        int height = start + (int) (Math.random() * end);
        System.out.println("height = " + height);
        int a = start + (int) (Math.random() * end);
        System.out.println("a = " + a);

        int area = base * height;
        System.out.println("Area of the parallelogram = " + area);
        int perimeter = 2 * (a + base);
        System.out.println("perimeter of the parallelogram = " + perimeter);


    }
}
