package S2_LE1;
//7.6 AccountTest2.java

import java.util.Scanner;

public class AccountTest3 {
    public static void main(String[] args) {

        //create account objects
        Account3 account1 = new Account3("Jane Green", 50.00);
        Account3 account2 = new Account3("John Blue", -7.53);

        //display initial name value for each account
        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());

        //create scanner to obtain input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter deposit amount for account1: "); //prompt
        double depositAmount = input.nextDouble(); //get user input
        System.out.printf("%n adding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); //add to bal

        //display bals
        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());

        System.out.println("Enter deposit amount for account2: "); //prompt
        depositAmount = input.nextDouble(); //get user input
        System.out.printf("%n adding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); //add to bal

        //display bals
        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());

    }
}
