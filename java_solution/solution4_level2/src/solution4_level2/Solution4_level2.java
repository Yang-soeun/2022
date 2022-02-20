package solution4_level2;

import java.util.Arrays;

public class Solution4_level2 {
	public static int[] solution(int brown, int yellow) {
		int[] answer = new int[2];	
		
		int area = brown + yellow;
		int width = 0;
		
		//�ּ��� ������ ���̴� 3�̻�
		for(int length = 3; length<=area; length++) {
			if(area % length ==0)
				width = area / length;
			//���ο� ���ΰ� �̷��� ���������� yellow ī���� ���� �����ϴ��� Ȯ��
			if(yellow == (length-2) * ((width) -2)) {
				answer[0] = width;
				answer[1] = length;
				break;
			}
			
		}
		return answer;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Arrays.toString(solution(8, 1)));
	}

}
