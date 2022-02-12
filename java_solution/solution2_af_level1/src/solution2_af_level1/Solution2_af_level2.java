package solution2_af_level1;

import java.util.Arrays;
import java.util.*;

public class Solution2_af_level2 {

	public static int[] solution(int[] answers)
	{
		//수포자들이 찍는 방식이 담긴 2차원 배열
		int[][] patterns = {
				{1, 2, 3, 4, 5},
				{2, 1, 2, 3, 2, 4, 2, 5},
				{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
		};
		
		int[] score = new int[3];//수포자 3명의 점수를 담을 배열
		for(int i = 0; i<score.length; i++)
		{
			for(int j = 0; j< answers.length; j++)
			{
				if(patterns[i][j % patterns[i].length] == answers[j]) score[i]++;
			}
		}
		
		int max = Math.max(score[0], Math.max(score[1], score[2]));//가장 많이 맞은 점수 구하기
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i<score.length; i++)
			if(max == score[i])
				list.add(i+1);
		
		int[] answer = new int[list.size()];
		int c = 0;
		
		//enhanced for문
		for(int num : list)
			answer[c++] = num;
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(solution(a)));
	}

}
