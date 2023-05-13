package practice;

import java.util.Scanner;

public class TaksiMetre {
    public static void main(String[] args) {
        int km;
        double perKm=2.2,total=10;

        Scanner input=new Scanner(System.in);

        System.out.println("Mesafeyi kilometre cinsinden giriniz: ");
        km=input.nextInt();

        total+=(km*perKm);
        total=(total<20)?20:total;

        System.out.println("Toplam tutar: "+total);
    }
}
