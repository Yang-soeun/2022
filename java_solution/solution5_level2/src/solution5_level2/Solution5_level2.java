package solution5_level2;

public class Solution5_level2 {

	public boolean solution(String[] phone_book) {
		
		for(int i = 0; i<phone_book.length; i++) {
			for(int j = 0; j< phone_book.length; j++) {
				if(j != i) {//������ �ε����� ������ ��찡 �ƴҶ�
					if(phone_book[i].startsWith(phone_book[j]))
						return false;
				}
			}
		};
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] phone_book = {"119", "97674223", "1195524421"};
		
		Solution5_level2 sol = new Solution5_level2();
		
		System.out.println(sol.solution(phone_book));
	}

}
