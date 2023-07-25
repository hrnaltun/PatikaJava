package homework;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number, number1=0, number2=1;
        System.out.print("Sayı giriniz: ");
        number = inp.nextInt();
        System.out.print(number + " Elemanlı Fibonacci Serisi: ");
        for (int i=1; i<=number; i++){
            System.out.print(number1 + " ");
            int total=number1+number2;
            number1=number2;
            number2=total;
        }
    }
}
