package homework;

import java.util.Scanner;

public class RecursivePrime {
    static boolean isPrime(int number,int divisor){
        if (divisor * divisor > number||number == 2){
            return true;
        }

        if (number % divisor == 0||number < 2) {
            return false;
        }

        return isPrime(number, divisor +1);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı girin:");
        int number = inp.nextInt();

        if (isPrime(number,2)){
            System.out.println(number+" Asal SAYIDIR!");
        }
        else {
            System.out.println(number+" Asal sayı DEĞİLDİR!");
        }
    }
}
