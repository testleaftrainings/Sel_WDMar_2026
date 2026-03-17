package week3.day2;
/*
Use case: 
1. Memory efficency 
2. Code reuseablitlity improve
3. Prevents the code duplications
4. code maintainability is improved
5. Code complexicity is simplied
 */
public class Calculator extends LearnInheritance{
public int multiple(int a, int b){
    return a*b;
}
public int remainder(int a, int b){
    return a%b;
}
public int quo(int a, int b){
    return a/b;
}
public static void main(String[] args) {

    //   LearnInheritance obj = new LearnInheritance();
    //   System.out.println(obj.add(56,76));
    //   System.out.println(obj.sub(987,432));
    Calculator cal = new Calculator();
    System.out.println("-----Solution-----");
    System.out.println(cal.remainder(56,3));
    System.out.println(cal.quo(12, 7));
    System.out.println(cal.multiple(12, 54));
    System.out.println(cal.add(32, 76));
    System.out.println(cal.sub(45363, 876));
}
}
