package homework;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Doğum yılınızı girin: ");
        int year = inp.nextInt();

        String zodiac = "";

        int remaining = year % 12;

        if (remaining == 0) {
            zodiac = "Maymun";
        } else if (remaining == 1) {
            zodiac = "Horoz";
        } else if (remaining == 2) {
            zodiac = "Köpek";
        } else if (remaining == 3) {
            zodiac = "Domuz";
        } else if (remaining == 4) {
            zodiac = "Fare";
        } else if (remaining == 5) {
            zodiac = "Öküz";
        } else if (remaining == 6) {
            zodiac = "Kaplan";
        } else if (remaining == 7) {
            zodiac = "Tavşan";
        } else if (remaining == 8) {
            zodiac = "Ejderha";
        } else if (remaining == 9) {
            zodiac = "Yılan";
        } else if (remaining == 10) {
            zodiac = "At";
        } else if (remaining == 11) {
            zodiac = "Koyun";
        } else {
            System.out.println("Geçersiz doğum yılı!");
            return;
        }

        System.out.println("Çin Zodyağı Burcunuz: " + zodiac);
    }
}
