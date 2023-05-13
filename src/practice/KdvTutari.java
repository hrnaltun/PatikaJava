package practice;

import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {
        double kdvli,kdvsiz,kdvtutari,kdvorani;
        Scanner input=new Scanner(System.in);
        System.out.print("Ürünün fiyatını girin:");
        kdvsiz= input.nextDouble();

        kdvorani=(kdvsiz>1000)? 0.08:0.18;

        kdvtutari=kdvsiz*kdvorani;
        kdvli=kdvsiz+kdvsiz*kdvorani;

        System.out.println("Kdv'siz "+kdvsiz);
        System.out.println("Kdv'li " +kdvli);
        System.out.println("Kdv tutarı "+kdvtutari);


    }
}
