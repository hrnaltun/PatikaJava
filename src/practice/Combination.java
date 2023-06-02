package practice;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("n değerini girin: ");
        int n = inp.nextInt();
        System.out.print("r değerini girin: ");
        int r = inp.nextInt();

        int factN = 1;
        int factR = 1;
        int factNR = 1;

        for (int i = 1; i <= n; i++) {
            factN *= i;
        }

        for (int i = 1; i <= r; i++) {
            factR *= i;
        }

        for (int i = 1; i <= (n - r); i++) {
            factNR *= i;
        }

        int combination = factN / (factR * factNR);
        System.out.println("C(" + n + ", " + r + ") = " + combination);
    }
}
