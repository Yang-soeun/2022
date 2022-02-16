package solution1_af_level2;

import java.util.ArrayList;
import java.util.Collections;

public class Solution1_af_level2 {
	public static String solution(int[] numbers) {
		String answer = "";
		
		ArrayList<String> str = new ArrayList<>();
		
		//숫자들을 문자열로 바꿔서 담아주기
		for(int n : numbers) {
			str.add(String.valueOf(n));
		}
		
		//내림차순으로 정렬
		//람다식
		Collections.sort(str, (a, b) ->(b+a).compareTo(a+b));
		
		//모든 문자열이 0인 경우->000이런 식으로 나온다.
		//0000은 0이므로 모든 숫자가 0인 경우 0을 리턴하도록 한다.
		if(str.get(0).startsWith("0")) return "0";
		
		for(String s : str) answer += s;
				
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {30, 33, 34, 5, 9};
		
		System.out.println(solution(nums));
	}

}
