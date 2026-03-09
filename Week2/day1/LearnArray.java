package week2.day1;

public class LearnArray {
    public static void main(String[] args) {
        int a = 15;
        a= 16; // reassignment 
        System.out.println(a);
        // how i can declare an array in java?
        // syntax : datatype[] identifierName
        // char data[] ;
        // syntax : identifierName[] = {'value1','value2','value3'} 
        // data[] = {'a', 'b', 'c'};
        String seleniumCoach[] ={"Bhuvanesh","Vineth","Anburaj","Saranya"};//[0],[1],[2],[3]
        // Index 4 out of bounds - java.lang.ArrayIndexOutOfBoundsException
       // System.out.println(seleniumCoach[4]);
       for(int i=0;i<seleniumCoach.length;i++){
        System.out.println(seleniumCoach[i]);
       }
    }
}
