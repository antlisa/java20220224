package chap99.programmers;

public class Solution12949
// 행렬의 곱셈 
// https://programmers.co.kr/learn/courses/30/lessons/12949
// 2차원 행렬 arr1과 arr2를 입력받아, arr1에 arr2를 곱한 결과를 반환하는 함수, solution을 완성해주세요.
//
// 제한 조건
// 행렬 arr1, arr2의 행과 열의 길이는 2 이상 100 이하입니다.
// 행렬 arr1, arr2의 원소는 -10 이상 20 이하인 자연수입니다.
// 곱할 수 있는 배열만 주어집니다.

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
