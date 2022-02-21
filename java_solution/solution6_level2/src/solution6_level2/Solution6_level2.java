package solution6_level2;

import java.util.HashMap;

public class Solution6_level2 {

	public int solution(String[][] clothes) {
		int answer = 1;
		
		HashMap<String, Integer> map = new HashMap<>();
		
		//HashMap에 종류를 키값으로 하고 추가
		for(int i = 0; i<=clothes.length-1; i++) {
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
		}

		for(String key : map.keySet()) {
			answer *= map.get(key) + 1;//안입는 경우까지 더해서 곱하기
		}
	
		return answer-1;//하나도 안입는 경우는 제외
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
