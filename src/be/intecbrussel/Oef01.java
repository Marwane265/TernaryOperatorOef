package be.intecbrussel;

import java.util.Scanner;

public class Oef01 {
    public static void main(String[] args) {

//        Oefening 1
//        Schrijf een programma dat een cijfer omzet naar het woord.
//        Bijvoorbeeld:
//        Gebruik hiervoor een switch statement.input = 1 output = "One"
        System.out.println("Hallo, typ een getal in tussen 1 en 10 aub☻");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();


        int num = Integer.parseInt(number);


        switch (num) {

            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
            default:
                System.out.println("Not a valid number!");

        }


    }
}
