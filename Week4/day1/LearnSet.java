package week4.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
/*
1) add()
2) size()
3) remove()
4) clear()
*/
import java.util.TreeSet;
public class LearnSet {

    public static void main(String[] args) {
        // syntax :- to create a set
        // SetInterface<wrapperclass> setName = new ImplementationClass<>();
        Set<String> mentorsName = new HashSet<>();
        // HashSet --> retieve random values
        mentorsName.add("Seenivasan");//0 
        mentorsName.add("Vineeth");//1 
        mentorsName.add("Vinoth");//2
        mentorsName.add("Bhuvanesh");//3
        mentorsName.add("Harrish");//4
        for (String mentorName : mentorsName) {
            System.out.println(mentorName);
         }
         System.out.println("--------------------LinkedHashSet-------------------------");
        // LinkedHashSet
         Set<String> mentorsNamInsertionOrder = new LinkedHashSet<>();
         mentorsNamInsertionOrder.add("Seenivasan");//0 
        mentorsNamInsertionOrder.add("Vineeth");//1 
        mentorsNamInsertionOrder.add("Vinoth");//2
        mentorsNamInsertionOrder.add("Bhuvanesh");//3
        mentorsNamInsertionOrder.add("Harrish");//4 
        for (String mentorName : mentorsNamInsertionOrder) {
            System.out.println(mentorName);
         }
         System.out.println("--------------------TreeSet-------------------------");
        // TreeSet
         Set<String> mentorsNameOrder = new TreeSet<>();
         mentorsNameOrder.add("Seenivasan");//0 
         mentorsNameOrder.add("Vineeth");//1 
         mentorsNameOrder.add("Vinoth");//2
         mentorsNameOrder.add("Bhuvanesh");//3
         mentorsNameOrder.add("Harrish");//4 
         mentorsNameOrder.add("vineeth");//5 // It will accept it as unique value
         System.out.println(mentorsNameOrder.size());//starts with 1 
        for (String mentorName : mentorsNameOrder) {
            System.out.println(mentorName);
         }
        // System.out.println(mentorsNameOrder.get()); //method get() is undefined for the type Set<String>
        // convert set into list   
    }

}
