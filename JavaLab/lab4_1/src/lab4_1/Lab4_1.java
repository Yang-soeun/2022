package lab4_1;

import java.util.*;

class Rectangle{
	int x1, y1, x2, y2;
	Rectangle(){x1 = 0; y1 = 0; x2 = 0; y2 = 0;}
	Rectangle(int x1, int y1, int x2, int y2)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
 	boolean check()
 	{
 		if((x1<x2) && (y1>y2))
 			return true;
 		else
 			return false;
 	}
 	void set(int x1, int y1, int x2, int y2)
 	{
 		this.x1 = x1;
 		this.y1 = y1;
 		this.x2 = x2;
 		this.y2 = y2;	
 	}
 	int getArea()
 	{
 		if(check()==true)//직사각형이라면
 			return (y1-y2)*(x2-x1);
 		else//직사각형이 아니면
 			return 0;
 	}
 	void show()
 	{
 		if(check()==true)
 			System.out.printf("(%d, %d), (%d, %d), (%d, %d), (%d, %d)\n", this.x1, this.y1, this.x1, this.y1-this.y2, this.x2, this.y2, this.x2, this.y1);
 		else
 			System.out.println("직사각형이 아니므로 출력 불가");
 	}
 
 	boolean equals(Rectangle r)
 	{
 		if((r.getArea() == this.getArea()))
 		{
 			if(((r.y1-r.y2) == (y1-y2)) && ((r.x2-r.x1) == (x2-x1)))
 				return true;
 			else
 				return false;
 		}
 		else
 			return false;
	}
}
public class Lab4_1 {
	public static void main(String[] args) {
		Rectangle r =new Rectangle();
		Rectangle s = new Rectangle(2, 3, 4, 2);
  
		r.show();
		s.show();
		System.out.println(s.getArea());
		r.set(1, 2, 3, 1);
		r.show();
		System.out.println(r.getArea());
			
		if(r.equals(s))
			System.out.println("두 사각형은 같습니다.");
		else
			System.out.println("두 사각형은 다릅니다.");
	}
}
