package lab3_1;

import java.util.Scanner;

public class Lab3_1 {

	static void sort(int[] array)
		{
			int size = array.length;
			int min;
			int temp;
	
			for(int i = 0; i<size-1; i++)
			{
				min = i;
				for (int j = i+1; j<size; j++)
				{
					if(array[min]> array[j])
					{
						min =j;
					}
				}

				temp = array[min];
				array[min] = array[i];
				array[i] = temp;
			}
			for(int i = 0; i<10; i++)
			{
				System.out.printf("%d ", array[i]);
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] array = new int[10];
			int i = 0;

			Scanner in = new Scanner(System.in);
			System.out.printf("정수 10개를 입력하세요: ");
			
			while (i <10)
			{
				array[i] = in.nextInt();
				i++;
			}
			sort(array);
			}
}
