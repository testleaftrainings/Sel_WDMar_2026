package week1.day2;

public class LearnPrimitiveDatatype {
    public static void main(String[] args) {
        // what is variable ?
        // It is use to store a memory/value , which is to process the business
        // logic and find the solution for the requirement
        // syntax : declaration & Initialization
        // datatype varName =  value;
        // primitive memory is efficiently used
        // what is the age of the employee? max --> 100
         byte employeeAge =29;
         short employeeId = 1234;
         int employeeSalary =675454;
         System.out.println(employeeAge);//29
        // enter the phone number without country code ? 7464763736
         long employeePhoneNum = 7464763736L;
         System.out.println(employeePhoneNum);
        // interest rate for the PF amount ? 3.75
        // float or double 
        float employeeInterestRate = 3.75F;
        System.out.println(employeeInterestRate);
        // insurance status
        boolean employeeInsuranceStatus = true;
        String  employeeName ="Bhuvanesh";
        char employeeInitial='M';
        // + --> concatination operator
        System.out.println(employeeId+" : "+employeeSalary+"\nemployee Insurance Status is :"+employeeInsuranceStatus);
        System.out.println("Employee name is :"+employeeName+"\nEmployee initial is :"+employeeInitial);
    }
}
