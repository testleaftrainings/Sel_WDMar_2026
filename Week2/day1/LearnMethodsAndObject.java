package week2.day1;

public class LearnMethodsAndObject {
   //reuseable logic
   // add the two number 
   // two variables , addition operation
   // global declaration
   int a =8;
   int b=12;
   private char c =65; 
   // private - it can be accessible only within the class
   // default - it can be accessible only within the folder/package
   // protected - it can be accessible within the different folder/package using subclass
   // public -it can be accessed by method which present inside or outside the project
   // c=a+b
   //javamethod
    private void addNum(int x,int y){
        int z;
        // x=87;
        // y=74;
        z=x+y;
        System.out.println(z);
    }
    int subNum(int x, int y){
        int z;
        z=x-y;
        return z;
    }
    void divideNum(){ //no argument method
        int x =6, y=3,z;
        z=x/y;
        System.out.println(z);
    }
    public static void main(String[] args) {
        //default int a;
        //object --> it act as the reference for the java class
        // syntax to create an object :
        // ClassName identifierName = new ClassName();   // declaration // initialization --> new memory reference 
        LearnMethodsAndObject objectOne = new LearnMethodsAndObject();
        // local declaration
        //int a =8, b=12,c=1;  
        System.out.println(objectOne.a);
        System.out.println(objectOne.b);
        System.out.println(objectOne.c); // null //(empty) // 0
        objectOne.addNum(objectOne.a,objectOne.b);
        objectOne.addNum(897,93737);
        int solution = objectOne.subNum(76, 21); // when a method return's a datatype
        System.out.println(solution);
        objectOne.divideNum();// no values need to be passed as the argument here
    }
}
