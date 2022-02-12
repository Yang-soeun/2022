package solution2_level1;

import java.util.Arrays;

public class Solution2_level1 {

	public static int[] solution(int[] answers) {
		int[] temp = new int[3];
		
		int[] person1 = {1, 2,3 ,4, 5};
		int[] person2  = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		int p1 =0; int p2=0; int p3 = 0;
		
		for(int i = 0; i< answers.length; i++)
		{
			if (answers[i] == person1[i%5])
			{
				p1++;
			}
			if (answers[i] == person2[i%8])
			{
				p2++;
			}
			if (answers[i] == person3[i%10])
			{
				p3++;
			}
		}
		
		temp[0] = p1;
		temp[1] = p2;
		temp[2] = p3;
		
		Arrays.sort(temp);
		int max = temp[2];
		
		if(max == p1 && max == p2 && max == p3){int[] answer = {1, 2, 3}; return answer;}
		else if(max == p1 && max == p2){int[] answer = {1, 2}; return answer;}
		else if(max == p1 && max == p3){int[] answer = {1, 3}; return answer;}
		else if(max == p3 && max == p2){int[] answer = {2, 3}; return answer;}
		else if(max == p1 && max == p2){int[] answer = {1, 2}; return answer;}
		else if(max == p1){int[] answer = {1}; return answer;}
		else if(max == p2){int[] answer = {2}; return answer;}
		else {int[] answer = {3}; return answer;}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(solution(a)));
	}

}
