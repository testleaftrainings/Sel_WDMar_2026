package week3.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        // syntax to create a list :-
        // interface<wrapperClass> identifierName --> Declaration
        //  -->Cannot instantiate the type Interface
        //  new Implementationclass()--> to instantiate an object
        List<String> mainMentorsList = new ArrayList<>();
        mainMentorsList.add("Bhuvanesh");//0
        mainMentorsList.add("Harrish");//1
        List<String> mentorsList = new ArrayList<>();
        mentorsList.add("Seenivasan");//0 
        mentorsList.add("Vineeth");//1 
        mentorsList.addAll(mainMentorsList);
        mentorsList.add("Vinoth");
        //mentorsList.clear();
        System.out.println(mentorsList.size());// 3
        // Requirement is to sorting the values present inside the list
        Collections.sort(mentorsList); // ascending order
        System.out.println(mentorsList);
        // Requirement is to remove the vaules in the mentorsList by comparing the values in the mainMentorList
        mentorsList.removeAll(mainMentorsList);
          // seg 1 datatype localVariable : seg2 CollectionName
        for (String mentorName : mentorsList) {
            System.out.println(mentorName);
        }
    }
}
