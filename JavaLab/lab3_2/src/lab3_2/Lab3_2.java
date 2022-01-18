package lab3_2;

import java.util.*;

public class Lab3_2 {

	//오름차순으로 정렬
	static int[] sort(int[] array)
	{
		int size = 6;
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
			//swap
			temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
		return array;
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[][] array2 = new int[5][6];
		int[] array1 = new int[6];
		int[] newArray1 = new int[6];
		int count = 0;
		
		for (int i = 0; i<5; i++)
		{
				int j = 0;
				
				while(j < array2[i].length)//중복된 숫자가 생성되지 않도록
				{
					array2[i][j] = (int)(Math.random()*(45-1+1)+1);//1~45 사이의 랜덤넘버 생성

					for(int k = 0 ; k < j; k++)
					{
						if(array2[i][k] == array2[i][j])
							count = 1;
					}
					
					j ++;
					j = j-count;
					count = 0;
				}

			for(int k = 0; k<6; k++)
			{
				array1[k] = array2[i][k];
			}

			newArray1 = sort(array1);//정렬

			//정렬한 배열의 다시 2차원 배열에 저장
			for(int s = 0; s<6; s++)
			{
				array2[i][s] = newArray1[s];
			}
		}

		//정렬된 결과가 저장된 2차원 배열을 출력
		for( int i = 0; i< 5; i++)
		{
			for(int j = 0; j<6; j++)
			{
				System.out.printf("%d ", array2[i][j]);
			}
			System.out.printf("\n");
		}
	}

}


