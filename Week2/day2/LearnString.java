package week2.day2;

public class LearnString {
public static void main(String[] args) {
// literals way of declaring a string
String  employeeName ="Bhuvanesh";
// instantiation way of declaring a string
String employeeName1 = new String("bhuvanesh");
String  employeeName2 ="Bhuvanesh";
String employeeName3 = new String("Bhuvanesh");
System.out.println(employeeName);
System.out.println(employeeName1);
//scenario 1 -->   scp(string constant pool) == heap memory //false
//scenario 2 --> scp(string constant pool) == scp(string constant pool) //true
//scenario 3 --> heap memory == heap memory //  false
//             ab837vdhue == mngte43ew // false

//scenario 1 -->   scp(string constant pool) .equals() heap memory //true
//scenario 2 --> scp(string constant pool) .equals() scp(string constant pool) //true
//scenario 3 --> heap memory .equals() heap memory //true
//             ab837vdhue .equals() mngte43ew //true
if(employeeName1.equalsIgnoreCase(employeeName)){//true
    System.out.println("Both are same");
}
else{
    System.out.println("Both are different");
}
System.out.println("------------Partial value check-----------------");
if(employeeName1.contains("Bhu")){//case sensitive is activated
    System.out.println("Match found");
}
else{
    System.out.println("No match found");
}
// requirement : to check a charater is present in the string or not
System.out.println(employeeName.charAt(5));
System.out.println("------------printing all the character in the string-----------------");
 char[] employeeNameChars = employeeName.toCharArray();// reassigning the value to the variable
for (int i = 0; i < employeeNameChars.length; i++) {
    System.out.println(employeeNameChars[i]);
}

System.out.println("------------String manipulation-----------------");
// requirement : to get the filetype from the filename
String documentName="selenium.pdf";
System.out.println(documentName.substring(documentName.length()-3));

// requirement : to get the filename without the file type
System.out.println(documentName.substring(0,documentName.length()-4));

String[] documentNameParts = documentName.split("e");
System.out.println(documentNameParts.length);//2
System.out.println(documentNameParts[0]);// s
System.out.println(documentNameParts[1]);// l
System.out.println(documentNameParts[2]);// nium.pdf

System.out.println("------------String replace-----------------");

String replacedName = employeeName.replace("Bhuvanesh", "Vineeth");
System.out.println(replacedName);

String price ="₹2,29,900";
String normalizedValue = price.replaceAll("[^0-9]", "");
System.out.println(normalizedValue);
}
}

