package S2_LE1;
//7.6 AccountTest2.java

public class AccountTest2 {
    public static void main(String[] args) { //declaring main method

        //create account objects
        Account2 account1 = new Account2("Jane Green"); //creating accounts with name constructor
        Account2 account2 = new Account2("John Blue");

        //display initial name value for each account
        System.out.printf("Initial value of account1: %s%n%n", account1.getName());
        System.out.printf("Initial value of account2: %s%n%n", account2.getName());
    }
}
