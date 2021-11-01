package com.test;

public class Problem3 {
    public static void main(String[] args) {
        a();
        System.out.println();
        b();
        System.out.println();
        c();
        System.out.println();
        d();
    }

    private static void a() {
        for (int i = 10; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void b() {
        int spaces = 9;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j < spaces) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            spaces--;
            System.out.println();
        }
    }

    private static void c() {
        int spaces = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j < spaces) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            spaces++;
            System.out.println();
        }
    }

    private static void d() {
        int lines = 15;

        if (lines % 2 != 0) {
            lines = lines / 2 * 2;
        }
        int halfNumber = lines / 2;
        for (int i = 1; i < lines; i++) {
            if (i < halfNumber) {
                for (int j = 0; j < lines; j++) {
                    if (j < halfNumber + i && j > halfNumber - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                for (int j = lines; j > 0; j--) {
                    int t = lines - i - 1;
                    if (j < halfNumber + t && j > halfNumber - t) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
