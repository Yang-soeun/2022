package solution3_level2;

import java.util.HashSet;
import java.util.Iterator;

public class Solution3_level2 {
	HashSet<Integer> set = new HashSet<>();
	public int solution(String numbers) {

		int answer =0;
		
		permutation("", numbers);
		Iterator<Integer> it =set.iterator();
		
		//System.out.println(set);
		while(it.hasNext()) {
			int number = it.next();
			int n = number;
			if(isPrime(number)) answer++;
		}
		return answer;
	}
	//�Ҽ��� �Ǻ��ϴ� �Լ�
	//�����佺�׳׽��� ü
    public boolean isPrime(int num){
        if (num == 0 || num == 1) { return false;}//�Ҽ��� �ƴϹǷ�
        
        for (int i=2;i<=(int)Math.sqrt(num);i++){
            if (num % i ==0){
                return false;
            }
        }
        return true;
    }
	//���ڵ��� �����ؼ� ���ο� ���ڸ� ����� �Լ�.
	public void permutation(String a, String numbers) {
		if(!a.equals("")) {
			set.add(Integer.valueOf(a));
		}
		
		for(int i = 0; i<numbers.length(); i++) {
			permutation(a + numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i+1));
			//System.out.println(numbers.substring(0, i) + numbers.substring(i+1));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "011";
		
		Solution3_level2 sol = new Solution3_level2();
		System.out.println(sol.solution(num));
	}

}
