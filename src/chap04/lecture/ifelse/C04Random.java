package chap04.lecture.ifelse;

public class C04Random {
	public static void main(String[] args) {
		double n1 = Math.random(); // 0.0 <= n < 1.0
		System.out.println(n1);
		
		double n2 = n1 * 10;
		System.out.println(n2);
		
		int n3 = (int) n2;
		System.out.println(n3);
		
		int n4 = n3 + 1;
		System.out.println(n4);
	}
}
