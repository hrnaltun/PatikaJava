package homework;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int counter,number,min=9999,max=-9999;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        counter=inp.nextInt();
        while (counter!=0){
            System.out.print("Sayıyı giriniz:");
            number=inp.nextInt();
            if(number>max){
                max=number;
            }
            if(number<min){
                min=number;
            }
            counter--;
        }
        System.out.println("En büyük sayı: "+max);
        System.out.println("En küçük sayı: "+min);
    }
}
