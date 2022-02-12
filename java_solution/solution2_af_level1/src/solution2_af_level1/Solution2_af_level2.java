package solution2_af_level1;

import java.util.Arrays;
import java.util.*;

public class Solution2_af_level2 {

	public static int[] solution(int[] answers)
	{
		//�����ڵ��� ��� ����� ��� 2���� �迭
		int[][] patterns = {
				{1, 2, 3, 4, 5},
				{2, 1, 2, 3, 2, 4, 2, 5},
				{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
		};
		
		int[] score = new int[3];//������ 3���� ������ ���� �迭
		for(int i = 0; i<score.length; i++)
		{
			for(int j = 0; j< answers.length; j++)
			{
				if(patterns[i][j % patterns[i].length] == answers[j]) score[i]++;
			}
		}
		
		int max = Math.max(score[0], Math.max(score[1], score[2]));//���� ���� ���� ���� ���ϱ�
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i<score.length; i++)
			if(max == score[i])
				list.add(i+1);
		
		int[] answer = new int[list.size()];
		int c = 0;
		
		//enhanced for��
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
