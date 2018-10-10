package S2_LE1;
//fig 7.5 account2.java
public class Account2 {

    private String name; //instance variable

    //constructor initialises name with same param
    public Account2(String name) { //constructor name same as class name
        this.name = name;
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
