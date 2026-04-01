package week5.day3;

public class LearnStaticKeyword {
    String browserName;// only declared // NON STATIC VARIABLE
    static String browserNameStatic; // STATIC VARIABLE
    public static void loadUrl(){
         browserNameStatic ="Chrome";
        System.out.println("URL IS LOADED using "+browserNameStatic+" browser");
     }
     static{ 
        //static block --> initializer
        browserNameStatic ="Firefox";
        System.out.println("STATIC BLOCK EXECUTED HERE");
     }

     { 
        // non static block
        System.out.println("NON STATIC BLOCK EXECUTED HERE");
     }
     


    public static void main(String[] args) {
        // The static field LearnStaticKeyword.browserNameStatic should be accessed in a static way
        System.out.println(browserNameStatic);
        loadUrl();
        //new LearnStaticKeyword();
        LearnStaticKeyword object = new LearnStaticKeyword();
        // System.out.println(object.browserName);
        // object.loadUrl() // NON STATIC METHOD
    }

}
