package practice;

import java.util.Scanner;

public class PalindromeNumbers {
    static boolean isPalindrome(int number){
        int temp=number,reverseNumber=0,lastNumber;
        while (temp!=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp=temp/10;
        }
        if (reverseNumber==number){
            return true;
        }else {
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int n=inp.nextInt();
        System.out.println(isPalindrome(n));

    }
}
