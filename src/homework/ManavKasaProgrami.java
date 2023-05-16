package homework;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double Armut,Elma,Domates,Muz,Patlican;
        Scanner inp= new Scanner(System.in);
        System.out.print("Kaç kilo Armut aldınız?:");
        Armut=inp.nextDouble();
        System.out.print("Kaç kilo Elma aldınız?:");
        Elma=inp.nextDouble();
        System.out.print("Kaç kilo Domates aldınız?:");
        Domates=inp.nextDouble();
        System.out.print("kaç kilo Muz aldınız?:");
        Muz=inp.nextDouble();
        System.out.print("Kaç kilo Patlıcan aldınız?:");
        Patlican=inp.nextDouble();

        double tutar = (Armut*2.14 + Elma*3.67 + Domates*1.11 + Muz*0.95 + Patlican*5.00);
        System.out.print("Toplam tutar:"+tutar);
    }
}
