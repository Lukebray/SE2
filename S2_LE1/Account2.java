package S2_LE1;
//fig 7.5 account2.java
/*
Luke Bray
B00100787
22/10/2018
 */
public class Account2 {

    private String name; //instance variable

    //constructor initialises name with same param
    public Account2(String name) { //constructor name same as class name
        this.name = name; //this is referring to the instance variable. It is "shadowed"
    }

    //method to set name in the object
    public void setName(String name) {
        this.name = name; //store the name in local variable
    }

    //method to retrieve name from object
    public String getName() {
        return name; //return value of name to caller
    }

}
