package math_11653;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/*
 * ����: ���μ�����
 * ��������: ���� N�� �־����� ��, ���μ������ϴ� ���α׷��� �ۼ�.
*/

public class Math_11653 {

	public static boolean check(int a) {//�Ҽ��� �Ǻ��ϴ� �Լ�
		if(a == 0 || a == 1)
			return false;
		
		for(int i =2; i<a; i++) {
			if(a % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = in.nextInt();
		int i = 2;
		
		while(true) {
			if(check(n)== true) {
				bw.write(n + "\n");
				break;
			}
			else if(n%i == 0 && check(i)) {
				n = n/i;
				bw.write(i + "\n");
			}
			else
				i++;
		}
		bw.close();
	
	}

}
