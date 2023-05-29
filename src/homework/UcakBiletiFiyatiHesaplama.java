package homework;
import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {

    public static void main(String[] args) {
        double birimFiyat = 0.10;
        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafe (KM): ");
        int mesafe = inp.nextInt();

        System.out.print("Yaşınız: ");
        int yas = inp.nextInt();

        System.out.print("Yolculuk Tipi (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = inp.nextInt();


        double toplamFiyat = birimFiyat * mesafe;

        if (mesafe > 0 && yas > 0 ) {
            if (yas < 12) {
                toplamFiyat *= 0.5;
            } else if (yas <= 24) {
                toplamFiyat *= 0.9;
            } else if (yas > 65) {
                toplamFiyat *= 0.7;
            }

            if (yolculukTipi == 2) {
                toplamFiyat *= 1.6;
            }

            System.out.println("Toplam Bilet Fiyati: " + toplamFiyat + " TL");
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}