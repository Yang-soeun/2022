package solution2_level2;

import java.util.Arrays;
import java.util.Collections;

public class Solution2_level2 {
	public static int solution(int[] citations) {
		int answer = 0;
		int h = 0;

		Arrays.sort(citations);//������������ ����
		
		for(int i = citations.length-1; i >=0; i--) {
			h=0;
			for(int j = citations.length-1; j>=0; j--) {
				if(i+1 <= citations[j]) {
					h++;//i�� �̻� �ο�� �� ��
				}
			}
			if(h-(i+1)>=0){
				if(citations[i] == 0)//0�̶��
					answer = 0;
				else {
					answer = i+1;//�ε��� ��ȣ�� �迭���� 1�� �۾Ƽ� +1 ����
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
