package homework;

import java.util.Scanner;

public class RecursivePow {
    static int pow(int a, int b) {
        if(b==0) {
            return 1;
        }
        else {
            return a * pow(a,b-1);
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        boolean check=true;

        while (check) {
            System.out.print("Taban Değeri:");
            int base = inp.nextInt();
            System.out.print("Üs:");
            int exponent = inp.nextInt();
            System.out.println("SONUÇ => " + pow(base, exponent));

            System.out.print("Daha fazla işlem yapacak mısınız?(Evet/Hayır): ");
            String next = inp.next();

            if(next.equalsIgnoreCase("Hayır")){
                check=false;
            }
        }
    }
}
