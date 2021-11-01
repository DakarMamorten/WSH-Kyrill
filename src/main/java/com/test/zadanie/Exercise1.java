package com.test.zadanie;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        int previous = 0;
        int next = 0;
        int fibonacci;

        Scanner scanner = new Scanner(System.in);
        int scannerInt = scanner.nextInt();
        System.out.println(previous);
        next++;
        for (int i=1; i <= scannerInt; i++) {
            fibonacci = previous + next;
            System.out.println(fibonacci);
            previous = next;
            next = fibonacci;
        }


        System.out.println();
    }

}
