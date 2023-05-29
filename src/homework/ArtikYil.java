package homework;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Yılı girin: ");
        int yil = inp.nextInt();


        if(  (yil % 400 == 0) && (yil % 100==0)) {
            System.out.println("Bu yıl artık yıldır");
        }
        else if(yil%100!=0 && yil%4==0 ) {
            System.out.println("Bu yıl artık yıldır");
        }
        else {
            System.out.println("Bu yıl artık yıl değildir!");
        }
    }
}
