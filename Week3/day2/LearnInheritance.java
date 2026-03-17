package week3.day2;

public class LearnInheritance {

    public int add(int a, int b){
        return a+b;
    }

    public int sub(int a,int b){
        return a-b;
    }

    public static void main(String[] args) {
        LearnInheritance obj = new LearnInheritance();
        System.out.println(obj.add(56,76));
        System.out.println(obj.sub(987,432));
    }
}
