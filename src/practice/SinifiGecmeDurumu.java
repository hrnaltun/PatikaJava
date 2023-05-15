package practice;

import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,muzik;
        Scanner input=new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat=input.nextInt();
        if (mat>100&&mat<0){
            mat=0;
        }

        System.out.print("Fizik Notunuz : ");
        fizik=input.nextInt();
        if (fizik>100&&fizik<0){
            fizik=0;
        }

        System.out.print("Kimya Notunuz : ");
        kimya=input.nextInt();
        if (kimya>100&&kimya<0){
            kimya=0;
        }

        System.out.print("Türkçe Notunuz : ");
        turkce=input.nextInt();
        if (turkce>100&&turkce<0){
            turkce=0;
        }

        System.out.print("Müzik Notunuz : ");
        muzik=input.nextInt();
        if (muzik>100&&muzik<0){
            muzik=0;
        }

        double ortalama=(mat+fizik+kimya+turkce+muzik)/5;

        if (ortalama>=55){
            System.out.println("Sınıfı geçtiniz. Ortalamanız: "+ortalama);
        }else{
            System.out.println("Sınıfta kaldınız. Ortalamanız "+ortalama);
        }

    }
}
