package lab10_1;

import java.util.Iterator;
import java.util.Vector;
import java.util.*;

public class Lab10_1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		Iterator<Integer> it  = v.iterator();
  
		for(int i = 0; i<20; i++)
		{
			int num = (int)(Math.random()*(1000 - 100 +1))+100;
			v.add(num);
		}
  
		System.out.println("Before Sorting: " + v);//정렬 전 출력
		Collections.sort(v);//정렬
		System.out.println("After Sorting: " + v);//정렬 후 출력
  
		it = v.iterator();
		int min = Collections.min(v);
		int max = 0;
  
		while(it.hasNext())
		{
			int n = it.next();
   
			if(max < n)
			{
				max = n;
			}
		}
  
		System.out.println("max = " + max + ", " + "min = " + min);
  
	}
}