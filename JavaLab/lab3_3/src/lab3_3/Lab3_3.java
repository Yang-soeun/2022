package lab3_3;

import java.util.Scanner;

public class Lab3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.printf("정수 3개를 입력하세요: ");

		String abc = in.nextLine();//1, 2, 3 헝태로 입력받기

		int x;
		int y;
		int z;

		String[] newstr = abc.split(",");//, 기준으로 나누기
		
		String a = newstr[0].trim();//공백제거
		x = Integer.parseInt(a);//정수형으로 바꿔주기
		String b = newstr[1].trim();
		y = Integer.parseInt(b);
		String c = newstr[2].trim();
		z = Integer.parseInt(c);
		
		double s;
		double result;

		int max = 0;
		int sum;

		if(x>y)
		{
			max = x;
			if(max<z)
				max = z;
		}
		else if(y>z)
			max = y;
		else 
			max = z;
 
		sum= (x+y+z)-max;

		if(sum>max)
		{
			s = (x+y+z)/2.0;
			result = Math.sqrt(s*(s-x)*(s-y)*(s-z));
			System.out.printf("삼각형의 넓이는 %f", result);
		}
		else
			System.out.printf("삼각형이 아니다");
		}
}