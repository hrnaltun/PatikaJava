package practice;

import java.util.Arrays;

public class harmonicAverage {
    public static void main(String[] args) {
        double[] numberList = {2,4,6,8};
        double sum = 0;

        for (double index : numberList) {
            sum += 1 / index;
        }

        System.out.print(Arrays.toString(numberList) + " Dizisinin "+ "Harmonik Ortalaması : " + numberList.length / sum);
    }
}
