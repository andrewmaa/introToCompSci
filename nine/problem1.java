package nine;
import java.util.Scanner; // import scanner for input

public class problem1 {
    public static void main(String[] args) {

        // create variable for taking input
        Scanner input = new Scanner(System.in);
        
        // initalize 10 accounts with the default balance of 100 and the id being a number from 0-9
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 100);
        }


        // create variable for entering id and choice, and the amount to withdraw/deposit
        int id;
        int choice = 0;
        double amount;

        // infinite loop (will not stop)
        while (true) {
            // asks for account id
            System.out.print("Enter an id: ");
            id = input.nextInt();
            
            // asks for a correct id if the previous input is incorrect
            while (id < 0 || id > 9) {
                System.out.println("Invalid id, try again");
                System.out.println();
                System.out.print("Enter an id: ");
                id = input.nextInt();
            }

            // while the user does not exit the menu
            while (choice != 4) {
                System.out.println();
                System.out.println("Main menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.print("Enter a choice: ");
                choice = input.nextInt();

                // asks for new choice if the prev. choice is invalid
                while (choice < 1 || choice > 4) {
                    System.out.println("Invalid choice, try again");
                    System.out.print("Enter a choice: ");
                    choice = input.nextInt();
                }

                // check balance
                if (choice == 1) {
                    System.out.println("The balance is " + accounts[id].getBalance());
                }

                // withdraw 
                else if (choice == 2) {

                    // asks for amount to withdraw and takes input
                    System.out.print("Enter amount to withdraw: ");
                    amount = input.nextDouble();

                    // if the amount to withdraw is greater than the account balance or less than/equal to 0, ask for new amount to withdraw
                    while (amount <= 0 || amount > accounts[id].getBalance()) {
                        System.out.println("Invalid amount, try again");
                        System.out.print("Enter amount to withdraw: ");
                        amount = input.nextDouble();
                    }

                    accounts[id].withdraw(amount);
                }

                // deposit
                else if (choice == 3) {
                    System.out.print("Enter amount to deposit: ");
                    amount = input.nextDouble();

                    // if the amount to withdraw is less than/equal to 0, ask for new amount to deposit
                    while (amount <= 0) {
                        System.out.println("Invalid amount, try again");
                        System.out.print("Enter amount to withdraw: ");
                        amount = input.nextDouble();
                    }

                    accounts[id].deposit(amount);
                }
            }

            // reset choice
            choice = 0;
            System.out.println();
        }
    }
}
