package week3.day4;
/*
The type SbiBank must implement the inherited abstract method SBIhq.loanApproval()
*/
public class SbiBank extends SBIhq{

    public void personalAccount(){
        System.out.println("Account is created in the sholinganallur branch");
    }
    @Override
    void loanApproval() {
       System.out.println("any loan approval more than 10 lakhs to be registered in the Portal");
    }
    @Override
    public void repoRate() {
        System.out.println("4.00 percent policy repo rate");
    }
    @Override
    public void reverseRepo() {
       System.out.println("3.35 percent reverse repo rate");
    }
    public static void main(String[] args) {
        SbiBank sbi = new SbiBank();
        sbi.personalAccount();
        sbi.loanApproval();
        sbi.headOfficeLocation();
        sbi.repoRate();
        sbi.reverseRepo();
        sbi.nationalPaymentCorporationOfIndia();
    }
}
