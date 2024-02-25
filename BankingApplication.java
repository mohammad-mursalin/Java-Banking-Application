import java.util.Scanner;

public class BankingApplication {

    int balance;
    int previousTransaction;
    String customerName;
    int customerId;

    BankingApplication ( String customerName , int customerId ) {

        this.customerName = customerName;
        this.customerId = customerId;
    }

    void deposite(int amount) {

        if(amount != 0) {
            
            balance = balance + amount;
            previousTransaction = amount;
        }

    }

    void withdraw (int amount) {

        balance = balance - amount;
        previousTransaction = -amount;
    }

    void getPreviousTransaction() {

        if(previousTransaction > 0) {

            System.out.println("Your last transaction was : " +previousTransaction);
        }
        else if (previousTransaction < 0 ) {

            System.out.println("Your last transaction was : " +previousTransaction);
        }
        else {

            System.out.println("No transaction occured!");
        }
    }

    void showMenu () {

        int option;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("Welcome " +customerName);
        System.out.println("Your ID is " +customerId);
        System.out.println("\n");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposite");
        System.out.println("3. Withdraw");
        System.out.println("4. Previous Transaction");
        System.out.println("5. Exit");

        do {
            System.out.println("================================");
            System.out.print("Enter an option : ");
            option = scanner.nextInt();
            System.out.println("================================");
            System.out.println("\n");

            switch(option) {

                case 1 :
                    System.out.println("--------------------------------------------");
                    System.out.println("Your current balance is : " +balance);
                    System.out.println("--------------------------------------------");
                    System.out.println("\n");
                    break;

                case 2 :
                    System.out.println("--------------------------------------------");
                    System.out.print("Enter an amount to deposite : ");
                    int depositeAmount = scanner.nextInt();
                    deposite(depositeAmount);
                    System.out.println("--------------------------------------------");
                    System.out.println("\n");
                    break;

                case 3 :
                    System.out.println("--------------------------------------------");
                    System.out.print("Enter an amount to withdraw : ");
                    int withdrawAmount = scanner.nextInt();
                    withdraw(withdrawAmount);
                    System.out.println("--------------------------------------------");
                    System.out.println("\n");
                    break;

                case 4 :
                    System.out.println("--------------------------------------------");
                    getPreviousTransaction();
                    System.out.println("--------------------------------------------");
                    System.out.println("\n");
                    break;

                case 5 :
                    System.out.println("--------------------------------------------");
                    break;

                default :
                    System.out.println("Invalid option!!. Please try again");
                    break;
            }
        } while (option != 5);

        System.out.println("Thanks for using our services");

        scanner.close();
    }

}