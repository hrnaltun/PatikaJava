package homework;

import java.util.Scanner;

public class RecursivePattern {
    static void pattern(int number){
        System.out.print(number+" ");
        if (number<=0){
             return;
        }
        pattern(number-5);
        System.out.print(number +" ");
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int number=inp.nextInt();
        pattern(number);
    }
}
