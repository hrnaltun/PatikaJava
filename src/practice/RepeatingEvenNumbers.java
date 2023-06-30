package practice;

import java.util.Arrays;

public class RepeatingEvenNumbers {
    static boolean isFind(int[]arr,int value){
        for (int i:arr){
            if (i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {12,5,4,8,6,4,7,9,2,12,6,7,4,8,10,2};
        int[] tempList = new int[list.length];

        int index = 0;

        for (int i = 0 ; i < list.length; i++) {
            for (int j = 0; j < list.length; j++){
                if (i != j && list[i] % 2 == 0 && list[i] == list[j]){
                    if (!isFind(tempList,list[i])){
                        tempList[index++] = list[i];
                    }
                    break;
                }
            }
        }

        System.out.print(Arrays.toString(tempList));
    }
}
