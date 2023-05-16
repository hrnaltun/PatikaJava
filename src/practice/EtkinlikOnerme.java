package practice;

import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        int heat;
        Scanner input=new Scanner(System.in);
        System.out.println("Sıcaklığı giriniz: ");
        heat=input.nextInt();
        if (heat>25){
            System.out.println("Yüzmeye gidebilirsiniz.");
        }else if(heat>5){
            if (heat<=15){
                System.out.println("Sinemaya gidebilirsiniz.");
                if (heat>=10){
                    System.out.println("Pikniğe gidebilirisiniz.");
                }
            }
        }else{
            System.out.println("Kayak yapabilirsiniz.");

        }

    }
}
