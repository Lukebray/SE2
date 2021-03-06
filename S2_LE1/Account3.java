package S2_LE1;
//fig 7.5 account2.java
/*
Luke Bray
B00100787
22/10/2018
 */
public class Account3 {

    private String name; //instance variable
    private double balance; //instance variable

    //constructor to receive 2 params
    public Account3(String name, Double balance) { //must declare data type of constructors here
        this.name = name; //assign name to instance variable name

        //validate if the balance is > 0 otherwise keep bal @ 0
        if (balance > 0.0) //if bal valid
            this.balance = balance;
    }

    //method to deposit (add) to bal if valid
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) { //if valid
            balance += depositAmount; //add to bal
        }
    }

    //return balance
    public double getBalance() {
        return balance;
    }

    //method to set name in the object
    public void setName(String name) {
        this.name = name; //store the name
    }

    //method to retrieve name from object
    public String getName() {
        return name; //return value of name to caller
    }

}
