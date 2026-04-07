package week6;

/*
 syntax:
 while creating a object
 new ClassName();
 */
public class LearnConstructor {

    int a; // declaration
    // // Explicitly like this
    public LearnConstructor() {
        a=10;
        System.out.println("Default Constructor");
    }

    public LearnConstructor(int a) {
        //this.a = a;
        this();//new LearnConstructor()
        System.out.println("Parameterized Constructor: value is "+a);// Global or local
    }
    public static void main(String[] args) {
        LearnConstructor lc ; 
        lc = new LearnConstructor(19); // this --> new ClassName() --> current class/object level reference
        int b=1; // declaration
        System.out.println(lc.a);
        System.out.println(b);
    }

    
}
