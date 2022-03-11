package chap06.lecture.p06final;

public class App01 {
	public static void main(String[] args) {
		// final : 변수 선언시 값을 한번만 할당할 수 있음
		int i = 0;
		i = 3;
		
		final int j = 0;
//		j = 1; // xxx
		
		
		final int k;
		k = 9;
//		k = 10; 안됨
	}
}
