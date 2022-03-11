package chap99.programmers;

public class Solution12949
// 행렬의 곱셈 

{
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr2[0].length];

		for (int i = 0; i < arr1.length; i++)
		// 첫번째행열의 행번호
		{
			for (int j = 0; j < arr2[0].length; j++)
			// 두번째행열의 열번호
			{
				for (int k = 0; k < arr1[i].length; k++)
				// 첫번째행열의 열번호, 두번째행열의 행번호
				
				{
					answer[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}

		return answer;
	}
}
