package homework;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.print("1 100 arası asal sayılar: ");
        for (int i=2;i<=100;i++){
            boolean isPrime=true;
            for (int j=2;j<=100;j++){
                if (i%j == 0 && j!=i){
                     isPrime=false;
                }
            }
            if (isPrime){
                System.out.print(i+",");
            }
        }
    }
}
