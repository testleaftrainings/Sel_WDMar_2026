package week3.day3;
/*
Axis Bank :
core banking architecture: Credit module
newBalance = previous balance + Transfered Credits
 */
public class LearnPolymorphism {

    double currentBalance = 10000.00;
    
    //creditModule
    public void creditModule(){
    System.out.println("Current Account balance is "+currentBalance);
    }
    //CDM
    public void creditModule(int creditedAmount){
    System.out.println("Credit amount is : "+creditedAmount+"\nMode of Transction CDM");    
    currentBalance = currentBalance + creditedAmount;
    creditModule();
    }
    // NEFT
    public void creditModule(double creditedAmount){
    System.out.println("Credit amount is : "+creditedAmount+"\nMode of NEFT");
    currentBalance = currentBalance + creditedAmount;
    creditModule();
    }
    // Forex
    public void creditModule(String currencyName,double creditedAmount,double exchangeRate){
    double exchangedCredits; 
    exchangedCredits= creditedAmount * exchangeRate; //INR
    currentBalance = currentBalance + exchangedCredits;
    System.out.println("currency Name is : "+currencyName+"\nconvert to remmitane currency INR is : "+exchangedCredits);
    creditModule();
    }

    public static void main(String[] args) {
        LearnPolymorphism credits = new LearnPolymorphism();
       credits.creditModule();
       credits.creditModule(94500.50);//NEFT
       credits.creditModule("USD", 55.55, 92.43);// Forex
       credits.creditModule(2000);//CDM

    }
}
