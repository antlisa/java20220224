package chap04.book.exercise;

public class Exercise061 {
	public static void main(String[] args) {
		//		*
		//		**
		//		***
		//		****
		//		*****
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (i + 1); j++) {
				System.out.println();
			}
		}
			
		//		*****
		//		****
		//		***
		//		**
		//		*
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (i+1); j++) {
				System.out.println("*");
			}
			
			
		//		*****
		//		 ****
		//		  ***
		//		   **
		//		    *
			

		//			*
		//		   **
		//		  ***
		//		 ****
		//		*****
		}
	}
}
