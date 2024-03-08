import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int sayi = input.nextInt();
        System.out.println("N : "+ sayi);

        double sonuc = 0.0;
        for (double i = 1 ; i <= sayi; i++){
            sonuc += 1/i;

        }
        System.out.println("N sayısının harmonik formülde karşılığı : " + sonuc);
    }}