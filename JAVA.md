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
- [Lab3_1](JavaLab/lab3_1/src/lab3_1/Lab3_1.java)
#### 실행결과
![image](https://user-images.githubusercontent.com/87464750/149916842-d971aa12-11db-431c-828c-4ccc13051cc8.png)
	
## 📝3.2
- 철수는 매주 로또 5개를 구입하는데, 항상 "자동선택"으로 구입한다. 다섯 set의 로또 번호를 자동으로 생성해주는 프로그램을 작성.
	- [조건1] 5x6의 2차원 배열을 생성한다. 다섯 개의 각 행에 속한 6개의 숫자가 1set의 로또 번호를 의미하며, 각 숫자는 1~45 사이의 랜덤 번호이다. 중복된 숫자는 없어야 한다.
	- [조건2] 각 로또 set를 정렬하여 재저장한다.(앞에서 구현한 sort() 메소드를 활용)
	- [조건3] 5 set의 로또 번호를 출력한다.(정렬된 결과가 저장된 2차원 배열을 직접 출력)

#### Source code
- [Lab3_2](JavaLab/lab3_2/src/lab3_2/Lab3_2.java)
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
- [Lab3_3](JavaLab/lab3_3/src/lab3_3/Lab3_3.java)
#### 실행결과
![image](https://user-images.githubusercontent.com/87464750/149917579-f3dd4d9c-ad08-49e7-98bb-4aa3ec876b47.png)
	
</div>
</details>

<details>

<summary> 클래스와 객체 </summary>
<div markdown="1">

## 객체지향 프로그래밍이란?
- 실세계 모델링에 중점을 둔 프로그래밍 언어
	- 과거
		- 컴퓨터는 주로 계산에 사용
		- 계산이 이루어지는 과정을 순차적으로 기술하는 것이 편리
	-현재
		- 컴퓨터는 산업 전반에 활용
		- 실세계는 절차 및 과정보다 작업과 그에 연관된 물체(객체)의 상호 작용으로 묘사하는 것이 편리할 수 있음
	- 실세계에서 발생하는 일을 보다 쉽게 프로그래밍하기 위해, 객체 중심의 프로그래밍 언어 탄생

### 객체지향 프로그래밍의 장점
- 소프트웨어 생산성 향상
- 객체지향 언어의 상속, 다향성, 객체, 캡슐화 등 개념들이 소프트웨어 재사용을 쉽게 하는 효과가 있음
	- 소프트웨어의 '재사용'과 '부분 수정'을 용이하게 하여, 소프트웨어를 처음부터 작성하는 부담을 대폭 줄임으로써 생산성이 크게 향상

### 객체지향 언어의 특성
- 캡슐화
	- 데이터 관련 함수를 하나로 결함
	- 데이터를 외부로부터 숨김(보호, 보안, 접근 제어)
		- 외부에서는 비공개 데이터에 직접 접근하거나 메소드의 구현 세부를 알 수 없음
- 상속
	- 상속 트리는 다양한 사물을 체계적으로 분류
	- 상위 클래스의 특성을 하위 클래스가 물려받음
	- 자바는 클래스 다중 상속은 지원하지 않음
- 다형성
	- 동일한 이름의 코드가 상황에 따라 다르게 동작하는 현상
	- JAVA의 다형성 사례
		- 메소드 오버라이딩: 슈퍼 클래스의 메소드를 서브 클래스마다 다르게 구현
		- 메소드 오버로딩: 한 클래스 내에 동일한 이름의 서로 다른 메소드 구현
## 클래스와 객체의 이해
#### 클래스
- 객체를 만들기 위한 설계도
- 객체의 속성(데이터, 변수)과 행위(메소드)선언
	
#### 객체
- 클래스라는 설계도에 따라 만들어낸 실체
	- 메모리 공간을 갖는 구체적인 실체
	- 객체를 클래스의 인스턴스(instance)라고도 함
	
### JAVA 클래스 분석
- 접근 지정자
	- 클래스 접근 권한을 지정
	- 다른 클래스에서 이 클래스를 접근할 수 있는지 기술
- class Person
	- Person이라는 이름의 클래스 선언
	- 클래스는 {로 시작하여}로 닫으며 이곳에 모든 필드와 메소드 구현
- 필드(field)
	- 값을 저장할 멤버 변수
	- 필드마다 접근 지정자 선언

- 생성자(constructor)
	- 클래스의 이름과 동일하고 객체가 생성될 때만 호출되는 특별한 메소드
	- 객체의 필드 초기화 담당
- 메소드(method)
	- 메소드는 함수이며 객체가 할 수 있는 행위 구현
	- 메소드마다 접근 지정자 선언

### 메소드란?
- 메소드
	- 메소드는 C/C++ 의 함수와 동일
	- JAVA의 모든 메소드는 반드시 클래스 안에 있어야 함(캡슐화 원칙)
- 메소드 구성 형식
	- 접근 지정자
		- public, private, protected, 디폴트(접근 지정자 생략된 경우)
	- 리턴 타입
		- 메소드가 반환하는 값의 데이터 타입
- JAVA의 인자 전달 방식
	- 기본 타입 전달: 값에 의한 호출(call by value)
		- 변수 값이 복사되어 전달
		- 메소드의 매개 변수가 변경되어도 당연히 실인자 값은 변경되지 않음
	- 객체/배열 전달: 레퍼런스에 의한 호출(call by reference)
		- 레퍼런스 변수 값이 복사되어 전달
		- 객체/배열이 통째로 복사되어 전달되는 것 아님!
		- 레퍼런스 변수를 통해 객체를 변경하면 당연히 실제 객체도 변경
	
- 메소드 오버로딩
	- 오버로딩
		- 한 클래스 내에서 두 개 이상의 이름이 동일한 메소드 작성
			- 메소드 이름은 동일
			- 매개 변수의 개수나 타입이 서로 달라 구분 가능해야 함
			- 단, 리턴 타입만 다르면 에러!
- this 레퍼런스
	- this란?
		- 현재 실행되는 메소드가 속한 객체에 대한 레퍼런스
			- 컴파일러에 의해 자동 선언: 별도로 선언할 필요 없음
	
- this가 필요한 경우
	- 객체의 멤버 변수와 메소드 내 지역 변수의 이름이 같은 경우
		- 특히, 생성자에서 매개변수 값으로 필드를 초기화할때 유용함
	- 메소드가 객체 자신의 레퍼런스를 반환할 때

## 객체의 생성과 소멸에 대한 세부 사항
	
#### 생성자
- 객체가 생성될 때 필드를 초기화하기 위해 자동으로 실행되는 특별한 메소드
- 생성자의 특징
	- 생성자 이름은 클래스 이름과 동일
	- 리턴 타입 없는 메소드
	- 오버로딩하여 여러 개 작성 가능
	- 선언된 생성자가 하나도 없다면?
		- 개발자가 생성자를 "하나도 작성하지 않으면" 컴파일러가 자동으로 디폴트 생성자 선언
#### 디폴트 생성자
- 클래스에 생성자가 하나도 선언되지 않는 경우
- 컴파일러가 자동으로 생성
	- 매개변수도 없고, 아무런 작업도 하지 않는 생성자
#### 객체의 소멸
- 객체 소멸
	- new에 의해 생성된 객ㅊ체 메모리를 자바 가상 기계로 되돌려 주는 행위
	- 소멸된 객체 공간은 가용 메모리에 포함
- 자바 응용프로그램에서 임의로 객체 소멸할 수 없음
	- 객체 소멸은 자바 가상 기계의 고유한 역할
		- C/C++에서는 할당 받은 객체를 개발자가 프로그램 내에서 삭제
- 가비지(Garbage)
	- 가비지
		- 가리키는 레퍼런스가 하나도 없어 더이상 사용할 수 없는 객체
	- 가비지 컬렉션
		- 자바 가상 기계의 컬렉터가 자동을 가비지를 수집하여 반환

## Static 멤버, final 키워드
#### non-static 멤버(변수, 메소드)의 특성
- 공간적 특성: 객체마다 별도 존재
- 시간적 특성: 객체 생성 후 비로소 접근 가능
	
#### Static 멤버의 특성
- 객체마다가 아니라 클래스마다 하나만 생성됨
	-객체를 생성하지 않고도 접근 가능
- 특성
- 공간적 특성: 클래스 당 하나만 생성
- 시간적 특성: 클래스가 로딩될 때 이미 생성되어 접근 가능
	
#### Static 활용
- 캡슐화 원칙 지키면서 전역 변수/함수를 만들 때 활용
	- 가끔은 전역 변수/함수가 필요할 때도 있음

#### Static 메소드 접근의 제약
- static 메소드는 오직 static 멤버만 접근 가능
	- 객체가 생성되지 않는 상황에서도 static 메소드는 실행될 수 있기 때문에, non-static 메소드와 필드 사용불가
	- non-static 메소드는 static 멤버 사용 가능
- 2static 메소드는 this 사용불가
	- static 메소드는 객체가 생성되지 않는 상황에서도 호출이 가능하므로, 현재 객체를 가리키는 this 레퍼런스 사용할 수 없음

#### final 클래스
- 더이상 클래스 상속 불가능
#### final 메소드
- 더이상 오버라이딩 불가능
#### final 변수
- 더이상 값이 변할 수 없는 변수
	- 상수 선언할 때 사용
	- 상수는 선언 시 초기 값 지정하고, 실행 중 변경 


