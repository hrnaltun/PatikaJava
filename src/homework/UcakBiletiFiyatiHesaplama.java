package homework;
import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {

    public static void main(String[] args) {
        double costPerKm = 0.10;
        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafe (KM): ");
        int distance = inp.nextInt();

        System.out.print("Yaşınız: ");
        int age = inp.nextInt();

        System.out.print("Yolculuk Tipi (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int type = inp.nextInt();


        double total = costPerKm  * distance;

        if (distance > 0 && age > 0 ) {
            if (age < 12) {
                total *= 0.5;
            } else if (age <= 24) {
                total *= 0.9;
            } else if (age > 65) {
                total *= 0.7;
            }

            if (type == 2) {
                total *= 1.6;
            }

            System.out.println("Toplam Bilet Fiyati: " + total + " TL");
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}