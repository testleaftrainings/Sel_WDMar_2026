package week3.day4;
public interface RBI {
void repoRate();
void reverseRepo();
//void nationalPaymentCorporationOfIndia();
// Starting from Java 8 interface can have implemented methods too
// default or static method

default void nationalPaymentCorporationOfIndia(){
    System.out.println("Reserve Bank of India (RBI) and Indian Banks' Association (IBA)");
    System.out.println("To Monitor the transaction and regulate them which happening within India");
}
}
