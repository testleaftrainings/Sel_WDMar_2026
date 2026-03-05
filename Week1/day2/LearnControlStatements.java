package week1.day2;

public class LearnControlStatements {
    
   public static void main(String[] args) {
     // control statements 
    // 1) condition statement : 
    // basic operators : + - * / %
    // relationship operators : > < >= <= == !=
    // logical operators : && --> And , || --> OR, ! --> convert true to false or false to true 
   // A) if, elseif, else
    int a = 3 ;
    int b =12 ;
    if(a==b){
    System.out.println("a and b is equal");
    }else if(a>b){
        System.out.println("a is greater than b");
    }else if(a<b){
        System.out.println("B is greater than a");
    }else{
        System.out.println("please check the input value");
    }
    

    // amazon prime checks the user is a prime member or not 
    boolean primeStatus =false;
    if (primeStatus==true) {
        System.out.println("The movie starts to play");
    }else{
        System.out.println("should be redirected to the subscription window");
    }

    //B) Switch case
    // if the user provide the browser name , that particular browser should be opened
    String browerName ="chrome";
    switch (browerName) {
        case "chrome":
            System.out.println("Chrome browser is launched");
            break;
        case "firefox":
            System.out.println("firefox browser is launched");
            break;
    
       default:
            System.err.println("Please check the browserName");
            break;
    } 


    // requirement : to print first 10 whole number // num+1
    // Initialization = whole num  starts with 1
    // condition = 11>10 --> do not print 11 , 1-10 <= 10 --> true, 11 <10 -->false
    //num=num+1 --> num++
for (int i = 1; i >=1; i=i+1) {
    if(i>10){ // 11
        break;
    }
    System.out.println(i);
}



   }
}
