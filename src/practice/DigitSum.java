package practice;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = inp.nextInt();

        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Basamakların toplamı: " + sum);
    }
}
