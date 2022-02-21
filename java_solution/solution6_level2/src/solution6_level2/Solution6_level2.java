package solution6_level2;

import java.util.HashMap;

public class Solution6_level2 {

	public int solution(String[][] clothes) {
		int answer = 1;
		
		HashMap<String, Integer> map = new HashMap<>();
		
		//HashMap�� ������ Ű������ �ϰ� �߰�
		for(int i = 0; i<=clothes.length-1; i++) {
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
		}

		for(String key : map.keySet()) {
			answer *= map.get(key) + 1;//���Դ� ������ ���ؼ� ���ϱ�
		}
	
		return answer-1;//�ϳ��� ���Դ� ���� ����
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] clothes = {
				{"yellowhat", "headgear"}, 
				{"bluesunglasses", "face"},
				{"green_turban", "headgear"},
				{"redsunglasses", "eyewear"}};
		
		Solution6_level2 sol = new Solution6_level2();
		
		System.out.println(sol.solution(clothes));
		
	}

}
