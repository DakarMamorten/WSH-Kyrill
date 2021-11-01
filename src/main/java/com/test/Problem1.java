package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1 {
    public static void main(String[] args) throws IOException {

        System.out.print("Input amount(example 58.45): ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        double money = Double.parseDouble(line);

        int zloty100 = (int) money / 100;
        int zloty50 = (int) money % 100 / 50;
        int zloty20 = (int) money % 100 % 50 / 20;
        int zloty10 = (int) money % 100 % 50 % 20 / 10;
        int zloty5 = (int) money % 100 % 50 % 20 % 10 / 5;
        int zloty1 = (int) money % 100 % 50 % 20 % 10 % 5;
        int grosz25 = (int) (money % 100 % 50 % 20 % 10 % 5 % 1 / 0.25);
        int grosz10 = (int) (money % 100 % 50 % 20 % 10 % 5 % 1 % 0.25 / 0.10);
        int grosz5 = (int) (money % 100 % 50 % 20 % 10 % 5 % 1 % 0.25 % 0.10 / .05);
        int grosz2 = (int) (money % 100 % 50 % 20 % 10 % 5 % 1 % 0.25 % 0.10 % .05 / .02);
        int grosz1 = (int) (money % 100 % 50 % 20 % 10 % 5 % 1 % 0.25 % 0.10 % .05 % .02 / .01);

        System.out.println("100 zloty bills - " + zloty100);
        System.out.println("50 zloty bills - " + zloty50);
        System.out.println("20 zloty bills - " + zloty20);
        System.out.println("10 zloty bills - " + zloty10);
        System.out.println("5 zloty bills - " + zloty5);
        System.out.println("1 zloty bills - " + zloty1);
        System.out.println("25grosz - " + grosz25);
        System.out.println("10grosz - " + grosz10);
        System.out.println("5grosz - " + grosz5);
        System.out.println("2 grosz - " + grosz2);
        System.out.println("1 grosz - " + grosz1);

    }
}
