package solution5_re_level2;

import java.util.Arrays;

public class Solution5_re_level2 {

	public boolean solution(String[] phone_book) {
		
		Arrays.sort(phone_book);//길이와 상관없이 작은숫자를 가진것 부터 정렬되므로		
		//뒤의 문자열들만 비교하면 된다.
		for(int i = 0; i<phone_book.length-1; i++) {
			if(phone_book[i+1].startsWith(phone_book[i]))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] phone_book = {"119", "97674223", "1195524421"};
		
		Solution5_re_level2 sol = new Solution5_re_level2();
		
		System.out.println(sol.solution(phone_book));
	}

}
