package practice;

import java.util.Arrays;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int number= (int) (Math.random()*100);
        Scanner inp=new Scanner(System.in);
        int right=0;
        int[] wrong=new int[5];
        boolean isWin=false;


        for (right=0;right<5;right++){
            System.out.print("Tahmininizi giriniz: ");
            int selected= inp.nextInt();

            if (selected<0||selected>99){
                    System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                    wrong[right]=selected;
                    continue;

            }
            if (selected==number){
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğiniz sayı "+ number);
                break;
            }else {

                System.out.println("Hatalı bir sayı girdiniz !");
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }
                wrong[right] = selected;
                System.out.println("Kalan hakkınız : " + (4 - right));

            }
            if (!isWin){
                System.out.println("Kaybettiniz ! ");
            }
        }
        System.out.println("Gizli numara : " +number);
        System.out.println("Tahminleriniz : "+ Arrays.toString(wrong));
    }
}
