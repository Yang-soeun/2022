package solution3_level1;

import java.util.Arrays;

public class Solution3_level1 {
	//ü�� ������ ���� �� �ִ� �л����� �ִ밪 ����
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
					lost[i] = -1;//�ߺ��� �����ϱ� ���ؼ�
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
		int n = 0;//��ü �л� ��
		int[] lost = {2, 4};//ü������ �������� �л����� ��ȣ�� ��� �迭
		int[] reserve = {1, 2, 3};//������ ü������ ������ �л����� ��ȣ�� ��� �迭
		
		n = 5;
		
		System.out.println(solution(n, lost, reserve));
	}

}
