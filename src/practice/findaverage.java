package practice;

import java.util.Scanner;

public class findaverage {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int n = inp.nextInt();

        int count = 0;
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            if (i!=0 && i % 3 == 0 && i % 4 == 0) {
                count++;
                sum += i;
            }
        }

        if (count == 0) {
            System.out.println("Girilen aralıkta 3 ve 4'e tam bölünen bir sayı yok.");
        } else {
            double average =  sum / count;
            System.out.println("Ortalama: " + average);
        }
    }
}
