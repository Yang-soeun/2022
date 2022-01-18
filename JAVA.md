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
package lab1_2;

import java.util.Scanner;

public class Lab1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.print("정수 3개를 입력하세요: ");

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		double s;
		double result;

		int max = 0;
		int sum;

		//세 변중 가장 큰 변 고르기
		if(a>b)
		{
			max = a;
			if(max<c)
				max = c;
		}

		else if(b>c)
			max = b;
		else 
			max = c;

		sum= (a+b+c)-max;//가장 긴 길이의 변을 제외한 두 변의 합
		
		if(sum>max)//가장 큰 변의 길이가 나머지 두 변의 합의 길이보다 작다면 삼각형
		{
			s = (a+b+c)/2.0;
			result = Math.sqrt(s*(s-a)*(s-b)*(s-c));

			System.out.printf("삼각형의 넓이는 %f", result);
		}
		else
			System.out.printf("삼각형이 아니다");

		}
	}
 ```

#### 실행결과
![image](https://user-images.githubusercontent.com/87464750/149904758-36f1a585-8777-4467-b47a-875f97ebb646.png)
	
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
	
</div>
</details>

<details>

<summary> 배열 </summary>
<div markdown="1">
	
#### 배열
- 인덱스로 접근하는 다수의 데이터로 구성된 자료 구조
	- 배열을 이용하면 한 번에 많은 메모리 공간 선언 가능
- 같은 타입의 데이터들이 순차적으로 저장되는 공간
	- 원소 데이터들이 순차적으로 저장됨
	- 인덱스를 이용하여 원소 데이터 접근
	- 반복문을 이용하여 처리하기에 적합한 자료 구조
- 배열 인덱스
	- 0부터 시작
	- 인덱스는 배열의 시작 위치에서부터 데이터가 있는 상대 위치
	
#### 정방형 배열
- 각 행과 열의 개수가 같은 배열
#### 비정방형 배열
- 각 행의 열의 개수가 다른 배열

## 📝3.1
- 키보드로부터 정수 10개를 입력 받아 배열에 저장하고, 오름차순으로 정렬한 후 출력하는 프로그램
	- [조건1] 사이즈가 10인 배열을 한 개만 사용할 것(다른 배열 선언 및 사용 불가)
	- [조건2] 정렬 부분을 아래와 같은 sort()라는 이름의 메소드로 구현
		- static void sort(int[] array) {}
#### Source code
#### 실행결과
![image](https://user-images.githubusercontent.com/87464750/149916842-d971aa12-11db-431c-828c-4ccc13051cc8.png)
	
## 📝3.2
- 철수는 매주 로또 5개를 구입하는데, 항상 "자동선택"으로 구입한다. 다섯 set의 로또 번호를 자동으로 생성해주는 프로그램을 작성.
	- [조건1] 5x6의 2차원 배열을 생성한다. 다섯 개의 각 행에 속한 6개의 숫자가 1set의 로또 번호를 의미하며, 각 숫자는 1~45 사이의 랜덤 번호이다. 중복된 숫자는 없어야 한다.
	- [조건2] 각 로또 set를 정렬하여 재저장한다.(앞에서 구현한 sort() 메소드를 활용)
	- [조건3] 5 set의 로또 번호를 출력한다.(정렬된 결과가 저장된 2차원 배열을 직접 출력)

#### Source code
#### 실행결과
![image](https://user-images.githubusercontent.com/87464750/149916419-591c31bf-5aa9-4bea-972d-fb348292217e.png)
	
## 📝3.3
- 다음은 1.2의 삼각형 넓이 계산 문제이다.
	- 키보드로부터 정수 3개를 입력받고, 이 3개의 수로 삼각형을 만들 수 있는지 판별. 만약 삼각형이 구성된다면, 넓이를 계산하여 출력.
	- 3개의 정수를 쉼표와 공백으로 구분하여, 위의 프로그램을 다시 작성하라
		- 참고) String의 split()메소드는 문자열을 특정 구분자가 기준으로 나누어 배열에 담는다.
		- 참고) String의 trim() 메소드는 문자열 앞뒤의 공백을 제거한다.
		- 참고) Integer의 parseInt() 메소드는 문자열을 정수로 변환한다.
#### Source code
#### 실행결과
![image](https://user-images.githubusercontent.com/87464750/149917579-f3dd4d9c-ad08-49e7-98bb-4aa3ec876b47.png)
