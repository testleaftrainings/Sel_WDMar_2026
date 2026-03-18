package week3.day3;


// implementation class
public class AxisBank implements LearnInterface {
    double currentBalance = 10000.00;
    @Override
    public void creditModule() { //BODY --> bussiness logic
        System.out.println("Current Account balance is "+currentBalance);
    }
     @Override
    public void creditModule(int creditedAmount) {
     System.out.println("Credit amount is : "+creditedAmount+"\nMode of Transction CDM");    
    currentBalance = currentBalance + creditedAmount;
    creditModule();
    }
      public static void main(String[] args) {
        AxisBank axis = new AxisBank();
        axis.creditModule(2002);
    }
}
