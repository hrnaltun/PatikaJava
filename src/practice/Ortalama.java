package practice;

import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner input=new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat=input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik=input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya=input.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce=input.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih=input.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik=input.nextInt();
        double sonuc =  (mat+fizik+kimya+turkce+tarih+muzik)/6.0;
        String str=(sonuc>60) ? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(str);
    }
}
