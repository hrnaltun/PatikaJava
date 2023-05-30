package practice;

import java.util.Scanner;

public class findtotal {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Bir sayı girin : ");
            int num = inp.nextInt();

            if (num % 2 == 1) {
                break;
            }

            if ( num % 4 == 0) {
                sum += num;
            }
        }

        System.out.println("Girilen 4'ün katı olan sayıların toplamı: " + sum);
    }
}
