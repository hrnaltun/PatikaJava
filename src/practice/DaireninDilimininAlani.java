package practice;

import java.util.Scanner;

public class DaireninDilimininAlani {
    public static void main(String[] args) {
        int r,aci;
        double pi=3.14,alan;

        Scanner input=new Scanner(System.in);
        System.out.print("Yarı çapı giriniz: ");
        r=input.nextInt();

        System.out.print("Açıyı giriniz: ");
        aci=input.nextInt();

        alan=(pi*(r*r)*aci)/360;
        System.out.println("Dilimin alanı: "+alan);

    }


}
