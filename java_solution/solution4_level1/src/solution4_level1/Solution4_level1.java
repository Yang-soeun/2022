package solution4_level1;

import java.util.Arrays;

public class Solution4_level1 {

	public static String solution(String[] participant, String[] completion) {
		String answer = "" ;
		
		Arrays.sort(participant);//참여한 선수들이 담긴 배열 정렬
		Arrays.sort(completion);//완주한 선수들이 담긴 배열 정렬
		
		int  i = 0;
		for(i = 0; i < completion.length; i++) {
			if(!participant[i].equals(completion[i]))
				break;
		}
		
		answer = participant[i];
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] p = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] c = {"josipa", "filipa", "marina", "nikola"};
		
		System.out.println(solution(p, c));
	}
}
