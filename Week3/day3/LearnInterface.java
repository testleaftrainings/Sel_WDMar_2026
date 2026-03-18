package week3.day3;
/*
Important Business Usecase should only be displayed here :
1) methods inside the interface cannot have the body
2) Cannot create object within the  Interface
3) if we can variable inside the interface , static final --> implicitly this java keywords will be called here
 */

public interface LearnInterface {
//double currentBalance = 10000.00; // static final --> implicitly this java keywords will be called here
// we cannot re initialize the variable declared inside the interface
public void creditModule();// unimplemented method--> a method without a body
public void creditModule(int creditedAmount);// unimplemented method--> a method without a body

// public static void main(String[] args) {
//     LearnInterface li = new LearnInterface(); //Cannot instantiate the type LearnInterface
// }

}
