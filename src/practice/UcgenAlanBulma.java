package practice;

import java.util.Scanner;

public class UcgenAlanBulma {
    public static void main(String[] args) {
        double a,b,c,cevre,alan,u;

        Scanner input=new Scanner(System.in);
        System.out.print("İlk kenarı giriniz: ");
        a= input.nextDouble();

        System.out.print("İkinci kenarı giriniz: ");
        b= input.nextDouble();

        System.out.print("Üçüncü kenarı giriniz:");
        c= input.nextDouble();
        cevre=a+b+c;
        u=cevre/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı: "+alan);
    }
}
