package solution1_level1;

import java.util.Arrays;

public class Solution1_level1 {

    public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];//�迭 ������ �� �ʱ�ȭ
		int[] newArray = {};
		
		for(int a = 0; a<commands.length; a++)
		{
			int i = commands[a][0] -1;
			int j = commands[a][1];
			int k = commands[a][2]-1;
			
			newArray = new int[j-i];
			int c = 0;
			for(int b = i; b<j; b++)
			{
				//i��° ���ں��� j��° ���ڱ��� �߶� �ֱ�
				newArray[c] = array[b];
				c ++;
			}
			
			Arrays.sort(newArray);//�����ϱ�
			answer[a] = newArray[k];
		}
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int[] a = {1, 5, 2, 6, 3, 7, 4};
        int[][] c = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
        System.out.println(Arrays.toString(solution(a, c)));
	}

}