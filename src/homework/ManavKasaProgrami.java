package homework;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double pear,apple,tomatoes,banana,eggplant;
        Scanner inp= new Scanner(System.in);
        System.out.print("Kaç kilo Armut aldınız?:");
        pear=inp.nextDouble();
        System.out.print("Kaç kilo Elma aldınız?:");
        apple=inp.nextDouble();
        System.out.print("Kaç kilo Domates aldınız?:");
        tomatoes =inp.nextDouble();
        System.out.print("kaç kilo Muz aldınız?:");
        banana=inp.nextDouble();
        System.out.print("Kaç kilo Patlıcan aldınız?:");
        eggplant=inp.nextDouble();

        double total = (pear*2.14 + apple*3.67 + tomatoes *1.11 + banana*0.95 + eggplant*5.00);
        System.out.print("Toplam tutar:"+total);
    }
}
