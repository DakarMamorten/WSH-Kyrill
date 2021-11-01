package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1Super {
    public static void main(String[] args) throws IOException {

        System.out.print("Input amount(example 58.45): ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        printCoins(line);

    }

    private static void printCoins(String line) {
        String[] split = line.split("\\.");

        int[] bills = {500, 200, 100, 50, 20, 10, 5, 1};
        int[] coins = {50, 25, 10, 5, 2, 1};

        int bill = Integer.parseInt(split[0]);
        int coin = Integer.parseInt(split[1]);
        System.out.println("Bill: " + bill + " Coin: " + coin);

        int[] billResult = calculateMoney(bills, bill);
        printMoney(bills, billResult, "zloty");
        System.out.println("---------------------");
        int[] coinResult = calculateMoney(coins, coin);
        printMoney(coins, coinResult, "grosz");

    }

    private static int[] calculateMoney(int[] nominal, int amount) {
        int[] result = new int[nominal.length];
        for (int i = 0; i < nominal.length; i++) {
            result[i] = amount / nominal[i];
            amount %= nominal[i];
        }
        return result;
    }

    private static void printMoney(int[] bills, int[] billsCount, String type) {
        for (int i = 0; i < billsCount.length; i++) {
            System.out.println(bills[i] + " " + type + " - " + billsCount[i]);
        }
    }
}
