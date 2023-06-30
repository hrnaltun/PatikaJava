package homework;

import java.util.Arrays;
import java.util.Scanner;

public class SortingInArrays {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz: ");
        int length=inp.nextInt();
        int[] array=new int[length];

        for (int i=0;i<length;i++){
            System.out.print((i+1) + ". Eleman: ");
            array[i]=inp.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
