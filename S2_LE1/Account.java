package S2_LE1;

/*Account.java
Luke Bray
B00100787
22/10/2018
 */


public class Account {
    private String name; //declaring an instance variable. These are initialised by default

//a method to set the name in the object
    public void setName(String name) {
        this.name = name; //this is referring to the instance variable. It is "shadowed"
    }

//method to retrieve name from object
    public String getName() {
        return name; //return value of name to caller
    }
} //end
