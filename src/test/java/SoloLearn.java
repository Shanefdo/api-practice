import java.util.Scanner;

public class SoloLearn {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //int amount = scanner.nextInt();
        int amount = 100000;

//        int finalAmount1 = amount - ((amount * 10) / 100);
//        int finalAmount2 = finalAmount1 - ((finalAmount1 * 10) / 100);
//        int finalAmount3 = finalAmount2 - ((finalAmount2 * 10) / 100);
//
//        System.out.println(finalAmount3);

//        int finalAmount = amount;
//        for (int i = 0; i < 3; i++) {
//            finalAmount -= (finalAmount * 10) / 100;
//        }
//        System.out.println(finalAmount);


        for (int x = 1; x <= 3; x++) {
            //amount -= (amount * 10) / 100;
            amount = amount - (amount * 10) / 100;

        }
            System.out.println(amount);


    }
}
