package week3.day3;

public class SBI extends LearnPolymorphism {
    // AXIS Bank Balance is currentBalance is 10000
    // SBI ATM 
     @Override
    public void creditModule(){
    double serviceCharge = 22.45;
    System.out.println("service  charge is : "+serviceCharge+"\nFor using the SBI Banking services"); 
    currentBalance = currentBalance - serviceCharge;
    System.out.println("Current Account balance is "+currentBalance);
    }
    
    public static void main(String[] args) {
        SBI credits = new SBI();
        credits.creditModule();
    }
}
