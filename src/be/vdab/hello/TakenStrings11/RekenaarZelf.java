package be.vdab.hello.TakenStrings11;

import java.util.Scanner;

public class RekenaarZelf {
    public static void main(String[] args) {
        System.out.println("lütfen ilk sayıyı giriniz");
        Scanner scanner = new Scanner(System.in);
        int sayı1 = scanner.nextInt();

        System.out.println("Lütfen ikinci sayıyı giriniz");
        Scanner scanner1 = new Scanner(System.in);
        int sayı2 = scanner1.nextInt();

        System.out.println("yapacagınız islemi secin lütfen:  \n 1 toplama \n 2 cıkarma \n 3 carpma \n 4 bölme");
        Scanner scanner2 = new Scanner(System.in);
        int islem = scanner2.nextInt();
        int sonuc = 0;
        switch (islem) {
            case 1:
                sonuc = sayı1 + sayı2;
                break;
            case 2:
                sonuc = sayı1 - sayı2;
                break;
            case 3:
                sonuc = sayı1 * sayı2;
                break;
            case 4:
                sonuc = sayı1 / sayı2;
                break;
            default:
                System.out.println("Yanlıs bir işlem girdiniz.");

        }
        System.out.println("Result : "+ sonuc);
    }
}
