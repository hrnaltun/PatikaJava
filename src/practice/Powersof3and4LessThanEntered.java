package practice;

import java.util.Scanner;

public class Powersof3and4LessThanEntered {
    public static void main(String[] args) {
        int number,i;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = inp.nextInt();
        System.out.println("Girilen sayıya kadar olan 4'ün kuvvetleri:");
        for(i=1; i<=number; i*=4){
            System.out.print(i+",");
        }
        System.out.println();
        System.out.println("Girilen sayıya kadar olan 5'in kuvvetleri:");

        for(i=1; i<=number; i*=5){
            System.out.print(i+",");
        }
    }
}
