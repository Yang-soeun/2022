package solution2_level2;

import java.util.Arrays;
import java.util.Collections;

public class Solution2_level2 {
	public static int solution(int[] citations) {
		int answer = 0;
		int h = 0;

		Arrays.sort(citations);//오름차순으로 정렬
		
		for(int i = citations.length-1; i >=0; i--) {
			h=0;
			for(int j = citations.length-1; j>=0; j--) {
				if(i+1 <= citations[j]) {
					h++;//i번 이상 인용된 문 수
				}
			}
			if(h-(i+1)>=0){
				if(citations[i] == 0)//0이라면
					answer = 0;
				else {
					answer = i+1;//인덱스 번호는 배열보다 1개 작아서 +1 해줌
					break;
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c = {4, 3, 3, 3, 3};
		
		System.out.println(solution(c));
	}

}
