package coffeeMachine;

import java.util.Scanner;

public class CoffeeMachineApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        coffeeTypes();

    }

    public static void coffeeTypes() {

        System.out.println("1-Americano\n2-Cappuccino\n3-Espresso\n4-Latte\n5-Mocha" +
                "\n6-Macchiato\n7-Decaf\nPlease enter the code of the coffee you want");

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
                System.out.println("Invalid code entry");

        }
        System.out.println("1.Sweet-lot\n" +
                "2. Sweet-medium\n" +
                "3. Sugar-less\n" +
                "Please enter the code for sugar amount");

        int sugarAmount = scan.nextInt();

        switch (sugarAmount) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("invalid code entry");
        }


        System.out.println("S-Small\nM-Medium\nL-Large" +
                "\nPlease enter S,M or L to choose the size");

        char size = scan.next().charAt(0);
        double sizePrice = 0;


        switch (size) {
            case 'S':
                sizePrice = price * 1;
                System.out.println("Small size price: " + sizePrice + "CHF");
                break;
            case 'M':
                sizePrice = price * 2;
                System.out.println("Medium size price: " + sizePrice + "CHF");
                break;
            case 'L':
                sizePrice = price * 3;
                System.out.println("Large size price " + sizePrice + "CHF");
                break;
            default:
                System.out.println("Invalid entry");
        }

        System.out.println("Please pay");
        double payment = scan.nextDouble();
        double change = 0;
        double less = 0;

        if (payment >= sizePrice) {
            change = payment - sizePrice;
            System.out.println("Your change: " + change + " CHF");
        } else {
            less = sizePrice - payment;

            System.out.println("insufficient balance! Please pay " + less + " CHF more");
        }

    }

}
