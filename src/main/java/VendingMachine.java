import java.util.Scanner;

public class VendingMachine {

    public static void main(String []args){

        int COKE = 15;
        int MINERALWATER = 8;
        int LAYS = 12;
        int SNICKER = 25;

        int ONE,TWO,FIVE,TEN;

        int choice;
        int amountPaid = 0;
        int balance = 0;



        System.out.println("VENDING MACHINE");
        System.out.println("----------------");
        System.out.println("COKE AT RUPEES 15 . Press 1");
        System.out.println("MINERAL WATER AT RUPEES 8 Press 2");
        System.out.println("LAYS AT RUPESS 12 Press 3");
        System.out.println("SNICKER AT RUPEES 25 Press 4");



        System.out.println("Please enter your selection.");
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();

        System.out.println("Enter amount in 1   2   5   10 rupee coin");

        amountPaid = input.nextInt();

        switch(choice){

            case 1 :

                System.out.println("You selected " + "COKE AND PAID " + amountPaid);

                balance = amountPaid - COKE ;

                int balanceAmt = balance;

                System.out.println("Balance amount is " + balance);

                if(balanceAmt > 0) {

                    System.out.println("Returned as in");

                    TEN = balanceAmt / 10;
                    balanceAmt = balanceAmt % 10;


                    FIVE = balanceAmt / 5;
                    balanceAmt = balanceAmt % 5;


                    TWO = balanceAmt / 2;
                    balanceAmt = balanceAmt % 2;


                    ONE = balanceAmt / 1;
                    balanceAmt = balanceAmt % 1;

                    if (TEN == 1) {

                        TEN = TEN - 1;
                        FIVE = FIVE + 2;
                    }

                    if (FIVE == 1) {

                        FIVE = FIVE - 1;
                        TWO = TWO + 2;
                        ONE = ONE + 1;
                    }


                    if (TWO == 2) {
                        TWO = TWO - 1;

                        ONE = ONE + 2;
                    }


                    System.out.println("One Rupess " + ONE + "\n" + "Two rupees" + TWO + "\n" + "Five rupees" + FIVE + "\n" + "Ten rupees" + TEN + "\n");

                }
break;



                default:
                {
                    System.out.println("Please neter your choice between 1 to 4. Thank you!");
                }





        }

    }
}
