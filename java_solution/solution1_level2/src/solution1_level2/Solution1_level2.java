package solution1_level2;

import java.util.ArrayList;
import java.util.Collections;

public class Solution1_level2 {
	
	public static String solution(int[] numbers) {
		String answer = "";
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		for(int i = 0; i< numbers.length; i++) {
			if(numbers[i] < 10) list1.add(numbers[i]);
			else if(numbers[i] < 100) list2.add(numbers[i]);
		}
		
		Collections.sort(list1, Collections.reverseOrder());
		Collections.sort(list2, Collections.reverseOrder());
		
		ArrayList<Integer> newNum = new ArrayList<>();
		
		for(int i : list1) newNum.add(i);
		
		int index = 0;
		
		for(int j : list1) {
			for(int k = 0; k< list2.size(); k++) {
				if(j < (list2.get(k))/10) {
					newNum.add(index, list2.get(k));
					index ++ ;}//10의 자리가 더 크다면 그 원소 앞에 추가
				else if (j == (list2.get(k))/10) {//같다면
					if(j < (list2.get(k)%10)) {
						newNum.add(index, list2.get(k));
						index ++;}//일의 자리가 더 큰 수를 앞에 추가
					else {
						newNum.add(index + 1, list2.get(k));
						index ++ ;}
				}
			}
			index ++;
		}
		
		index = newNum.size() - list1.size();
		for(int i =index; i<list2.size(); i++)
			newNum.add(list2.get(index));
		
		for(int i : newNum) answer += Integer.toString(i);
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] n = {32, 30, 9, 5, 6, 3, 20, 230};
		
		System.out.println(solution(n));

	}
}
