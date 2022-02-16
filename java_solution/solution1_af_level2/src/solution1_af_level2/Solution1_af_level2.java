package solution1_af_level2;

import java.util.ArrayList;
import java.util.Collections;

public class Solution1_af_level2 {
	public static String solution(int[] numbers) {
		String answer = "";
		
		ArrayList<String> str = new ArrayList<>();
		
		//���ڵ��� ���ڿ��� �ٲ㼭 ����ֱ�
		for(int n : numbers) {
			str.add(String.valueOf(n));
		}
		
		//������������ ����
		//���ٽ�
		Collections.sort(str, (a, b) ->(b+a).compareTo(a+b));
		
		//��� ���ڿ��� 0�� ���->000�̷� ������ ���´�.
		//0000�� 0�̹Ƿ� ��� ���ڰ� 0�� ��� 0�� �����ϵ��� �Ѵ�.
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
