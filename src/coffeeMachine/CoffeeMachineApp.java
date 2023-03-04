package coffeeMachine;

import java.util.Scanner;

public class CoffeeMachineApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        coffeeTypes();

    }

    public static void coffeeTypes() {

        System.out.println("1-Americano\n2-Cappuccino\n3-Espresso\n4-Latte\n5-Mocha" +
                "\n6-Macchiato\n7-Decaf\nLutfen istediginiz kahvenin kodunu giriniz");

        Scanner scan = new Scanner(System.in);

        int coffeeNum = scan.nextInt();
        double price = 0;
        switch (coffeeNum) {
            case 1, 2, 7:
                price = 1;
                break;
            case 3, 6:
                price = 2;
                break;
            case 4, 5:
                price = 1.5;
                break;
            default:
                System.out.println("Gecersiz kod girisi");

        }
        System.out.println("1.sekerli\n" +
                "2. orta sekerli\n" +
                "3. sekersiz\n" +
                "seker miktari icin kodu giriniz");

        int sekerMiktari = scan.nextInt();

        switch (sekerMiktari) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Gecersiz giris");
        }


        System.out.println("S-Small\nM-Medium\nL-Large" +
                "\nLutfen bardak boyunu secmek icin S,M,L giriniz");

        char size = scan.next().charAt(0);
        double sizePrice = 0;


        switch (size) {
            case 'S':
                sizePrice = price * 1;
                System.out.println("Odenecek Tutar: " + sizePrice + "CHF");
                break;
            case 'M':
                sizePrice = price * 2;
                System.out.println("Odenecek Tutar: " + sizePrice + "CHF");
                break;
            case 'L':
                sizePrice = price * 3;
                System.out.println("Odenecek Tutar: " + sizePrice + "CHF");
                break;
            default:
                System.out.println("Gecersiz giris");
        }

        System.out.println("Lutfen ödemeyi yapiniz");
        double odeme = scan.nextDouble();
        double paraUstu = 0;
        double eksikMiktar = 0;

        if (odeme >= sizePrice) {
            paraUstu = odeme - sizePrice;
            System.out.println("Para ustu: " + paraUstu + " CHF");
        } else {
            eksikMiktar = sizePrice - odeme;

            System.out.println("Yetersiz bakiye " + eksikMiktar + " CHF daha ödemeniz gerekiyor");
        }

    }

}
