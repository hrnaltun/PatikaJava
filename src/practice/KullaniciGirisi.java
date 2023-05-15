package practice;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName,password,answer,newPassword;

        Scanner input=new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: " );
        userName=input.nextLine();

        System.out.print("Şifreniz: ");
        password=input.nextLine();

        if (userName.equals("patika")&&password.equals("java123")){
            System.out.print("Giriş Yaptınız!");

        }else if (userName.equals("patika")&&!(password.equals("java123"))){
            System.out.print("Şifre yanlış! Sıfırlamak ister misiniz? (Evet ve ya Hayır) ");
            answer=input.nextLine();

            if (answer.equals("Evet")||answer.equals("evet")){
                System.out.print("Önceden kullanmadığınız yeni şifre girin: ");
                newPassword =input.nextLine();

                if (newPassword.equals("java123")){
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");

                }else {
                    System.out.println("Şifre oluşturuldu");
                }
            }else {
                System.out.println("Şifre oluşturmadınız.");
            }
        }else {
            System.out.println("Bilgiler Yanlış");
        }
    }
}
