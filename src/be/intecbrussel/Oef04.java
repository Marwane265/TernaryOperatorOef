package be.intecbrussel;

import java.util.Scanner;

public class Oef04 {
    public static void main(String[] args) {

//        Oefening 4
//        Schrijf een programma dat je testscore gaat bereken of je geslaagd bent of niet.
//        Gebruik hiervoor een ternary operator.
//        int testresultaatInPercentage = 59;
//
//

        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        int number = Integer.parseInt(num);

        String message = number >= 60 ? "Je bent geslaagd" : "Je bent niet geslaagd";
        System.out.println(message);


    }
}
