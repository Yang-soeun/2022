package lab3_3;

import java.util.Scanner;

public class Lab3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.printf("���� 3���� �Է��ϼ���: ");

		String abc = in.nextLine();//1, 2, 3 ���·� �Է¹ޱ�

		int x;
		int y;
		int z;

		String[] newstr = abc.split(",");//, �������� ������
		
		String a = newstr[0].trim();//��������
		x = Integer.parseInt(a);//���������� �ٲ��ֱ�
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
			System.out.printf("�ﰢ���� ���̴� %f", result);
		}
		else
			System.out.printf("�ﰢ���� �ƴϴ�");
		}
}