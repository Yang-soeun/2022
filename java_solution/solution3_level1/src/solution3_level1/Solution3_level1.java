package solution3_level1;

import java.util.Arrays;

public class Solution3_level1 {
	//체육 수업을 들을 수 있는 학생들의 최대값 리턴
	public static int solution(int n, int[] lost, int[] reserve ) {
		
		int answer = 0;
		answer = n - lost.length;
		
		Arrays.sort(lost);
		Arrays.sort(reserve);
		
		for(int i = 0; i< lost.length; i++)
		{
			for(int j = 0; j<reserve.length; j++)
			{
				if( reserve[j] == lost[i])
				{
					answer ++;
					lost[i] = -1;//중복을 방지하기 위해서
					reserve[j] = -1;
					break;
				}
			}
		}
		
		for(int k : lost)
		{
			for(int i = 0; i<reserve.length; i++)
			{
				if((k - 1 == reserve[i]) || (k + 1 == reserve[i]))
				{
					reserve[i] = -1;
					answer ++;
					break;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;//전체 학생 수
		int[] lost = {2, 4};//체육복을 도난당한 학생들의 번호가 담긴 배열
		int[] reserve = {1, 2, 3};//여별의 체육복을 가져온 학생들의 번호가 담긴 배열
		
		n = 5;
		
		System.out.println(solution(n, lost, reserve));
	}

}
