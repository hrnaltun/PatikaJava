package practice;

import java.util.Scanner;

public class AdvancedCalc {
    static void plus(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int counter = inp.nextInt();
        int number, result =0;

        for (int i=1; i<=counter;i++){
            System.out.print(i + ". sayı : ");
            number = inp.nextInt();
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int counter = inp.nextInt();
        int number, result =0;

        for (int i=1; i<=counter; i++){
            System.out.print(i + ". sayı : ");
            number = inp.nextInt();
            if (i == 1){
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void times(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int counter = inp.nextInt();
        int number, result =1;

        for (int i=1;i<= counter;i++){
            System.out.print(i + ". sayı : ");
            number = inp.nextInt();

            result*=number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void divided(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int counter = inp.nextInt();
        int number;
        double result =1;

        for (int i=1;i<=counter;i++){
            System.out.print(i + ". sayı : ");
            number =inp.nextInt();
            if (i != 1 && number == 0){
                System.out.println("Böleni 0 giremesiniz!");
                continue;
            }
            if (i == 1){
                result = number;
                continue;
            } result /= number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void power(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int base =inp.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int exponent =inp.nextInt();
        int result =1;

        for (int i=1; i<=exponent;i++){
            result *= base;
        }
        System.out.println("Sonuç : " + result);
    }

    static void factorial(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int n = inp.nextInt();
        int result =1;

        for (int i=1; i<=n;i++){
            result *= i;
        }
        System.out.println("Sonuç : " + result);

    }

    static void mod(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int num = inp.nextInt();
        System.out.print("Mod Giriniz : ");
        int m = inp.nextInt();

        while (num>=m){
            num %= m;
        }
        System.out.println("Sonuç : " + num);

    }

    static void calc(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Uzun Kenarın Değerini giriniz : ");
        int num1 = inp.nextInt();
        System.out.print(" Kısa Kenarın Değerini giriniz : ");
        int num2 = inp.nextInt();

        System.out.println("Dikdörtgenin Alanı : " + (num1*num2));
        System.out.println("Dikdörtgenin Çevresi : " + (2*(num1+num2)));

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = inp.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    calc();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}
