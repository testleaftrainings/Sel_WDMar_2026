package week1.day2;

public class LearnIncrementalAndDecrementalOperators {

	public static void main(String[] args) {
		int a =8 ,b=4;
		int c;
		c=a%b;
		System.out.println(c);
		boolean d;
		d=a>b;
		System.out.println(d);
		int i =5;
		int j =15;
		// incremental operator --> ++ --> any value +1
		// pre incremental--> ++i --> arthimetic operations is performed 1st 
		System.out.println(++i);// 1+5 -->6
		System.out.println(i);
		// post incremental--> j++  --> initialization is performed 1st 
		System.out.println(j++); // 15
		System.out.println(j); // 1+15 -->16
		
		// decremental operator --> -- --> any value -1
		int x,y;
		x=10;
		y=20;
		// pre decremental operator
		System.out.println(--x);
		// post decremental operator
		System.out.println(y--);// 20
		System.out.println(y);// 19
	}
}
