package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account = null;
        double value;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit? (y/n)? ");
        char response = sc.next().charAt(0);


        switch(response) {
            case 'n':
                account = new Account(accountNumber, holder);
                break;

            case 'y':
                System.out.print("Enter a initial deposit value: ");
                value = sc.nextDouble();
                account = new Account(accountNumber, holder, value);
                break;

            default:
                System.out.println("This is not a valid option");
                System.exit(0);

        }
        System.out.println("\nAccount data: \n" + account);

        System.out.print("\nEnter a deposit value: ");
        value = sc.nextDouble();
        account.deposit(value);
        System.out.println("\nUpdated account data: \n" + account);

        System.out.print("\nEnter a withdraw value: ");
        value = sc.nextDouble();
        account.withdraw(value);
        System.out.println("\nUpdated account data: \n" + account);

    }
}
