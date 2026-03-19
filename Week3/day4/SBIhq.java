package week3.day4;
/*
abstract class can partially act as interface and Implementation class
 */
public abstract class SBIhq implements RBI{

    public void headOfficeLocation(){ // body
        System.out.println("SBI Head office located in Mumbai");
    }
    abstract void loanApproval();// no body method // unimplemented method
    // public static void main(String[] args) {
    //     SBIhq hq = new SBIhq(); //SBIhq is abstract; cannot be instantiated
    // }
}
