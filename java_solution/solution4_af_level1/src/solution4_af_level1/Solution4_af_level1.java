package solution4_af_level1;

import java.util.HashMap;

public class Solution4_af_level1 {

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		HashMap<String, Integer> map = new HashMap<>();
		
		//HashMap에 Participant 추가.
		for(String player : participant)
			map.put(player, map.getOrDefault(player, 0)+1);
		//HashMap에서 완주한 선수 빼기
		for(String player : completion) map.put(player, map.get(player) -1);
		
		for(String key : map.keySet()) {
			if(map.get(key) !=0) {
				answer = key;
				break;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] p = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] c = {"josipa", "filipa", "marina", "nikola"};
		
		System.out.println(solution(p,c));
	}
}
