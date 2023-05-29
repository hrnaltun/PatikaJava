package homework;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Doğum yılınızı girin: ");
        int dogumYili = inp.nextInt();

        String zodyak = "";

        int kalan = dogumYili % 12;

        if (kalan == 0) {
            zodyak = "Maymun";
        } else if (kalan == 1) {
            zodyak = "Horoz";
        } else if (kalan == 2) {
            zodyak = "Köpek";
        } else if (kalan == 3) {
            zodyak = "Domuz";
        } else if (kalan == 4) {
            zodyak = "Fare";
        } else if (kalan == 5) {
            zodyak = "Öküz";
        } else if (kalan == 6) {
            zodyak = "Kaplan";
        } else if (kalan == 7) {
            zodyak = "Tavşan";
        } else if (kalan == 8) {
            zodyak = "Ejderha";
        } else if (kalan == 9) {
            zodyak = "Yılan";
        } else if (kalan == 10) {
            zodyak = "At";
        } else if (kalan == 11) {
            zodyak = "Koyun";
        } else {
            System.out.println("Geçersiz doğum yılı!");
            return;
        }

        System.out.println("Çin Zodyağı Burcunuz: " + zodyak);
    }
}
