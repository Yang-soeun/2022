# 📌JAVA 실습

<details>

<summary> 입출력 </summary>
<div markdown="1">
  
- Scanner 객체
   - java.util.Scanner 클래스
   - import문 필요
      - 소스 맨 앞줄에 선언
 - Scanner에서 키 입력 받기
   - Scanner는 입력되는 키 값을 공백으로 구분되는 아이템 단위로 읽음
   - 공백 문자 : '\t', '\f', '\r', '\n'
 - 개발자가 원하는 다양한 타입으로 쉽게 읽을 수 있음
  
| 메소드 | 설명 |    
| :---: | :----: |    
| String next() | 다음 아이템을 문자열 타입으로 리턴한다. |    
| String nextByte() | 다음 아이템을 byte 타입으로 리턴한다. |
| String nextShort() | 다음 아이템을 short 타입으로 리턴한다. |
| int nextInt() | 다음 아이템을 int 타입으로 리턴한다. |
| long nextLong() | 다음 아이템을 long 타입으로 리턴한다. |
| float nextFloat() | 다음 아이템을 float 타입으로 리턴한다. |
| double nexxtDouble() | 다음 아이템을 double 타입으로 리턴한다. |
| String nextLine() | 한 라인 전체('\n')를 읽어 문자열 타입('\n 미포함')으로 리턴한다. |
  
boolean hasNext(): 키가 입력될 때까지 기다리며, 입력된 키가 있는 경우 true 리턴. 라인의 첫 문자로 crtl-z 키가 입력되는 false 리턴

## 📝1.1
  - 키보드에서 영문자를 한 글자씩 입력 받아 소문자이면 대문자로, 대문자이면 소문자로 변환하여 출력하는 프로그램 작성.
    - 참고) Scanner의 next() 이용
  - 입력된 문자가 영문자가 아니면 "영문자가 아닙니다"를 출력.
  - CTRL-Z를 입력 받을 때까지 프로그램이 계속 동작.
    - 참고) Scanner의 next()가 실행 중일때 CTRL-Z를 입력하면 오류가 발생하므로, hashNext()로 입력이 있는지 먼저 확인 후 next() 호출
 #### Source code
  ```JAVA
package lab1_1;

import java.util.Scanner;

public class Lab1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("영문자를 입력하시오: ");
		while(in.hasNext())
		{
			String str = in.next();
			char strc = str.charAt(0);
			
			if ('a'<=strc && strc <='z')
			{
				strc -= 32;
				System.out.println("변환된 문자: "+strc);
			}
			
			else if ('A'<=strc && strc <='Z')
			{
				strc += 32;
				System.out.println("변환된 문자: "+strc);
			}
			else
				System.out.println("영문자가 아닙니다.다시 입력해 주십시오.");
				
			System.out.println("영문자를 입력하시오: ");
			
		}

	}

}
 ```
 #### 실행결과
  
![1 1](https://user-images.githubusercontent.com/87464750/149673644-c49b4bf2-7826-4b44-a9ed-1704bf4b2e91.png)
  
## 📝1.2
  - 키보드로부터 정수 3개를 입력 받고, 이 3개의 수로 삼각형을 만들 수 있는지 판별. 만약 삼각형이 구성된다면, 넓이를 계산하여 출력.
    - 참고1) 두 변의 합이 나머지 한 변의 합보다 크면 삼각형 구성 가능
    - 참고2) 세 변의 길이(a, b, c)로부터 삼각형의 넓이를 계산하는 공식(헤론의 공식)
    - 참고3) Math class의 sqrt() method 사용
    - 참고4) 정수를 입력 받을 때, Scanner의 nextInt()도 사용해 보고, 일단 next()에 의해 문자열로 입력 받아 Integer의 parseInt()에 의해 정수로 반환하는 방법도 사용
  
</div>
</details>

<details>

<summary> 조건문과 반복문 </summary>
<div markdown="1">

#### 단순 if 문
- if 다음의 괄호 안에는 조건식(논리형 변수나 논리 연산)
- 조건식 값
   - true인 경우, if 문을 벗어나 다음 문장이 실행된다.
   - false의 경우에는 if 다음의 문장이 실행되지 않고 if문을 빠져 나온다.
- 실행문장이 단일 문장인 경우 둘러싸는 {,} 생략 가능
  
#### 반복문 종류
- for 문
- while 문
- do while 문

#### 중첩 반복
  - 반복문이 다른 반복문을 내포하는 구조
  - 이론적으로 몇 번이고 중첩 반복 가능
  - 너무 많은 중첩 반복은 프로그램 구조를 복잡하게 하므로 2중 또는 3중 반복이 적당
  
#### 반복문: continue
  - 반복문을 빠져 나가지 않으면서
  - 반복문 실행 도중 다음 반복을 진행

#### 반복문: break
  - 반복문 하나를 완전히 빠져 나갈 때 사용
  - break문은 하나의 반복문만 벗어남
    - 중첩 반복의 경우 안쪽 반복문의 break 문이 실행되면 안쪽 반복문만 벗어남

## 📝2.1
  - 다음과 같은 내용이 출력되도록 printMultTable(int high) 메소드를 구현.
#### Source code
```JAVA
package lab2_1;

public class Lab2_1 {

	static void printMultTable(int high)
	{
		for( int i = 1; i<= high; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(i*j + " ");
			}
			System.out.print("\n");
		}
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMultTable(7);
	}

}
```
#### 실행결과
![image](https://user-images.githubusercontent.com/87464750/149674218-90d0eee1-b261-4ab2-8efd-928d93a10899.png)
  
## 📝2.2
  - 다음 조건에 따라 주어진 모양을 출력.
    - 키보드로부터 높이를 나타내는 정수값을 입력 받는다.
    - 입력된 값이 자연수가 아니라면, 자연수가 입력될 때까지 계속 숫자를 입력 받는다.
    - 입력 받은 높이에 따라 다음과 같은 모양을 출력한다.

#### Source code
```JAVA
package lab2_2;

import java.util.*;

public class Lab2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =  new Scanner(System.in);
		
		System.out.println("Enter the height: ");
		int input = in.nextInt();
		
		//자연수가 아니라면 양수가 입력될 때까지 계속 숫자를 입력
		while(input < 0)
		{
			System.out.println("Enter the height: ");
			input = in.nextInt();
		}
		
		for(int i = 0; i<= input; i++)
		{
			for(int j = 0; j<i; j++)
			{
				System.out.print("*");
			}
			for(int j = 0; j<2*(input -i); j++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j<i; j++)
			{
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
		
		

	}

}
```
#### 실행결과
![image](https://user-images.githubusercontent.com/87464750/149677658-47007c64-8a3a-4faa-955e-72372e938ddf.png)
                          
## 📝2.3
  - 올해 1월1일이 어떤 요일인지 입력 받은 후, 달력을 출력.
    - 단, 각 달의 시작부에 빈 칸이 발생하면 *로 채우고, 2월은 28일이라고 가정.
                          
#### Source code
```JAVA
package lab2_3;

import java.util.*;

public class Lab2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("올해 1월 1일은 어떤 요일인가요?");
		Scanner in = new Scanner(System.in);
		int count = 0;
		int ccount = 0;
		
		String month = in.next();
		char mon = month.charAt(0);
		
		for(int i = 1; i<=12; i++)
		{
			System.out.println(i + "월");
			
			for(int k = 0; k< ccount; k++)
			{
				count ++;
				System.out.printf("* ");
			}
			
			if (mon == '월')
			{
				System.out.print("* ");
				count = 1;
				mon = 'a';
			}
			else if (mon == '화')
			{
				System.out.print("* ");
				count = 2;
				mon = 'a';
			}
			else if (mon == '수')
			{
				System.out.print("* ");
				count = 3;
				mon = 'a';
			}
			else if (mon == '목')
			{
				System.out.print("* ");
				count = 4;
				mon = 'a';
			}
			else if(mon == '금')
			{
				System.out.print("* ");
				count = 5;
				mon = 'a';
			}
			else if (mon == '토')
			{
				System.out.print("* ");
				count = 6;
				mon = 'a';
			}
			
			if(i==1 || i ==3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)//31일인 달
			{
				for(int j = 1; j<=31; j++)
				{
					System.out.printf("%d ", j);
					count ++;
					if(count == 7)
					{
						System.out.printf("\n");
						count = 0;
					}
					ccount = count;//다음달의 시작일을 계산하기 위해서
				}
				count = 0;
			}
			else if(i==2)//2월달
			{
				for(int j = 1; j<=28; j++)
				{
					System.out.printf("%d ", j);
					count ++;
					if(count == 7)
					{
						System.out.printf("\n");
						count = 0;
					}
					ccount = count;
				}
				count = 0;
			}
			else//30일인 달
			{
				for(int j = 1; j<=30; j++)
				{
					System.out.printf("%d ", j);
					count ++;
					if(count == 7)
					{
						System.out.printf("\n");
						count = 0;
					}
					ccount = count;
				}
				count = 0;
			}
			System.out.printf("\n");
			
		}
		
	}

}
```
#### 실행결과
![image](https://user-images.githubusercontent.com/87464750/149679389-6facc2a8-9a6e-425f-9901-428235114e9e.png)
