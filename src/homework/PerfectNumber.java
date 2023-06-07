package homework;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int n,i,counter=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        n = inp.nextInt();

        for(i=1;i<n;i++){
            if (n%i==0){
                counter+=i;
            }
        }
        if(counter==n){
            System.out.println(n+"mükemmel bir sayıdır");
        }else {
            System.out.println(n+"mükemmel bir sayı değildir");
        }
    }
}
