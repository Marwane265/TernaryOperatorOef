package be.intecbrussel;

public class Oef02 {
    public static void main(String[] args) {

//        Oefening 2
//        Zet deze if else om naar een switch statement.
//        double totalAmount = 100.0;
//        double discount = 0.0;
//

//        double totalAmount = 100.0;
//        double discount = 0.0;
//        if (totalAmount >= 100.0) {
//            discount = totalAmount * 0.1;
//        } else if (totalAmount >= 50.0) {
//            discount = totalAmount * 0.05;
//        } else if (totalAmount >= 25.0) {
//            discount = totalAmount * 0.02;
//        } else {
//            discount = 0.0;
//        }
//        System.out.println("Discount: " + discount);



        double totalAmount = 100.0;
        double discount = 0.0;

        switch ((int) totalAmount) {
            case 1:

                discount = totalAmount * 0.1;
                break;
            case 2:
                discount = totalAmount * 0.05;
                break;
            case 3:
                discount = totalAmount * 0.02;
                break;
            default:
                System.out.println("Discount: " + discount);

        }


    }
}
