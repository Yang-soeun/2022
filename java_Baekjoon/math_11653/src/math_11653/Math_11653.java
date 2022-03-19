package math_11653;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/*
 * 문제: 소인수분해
 * 문제설명: 정수 N이 주어졌을 떄, 소인수분해하는 프로그램을 작성.
*/

public class Math_11653 {

	public static boolean check(int a) {//소수를 판별하는 함수
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
