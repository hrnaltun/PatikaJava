package practice;

import java.util.Scanner;

public class ExpCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Tabanı girin: ");
        int base = inp.nextInt();

        System.out.print("Üssü girin: ");
        int exp = inp.nextInt();

        int result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        System.out.println(base+ " üzeri " + exp + " sonucu: " + result);
    }
}
