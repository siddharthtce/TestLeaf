package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int range = 8;
		System.out.println(a);
		System.out.println(b);
		for(int i=3;i<=range;i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
