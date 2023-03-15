package be.intecbrussel;

import java.util.Scanner;

public class Oef03 {
    public static void main(String[] args) {
//        Oefening 3
//        Schrijf een programma dat test of een nummer even of oneven is.

        System.out.println("Typ een getal is en ik laat je weten of het een even of oneven getal is");


        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        // Verandert een String naar int.
        int number = Integer.parseInt(num);

        String message = number % 2 == 0 ? "Dit is een even nummer" : "Dit is een oneven nummer";
        System.out.println(message);


    }
}
