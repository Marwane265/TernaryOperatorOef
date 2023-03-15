package be.intecbrussel;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {


//        BONUS schrijf een application dat gaat controleren of jou huisdier een hond, kat of iets anders is.
//        Gebruik hiervoor de volgende variabelen.
//        Gebruik hiervoor een ternary operator.
//        boolean isDog = true;
//        boolean isCat = false;

        //output
//        This pet is a dog.


        int isDog = 1;
        int isCat = 2;

        System.out.println("Typ in 1 of 2 of 3");
        Scanner scanner = new Scanner(System.in);
        String dier = scanner.nextLine();

        int number = Integer.parseInt(dier);

        String message = number == 1 ? "This is a dog" : (number == 2 ? "This is a cat" : "Other");

        System.out.println(message);


        //--------------------------------------------------------------------

//        System.out.println("Typ in:1, 2 of 3");
//        Scanner scanner = new Scanner(System.in);
//        String number = scanner.nextLine();
//
//
//        int num = Integer.parseInt(number);
//
//
//        switch (num) {
//
//            case 1:
//                System.out.println("This is a dog");
//                break;
//            case 2:
//                System.out.println("This is a cat");
//                break;
//            default:
//                System.out.println("This is an other animal");
//        }

        // nested ternqry operqtor

    }
}
