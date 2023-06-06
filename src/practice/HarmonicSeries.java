package practice;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = inp.nextInt();

        double sum = 0.0;

        for (int i = 1; i <= number; i++) {
            sum += 1.0 / i;
        }

        System.out.println(number + " sayısının harmonik serisi toplamı: " + sum);
    }
}
