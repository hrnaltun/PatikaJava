package practice;

import java.util.Arrays;
import java.util.Scanner;

public class FindNearestNumber {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        Scanner inp= new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int number =inp.nextInt();

        int min = list[0];
        int max = list[0];
        Arrays.sort(list);
        for(int item: list){
            if(item > number){
                max = item;
                break;
            }}
        for (int i= list.length-1;i>=0;--i){
            if(list[i] < number){
                min = list[i];
                break;
            }
        }
        System.out.println(Arrays.toString(list));
        System.out.println("En yakın küçük : " + min);
        System.out.println("En yakın büyük : " + max);
    }
}
