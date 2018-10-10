package S2_LE1;
//7.2 AccountTest.java
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        //create scanner object to obtain info from command window
        Scanner input = new Scanner(System.in);

        //create account object and assign to myAccount
        Account myAccount = new Account();

        //display initial name value (should be null)
        System.out.printf("Initial value of name is: %s%n%n", myAccount.getName());

        //prompt for and get name
        System.out.println("Please enter the name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println(); //output blank line

        //display name stored in account object
        System.out.printf("Name in account object is: %n%s%n", myAccount.getName());
    }
}
