package practice;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elmasın boyutunu girin: ");
        int size = scanner.nextInt();

        for (int row = 1; row <= size; row++) {
            for (int space = 1; space <= size - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int row = size - 1; row >= 1; row--) {
            for (int space = 1; space <= size - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
