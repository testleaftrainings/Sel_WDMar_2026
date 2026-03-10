package week2.day2;

public class LearnArrayInstansiation {
public static void main(String[] args) {
   // literals way of declaring an array
 //   String seleniumCoach[] ={"Bhuvanesh","Vineth","Anburaj","Saranya"};//[0],[1],[2],[3]
 //   size of the array is 4
 // instantiation way of declaring an array
    String seleniumCoachs[] = new String[5];
    // size of the array is 5
    // default value of the array is null
    // how to assign values to the array
    // syntax : identifierName[index] = value;
      seleniumCoachs[0] = "Bhuvanesh";
      seleniumCoachs[1] = "Vineth";
      seleniumCoachs[2] = "Anburaj";
      seleniumCoachs[3] = "Saranya";
      seleniumCoachs[4] = "Vinoth";
   // seleniumCoachs[5] = "Harish";// reassigning the value at index 0
    for(int i=0; i<seleniumCoachs.length;i++){
       System.out.println(seleniumCoachs[i]);
    }
  
    
}
}
