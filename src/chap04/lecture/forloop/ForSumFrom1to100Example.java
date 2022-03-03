package chap04.lecture.forloop;

public class ForSumFrom1to100Example {
	// 1부터 100까지 합을 출력
	
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum += i; 
			
		}
		
		System.out.println("1~100 합 : "  + sum);
	}
}
