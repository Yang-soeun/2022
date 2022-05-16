# 📒JAVA 실습

<details>

<summary> ✏ 입출력 </summary>
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

<summary> ✏ 조건문과 반복문 </summary>
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

<summary> ✏ 배열 </summary>
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

<summary> ✏ 클래스와 객체 </summary>
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
	
#### non-static 멤버와 static 멤버의 차이
	
| | non-static 멤버| static 멤버|  
| :---: | :----: | :----: |    
| 선언 | class Sample {</br>int n;</br>void g() {...}</br>}| class Sample { </br> static int m; </br> static void g() {...}</br>}|
| 공간적 특성 | 멤버는 객체마다 별도 존재 </br> - 인스턴스 멤버라고 부름| 멤버는 클래스당 하나 생성 </br> - 멤버는 객체 내부가 아닌 별도의 공간에 생성 </br> - 클래스 멤버라고 부름|
| 시간적 특성 | 객체 생성 시에 멤버 생성됨 </br> - 객체가 생길때 멤버도 생성 </br> - 객체 생성 후 멤버 사용 가능 </br> - 객체가 사라지면 멤버도 사라짐| 클래스 로딩 시에 멤버 생성 </br> -  객체가 생기기 전에 이미 생성 </br> - 객체가 생기기 전에도 사용 가능 </br> - 객체가 사라져도 멤버는 사리지지 않음 </br> - 멤버는 프로그램이 종료될  사라짐|
| 공유의 특성 | 공유되지 않음 </br> - 멤버는 객체 내에 각각 공간 유지 | 동일한 클래스의 모든 객체들에 의해 공유됨|
	
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

## 클래스와 객체
	
## 📝4.1
	
다음과 같은 멤버를 가지는 Rectangle 클래스를 작성하시오
- 필드
	- int 차입의 x1, y1, x2, y2: 직사각형을 결정하는 두 점의 좌표
	- 원점은 왼쪽 상단이라고 가정
- 메소드
	- 생성자 2개: 매개 변수가 없는 생성자와 x1, y1, x2, y2의 값을 전달 받아 설정하는 생성자
	- void set(int x1, int y1, int x2, int y2): x1, y1, x2, y2의 좌표 설정
	- boolean check(): 지정된 x1, y1 x2, y2의 값으로 직사각형이 구성되면 truem 그렇지 않으면 false를 리턴
	- int getArea(): 사각형의 넓이를 반환(직사각형이 구성되지 않으면 0을 리턴)
	- void show(): 직사각형의 네 점의 좌표와 넓이 정보를 출력(직사각형이 구성되지 않으면 출력 불가 메시지 출력)
	- boolean equals(Rectangle r): 인자로 전달된 객체 r과 현 객체가 동일한 모양과 크기의 직사각형이면 true를, 그렇지 않으면 false를 리턴
	
앞에서 구현한 Rectangle 클래스가 제대로 동작하는지 다음의 RecTest 클래스를 사용하여 테스트.
	
```JAVA
public class RecTest {
 public static void main(String[] args) {
  Rectangle r =new Rectangle();
  Rectangle s = new Rectangle(1, 1, 2, 3);
  
  r.show();
  s.show();
  System.out.println(s.getArea());
  r.set(2, 1, 4, 5);
  r.show();
  System.out.println(r.getArea());
  
  if(r.equals(s))
   System.out.println("두 사각형은 같습니다.");
 }
}
 ```
#### Source Code
[Lab4_1](JavaLab/lab4_1/src/lab4_1/Lab4_1.java)

#### 실행결과
![직사각형](https://user-images.githubusercontent.com/87464750/150938081-6524abdd-ee63-4d36-ae5a-8c35414c88e0.png)
	
## 📝4.2

ComplexNumber 클래스를 구현하고, 이를 통해 생성된 복소수 사이의 덧셈, 뺄셈 등의 연산을 수행
- 다음 클래슬 이용하여 ComplexNumber 클래스가 구현되었는지 테스트하라.

```JAVA
public class ComplexTest {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ComplexNumber n1 = new ComplexNumber();
		ComplexNumber n2 = new ComplexNumber();

		n1.setReal(5);
		n1.setImage(7.2);
		n2.setReal(-3.1);
		n2.setImage(5.7);

		System.out.print("n1 is -> ");
		n1.printNumber();
		System.out.print("n2 is -> ");
		n2.printNumber();

		ComplexNumber n3 = n1.add(n2);
		System.out.print("n3 is -> ");
		n3.printNumber();

		System.out.print("n1 - n2 -> ");
		n1.subtract(n2).printNumber();

	}

}
 ```

#### Source Code
[Lab4_2](JavaLab/lab4_2/src/lab4_2/Lab4_2.java)

#### 실행결과
![복소수](https://user-images.githubusercontent.com/87464750/150938180-6b155102-25c3-4d6a-927d-8e5dfd6903ae.png)
	
## 클래스와 객체 응용
## 📝5.1
	
- Student 클래스 구현 사항
	- 학생 정보를 관리하는 프로그램 구현.
	- 각 학생을 나타내는 Student 클래스 구현
	- Student 클래스의 필드 중 StudentID는 생성자에서 값을 할당한다(다른 필드는 생성자의 전달 인자를 통해 값을 설정)
	- 이때, static 변수인 staticID를 활용하여 객체 생성 순서대로 값을 할당한다. 즉, 2017001, 2017002, 2017003, ...

#### Source Code
#### 실행결과

</div>
</details>


<details>

<summary> ✏ 상속의 이해</summary>
<div markdown="1">

## 상속
#### 상속이란?
- 상위 클래스의 특성(멤버 변수/메소드)을 하위 클래스에 물려주는 것
- 부모 클래스/ 수퍼 클래스(superclass)/기본(base) 클래스
	- 특성을 물려주는 상위 클래스
- 자식 클래스/ 서브 클래스(subclass)/파생(derived) 클래스
	- 특성을 물려 받는 하위 클래스
- 자식은 부모 클래스에 자신만의 특성(필드, 메소드) 추가
	- 더 구체적인 클래스가 됨
	- 중복된 코드를 반복 기술할 필요 없음
- 자식은 부모 클래스의 특성을 수정할 수도 있음
	- '오버라이딩' 이라고 함
	
#### JAVA 상속의 특징

- 상속의 최상위 클래스는 java.lang.* 패키지의 Object 클래스
	- 모든 클래스는 자동으로 java.lang.Object 상속
- 다중 상속 지원하지 않음
	- 여러 클래스를 동시에 상속받지 못함(예: class A extends B, C(x))
	- 다중 상속 자체를 불허하여 다이아몬드 문제 회피
	
#### 멤버의 상속
	
- 자식 클래스에는 부모의 멤버 변수/ 함수 자동 포함
- 상속과 접근 지정자
	- 부모의 private 멤버
		- 자식도 접근 불가
		- 부모 클래스에 public/protected 메소드를 정의하여 간접적으로 접근
	- 부모의 protected 멤버
		- 같은 페키지에 속하는 클래스는 자식이 아니어도 접근 가능
		- 다른 패키지에 속하는 클래스는 당연히 접근 불가
		- 단, 다른 패키지에 속해도 자식이라면 접근 가능
	
#### 상속과 생성자
- 자식 클래스의 객체가 생성될 때
	- 1) 부모의 생성자, 자식의 생성자 모두 실행
		- 부모의 멤버 변수와 자식의 멤버 변수 모두 초기화해야 하므로
	- 2) 호출 순서와 실행 순서
		- 자식 클래스의 생성자가 먼저 호출되나, 부모가 있으면 부모의 생성자부터 먼저 실행
	
- 자식이 명시적으로 부모의 생성자 호출하는 경우
	- super() 키워드를 이용하여 특정 생성자 호출
	- super()는 반드시 자식 생성자의 첫 줄에 와야함
- 자식이 명시적으로 부모의 생성자 호출하지 않는 경우
	- 컴파일러가 부모의 '디폴트 생성자' 호출

## 객체의 타입 변환
	
#### 업캐스팅
- 자식 클래스의 객체를 부모 클래스 레퍼런스로 가리킴
	- 객체의 모든 멤버를 접근할 수 없고 부모 클래스 멤버에만 접근 가능
	
#### 다운캐스팅
- 부모 클래스 레퍼런스로 가리키던 자식 객체를, 원래대로 자식 클래스 레퍼런스가 가리키도록 하는 것
- 명시적으로 타입 지정
	- 다시 자식 객체의 모든 멤버 접근 가능
	
#### instanceof 연산자
- instanceof 연산자
	- 레퍼런스가 가리키는 객체의 진짜 타입 식별
- 사용법
객체레퍼런스 instanceof 클래스타입
	- 연산의 결과: true/false의 불린 값

#### 클래스 이름 얻기
- instanceof 연산자
	- 가능한 클래스 이름을 미리 알고 있어야 학인 가능
- Object -> Class -> getSimpleName()
	- 모든 JAVA 객체는 Object 클래스 상속
	- Object.getClass() 메소드로 Object 객체의 멤버인 Class 객체에 접근
	- Object.getClass().getSimpleName() 메소드로 객체의 클래스 이름 알 수 있음 -> ㅇ

```JAVA
Class Person {}
Class Student extends Person{}
	
...
	public static void main(String{} args{
		person p = new Student();
		System.out.print(p.getClass().getSimpleName());
	}
```

## 메소드 오버라이딩(Overriding)
- 메소드 오버라이딩(Method Overriding)
	- 부모 클래스의 메소드를 자식 클래스에서 재정의
- 객체 생성 -> 업캐스팅 -> 오버라딩된 메소드 호출
	- 자식 클래스의 메소드가 실행됨

#### 매소드 오버라이딩 조건
1. 반드시 부모 클래스 메소드와 동일한 이름, 동일한 호출 인자, 반환 타입을 가져야 한다.
2. 오버라이딩된 메소드의 접근 지정자는 부모 클래스의 메소드의 접근 지정자 보다 좁아질 수 있다.
	- public -> protected -> private 순으로 지정 범위가 좁아진다.
3. 반환된 타입만 다르면 오류
4. static, private, 또는 final 메소드는 오버라이딩 될 수 없다.
	
#### 오버라이딩 vs. 오버로딩
| 비교 요소 | 메소드 오버로딩 | 메소드 오버라이딩 |  
| :---: | :----: | :----: |    
| 정의 | 같은 클래스나 상속 관계에서 동일한 이름의 메소드 중복 작성| 서브 클래스에서 슈퍼 클래스에 있는 메소드와 동일한 이름의 메소드 재작성|
| 관계 | 동일한 클래스 내 혹은 상속 관계 | 상속 관계 |
| 목적 | 이름이 같은 여러 개의 메소드를 중복 정의하여 사용의 편리성 향상| 슈퍼 클래스에 구현된 메소드를 무시하고 서브 클래스에서 새로운 기능의 메소드를 재정의하고자 함 |
| 조건 | 메소드 이름은 반드시 동일함. 메소드의 인자의 개수나 인자의 타입이 달라야 성립| 메소드이 이름, 인자의 타입, 인자의 개수, 인자의 리턴 타입 등이 모두 동일하여야 성립 |
| 바인딩 |  정적 바인딩. 컴파일 시에 중복된 메소드 중 호출된 메소드 결정| 동적 바인딩. 실행 시간에 오버라이딩된 메소드 찾아 호출 |

## 추상 메소드와 추상 클래스
	
#### 추상 메소드(abstract method)
- 선언되어 있으나 구현되지 않은 메소드
	- 메소드 앞에 abstract 선언
- 추상 메소드는 자식 클래스에서 오버라딩하여 구현
	
#### 추상 클래스(abstract class)	
- 추상 메소드를 하나라도 가진 클래스
	- 크래스 앞에 abstract라고 선언해야 함
- 설계와 구현의 분리

## 인터페이스
	
#### JAVA의 인터페이스
	
- 극단적으로 형식만 남긴 클래스
	- 껍데기만 남은 클래스
- 멤버 변수 정의 불가
	- 상수는 정의 가능
- 모든 메소드가 추상 메소드
	
##### 인터페이스 선언
	- class가 아니라 interface 키워드로 선언
	> ex) public interface SerialDriver {...}
	
- 특징
	- 인터페이스의 메소드
		- 반드시 public abstract 타입이므로 'public', 'abstract' 생략 가능
	- 인터페이스 상수
		- 반드시 public static final 타입이므로 'public', 'static', 'final' 생략 가능
	- 객체 생성 불가
		- 껍데기만 남은 클래스이므로 객체를 만들 수 없음
	- 레퍼런스 변수는 선언 가능
		- 껍데기만 남았어도 가리킬 수는 있음
	
#### 인터페이스의 필요성
	
- Java는 다이아몬드 문제를 피하기 위해 다중 상속 미지원
	- 그러나 가끔 다중 상속이 필요한 경우 발생.
		-  하나의 객체를 다양한 형태로 업캐스팅 하고싶다(다형성 활용)
##### 해결 방법
	
- 다이아몬드 문제가 발생하지 않도록 알맹이 없는 클래스인 인터페이스 정의
- 인터페이스는 다중 상속 허용

#### 인터페이스 상속
	
- 인터페이스 간에도 상속 가능
	- 인터페이스를 상속하여 확장된 인터페이스 작성 가능
- 인터페이스는 다중 상속 허용
	
#### 인터페이스 구현
- implements 키워드 사용
- 여러 개의 인터페이스 동시 구현 가능
- 상속과 구현이 동시에 가능

```JAVA
interface USBMouseInterface{
	void mouseMove();
	void mouseClick();
}
	
public class MouseDriver implements USBMouseInterface {//인터페이스 구현
	public void mouseMove() {....}
	public void mouseClick() {....}
	
	//추가적으로 다른 메소드를 작성할 수 있다.
	int getStatus() {...}
	int getButton() {...}
}	
```
#### 추상 클래스 vs. 인터페이스
	
| 비교 | 내용 |    
| :---: | :----: |    
| 추상 클래스 | 일반 메소드 포함 가능. </br> 상수, 변수 필드 포함 가능 </br> 모든 서브 클래스에서 공통된 메소드가 있는 경우에는 추상 클래스가 적합.|    
| 인터페이스 | 모든 메소드가 추상 메소드. </br> 상수 필드만 포함 가능. </br> 다중 상속 지원. |
	
## 상속의 이해
	
## 📝6.1

- 다음 조건을 만족하는 Employee 클래스를 구현.
- 
##### 1. 필드.
	- protected String name: 사원의 이름
	- private int salary : 봉급
	- protected String ID: 사원의 사번
	
##### 2. 생성자
	- Employee(): String은 "", int 형은 0으로 초기화
	- Employee(String name, int salary, String ID) : parameter로 입력 받아 초기화
	
##### 3. 메소드
	- 각 필드의 mutator와 accessor 메소드를 구현
	- toString(): name과 salary 및 ID를 "\t"를 이용하여 구분한 String 으로 return 

- 다음 조건을 만족하는 Manager 클래스를 구현하시오.

##### 1. Employee 클래스를 상속

##### 2. 추가적인 필드
	- private String department: 책임 지고 있는 부서의 이름
	
##### 3. 생성자
	- Manager(): Employee의 default constructor를 호출하고 department를 "" 으로 초기화
	- Manager(String name, int salary, String ID, String department) : parameter를 입력받아 초기화
	
##### 4. 메소드
	- 메소드 mutator와 accessor를 구현
	- toString(): name, salary, ID과 department를 "\t"을 이용하여 구분한 String으로 return

#### Source Code
#### 실행결과

## 상속과 다형성
	
## 📝7.1

- 세 개의 클래스(Student, Undergraduate, Graduate)를 구현.
- Student는 Undergraduate와 Graduate의 부모 클래스
- Student 클래스의 getAnnualSalary()는 0을 리턴
- Undergraduate 클래스이 getAnnualSalary()는 semesterSalary로부터 계산된 연 급여 리턴
	- [참고] 학과 일을 돕는 학부생은 한 학기에 한번씩 수당을 받으며, semesterSalary가 이 정보를 저장
- 유사하게, Graduate의 연 급여는 monthSalary로부터 계산됨
	- [참고] 학과 일을 돕는 대상원생은 한 달에 한 번씩 수당을 받으며, monthSalary가 이 정보를 저장
- toString()은 해당 객체에 대한 중요 정보를 출력

#### Source Code
#### 실행결과

## 추상 클래스
	
## 📝8.1
- 텍스트 화면의 원하는 위치에 원하는 크기의 도형(직사각형, 직각삼각형)을 그리기 위해 다음 2개의 클래스를 구현하라.
##### 1. Rectangle 클래스

##### <필드>
	- private String figureName: 직사각형의 이름
	- private int width: 직사각형의 밑변 길이
	- private int height: 직사각형의 높이

##### <메소드>
	- public Rectangle(String figureName, int width, int height): 생성자
	- public void drawAt(int offset_c, int offset_y)
		- 직사각형의 그릴 위치(offset_c, offset_y)를 맞춘다
		- 이때 정확한 위치를 표시하기 위해 번호를 표시한다.
	- public void drawHere(int offset_x)
		- drawAt()에 의해 호출되며 ' * ' 를 이용하여 밑변 width, 높이 height인 직사각형을 그린다.

##### 2. Triangle 클래스

##### <필드>
	- private String figureName: 직사각형의 이름
	- private int base: 직각삼각형의 밑변 및 높이

##### <메소드>
	- public Triangle(String figureName, int base): 생성자
	- public void drawAt(int offset_x, int offset_y)
		- 직각삼각형을 그릴 위치(offset_x, offset_y)를 맞춘다.
		- 이때 정확한 위치를 표시하기 위해 번호를 표시한다.
	- public void drawHere(int offset_x)
		- drawAt()에 의해 호출되며 ' * '를 이용하여 밑변 base, 높이 base인 직각삼각형을 그린다.

- 앞의 두 클래스를 살펴보면 공통적으로 포함된 내용이 있다. 따라서 상속과 추상 메소드의 개념을 이요애하여 Figure라는 새로운 클래스를 정의할 수 있다.

##### 3. Figure 클래스

##### <필드>
	- Rectangle과 Triangle 클래스에 공통으로 들어가는 필드들

##### <메소드>
	- Rectangle과 Triangle 클래스에 공통으로 들어가는 메소드들
	- Rectangle과 Triangle 클래스의 필드 및 메소드 이름은 절대 변경하지 말 것
	- Figure 클래스는 객체를 생성할 필요가 없으며, 이 클래스에 정의된 메소드 역시 body({...})를 만들 필요가 없으므로, 추상 메소드로 정의할 수 있다. 
		-> 이 힌트를 이용하여, Figure 클래스를 추상 클래스로 정의하고 적절히 구현.
	
#### Source Code
#### 실행결과
</div>
</details>

<details>

<summary> ✏ 예외 처리 및 입출력 </summary>
<div markdown="1">

## 예외 처리(Exception Handling)
#### 오류
- 프로그램이 실행 중 어떤 원인에 의해 오작동하거나 비정상 종류되는 경우
- 예외(exception)
	- 복구 가능한 덜 심각한 오류
		- 0 으로 나누기 시도, 존재하지 않는 파일 열기 등
	- 예외가 발생하면 잘 처리하여 복구하기를 권장함
	
#### C언어
- 표준 방법은 정의되어 있지 않으나, 리턴 값으로 예외 상황을 알려주는 방식을 주로 사용
#### JAVA 
- Try-catch를 통한 표준 방법 지원
- 예외 정보를 담고 있는 객체를 생성하여 전달하는 방식

#### JAVA의 예외 처리
- 실행 중 오루 발생하면 JVM이 예외 객체 생성
- 응용프로그램에서 예외 객체를 처리하지 않으면, 프로그램 강제종료
- 예외 처리 문
	- try-catch-finally문 사용
	- finally 블록은 생략 가능
	
```
	try{
	//예외가 발생할 수 있는 위험한 코드
	}
	catch(처리할 예외 타입 선언){
	//실제 예외가 발생하면 여기에서 처리
	}
	finally{
	//예외 발생 여부와 상관없이 무조건 실행되는 문장
	}
```
	
#### 자주 발생하는 예외
	
| 예외 종류 | 예외 발생 경우 |    
| :---: | :----: |    
| ArithmeticException | 정수를 0으로 나눌 때 발생 |    
| NullPointerException | null 레퍼런스를 참조할 때 발생 |
| ClassCastException | 변환할 수 없는 타입으로 객체를 변환할 때 발생 |
| OutOfMemoryError | 메모리가 부족한 경우 발생 |
| ArrayIndexOutOfBoundsException | 배열의 범위를 벗어난 접근 시 발생|
| IllegalArqumentException| 잘못된 인자 전달 시 발생 |
| IOException| 입출력 동작 실패 또는 인터럽트 시 발생 |
| NumberFormatException | 문자열이 나타내는 숫자와 일치하지 않는 타입의 숫자로 변환 시 발생 |
	
## 입출력
- 입출력 대상
	
| | 입력 대상 | 출력 대상 |  
| :---: | :----: | :----: |    
| 표준 입출력 | 키보드 | 모니터 |
| 파일 입출력 | 파일 | 파일 |
| 네트워크 입출력 | 네트워크로 연결된 호스트 | 네트워크로 연결된 호스트 |

- 입출력 내용
	- 일반적인 바이너리 데이터
		- 문자, 그림, 실행코드 등
	- 문자는 중요하므로 특별 취급
	
#### 바이트스트림 클래스
	
- 바이트스크림 클래스(java.io 패키지에 포함)
	- inputStream/OutputStream
		- 추상 클래스
		- 바이트 입출력 스트림을 다루는 모든 클래스의 수퍼 클래스
	- FileInputStream/FileOutputStream
		- 파일로부터 바이트 단위로 읽거나 저장하는 클래스(1차 스트림)
		- 바이너리 파일의 입출력
	- DataInputStream/DataOutputStream
		- 자바의 기본 데이터 타입의 값(변수)을 바이너리 값 그대로 입출력(2차 스트림)
		- 문자열도 바이너리 형태로 입출력

#### InputStream을 이용한 키보드 읽기
	
- Inputstream은 추상클래스이므로 객체와 불가
- System.in
	- System 클래스의 static InputStream in 필드
	- JVM은 시작될 때 ' InputStream '을 상속한 어떤 객체를 생성하고 System.in으로 가리킴
	- 이 객체는 표준입력인 키보드와 연결됨
	
- System.in을 이용한 키보드 읽기
	
``` JAVA
	int c;
	
	while((c = System.in.read()) != -1) {
		System.out.print((char)c);
	}
```
#### OutputStream을 이용한 화면 출력
	
- OutputStream은 추상클래스이므로 객체화 불가
- System.out
	- System 클래스의 static PrintStream out 필드
	- JVM은 시작될 때 'OutputStream을 상속한 Printstream 객체'를 생성하고 System.out으로 가리킴
	- 이 객체는 표준출력인 모니터와 연결됨

``` JAVA
	int c;
	
	while((c = System.in.read()) != -1) {
		System.out.print((char)c);
	}
```
	
#### FileInputStream을 이용한 파일 읽기

``` JAVA
FileInputStream fin = new FileInputstream("c:\\test.txt");
	
int c;
	
while((c = fin.read()) != -1) {
	System.out.print((char)c);
	}
	
fin.close();
```
- 입력 받이트 스트림객체를 생성하고 c:\\test.txt 파일 오픈
- 파일 끝까지 반복하며 한 바이트씩 c에 읽어 들임.
- 파일의 끝을 만나면 read()는 -1 flxjs
- 바이트 c를 문자로 변환하여 화면에 출력
- 스트림을 닫음. 파일도 닫힘. 더 이상 스트림으로부터 읽을 수 없음

#### FileOutputStream을 이용한 파일 쓰기
- 바이너리 값을 파일에 저장하는 바이트 스트림 코드

``` JAVA
FileOutputStream fout = new FileOutputStream("c:\\test.txt");

int iNum[] = {1, 4, -1, 88, 50 };
byte b[] = {7, 51, 3, 4, 1, 24};

for(int i = 0; i<iNum.length; i++)
	fout.write(iNum[i]);
			      
fout.write(b);
			      
fout.close();
```
			      
- 출력 바이트 스트림 객체를 생성하고 c:\\test.txt 파일 오픈
- 파일에 정수 값(바이너리)을 그대로 기록(LSB만) 
- 파일에 바이트 배열(바이너리) 값을 그대로 기록
- 스트림을 닫음, 파일도 닫힘, 더 이상 스트림으로부터 읽을 수 없음
			
#### 문자스트림
			      
- 문자 스트림을 다루는 클래스 (java.io 패키지에 포함)
	- Reader/Writer
		-  추상 클래스로서 문자 스트림을 다루는 모든 클래스의 슈퍼 클래스
	- FileReader/FileWriter
		- 텍스트 파일로의 문자 입출력에 특화된 클래스(1차 스트림)
	- InputStreamReader/OutputStreamWriter
		- 코딩 변환 기능 제공(2차 스트림)
		- InputStreamReader : 바이트를 읽어 문자로 인코딩
		- OutputStreamWriter : 문자를 읽어 바이트로 디코딩
		
#### File 클래스
- File 클래스
	- 파일의 경로명을 다루는 클래스
		- java.io.File
		- 파일과 디렉터리 경로명의 추상적 표현
	- 파일 이름 변경, 삭제, 디렉터리 생성, 크기 등 파일 관리
		- File 객체는 파일 읽고 쓰기 기능 없음
		- 파일 입출력은 파일 스트림 이용


#### File 클래스 생성자와 주요 메소드
			      
| 메소드 | 설명 |    
| :---: | :----: |    
| File(File parent, String child)| parent 디렉터리에 child 파일명으로 구성되는 File 객체 생성 |    
| File(String pathname) | 문자열 pathname이 나타내는 File 객체 생성 |
| File(String parent, String child) | parent의 디렉터리에 문자열 child가 나태는 새로운 File 객체 생성 |
| File(URI uri) | file:URI를 추상 경로명으로 변환하여 File 객체 생성 |
			      
| 메소드 | 설명 |    
| :---: | :----: |    
| boolean mkdir() | 추상 경로명이 나타내는 새로운 디렉터리 생성 |    
| String[] list() | 디렉터리 내에 있는 파일과 디렉터리 이름을 문자열 배열로 변환 |
| String[] listFiles() | 추상 경로명이 나타내는 디렉터리 내에 있는 파일의 일므을 문자열 배열로 변환 |
| boolean renameTo(File dest) | dest가 지정하는 추상 경로명으로 파일 이름 변경 |
| boolean delete() | 추상 경로명이 나타내는 파일 또는 디렉터리 삭제|
| long length() | 추상 경로명이 나타내는 파일의 크기 반환 |
| String getPath() | 추상 경로명 전체를 문자열로 변환하여 반환 |
| String getName() | 추상 경로명이 나타내는 파일 또는 디렉터리 이름을 문자열로 반환하여 반환 |
| boolean isFile() | 추상 경로명이 일반 파일이면 true 반환|
| boolean isDirectory() | 추상 경로명이 디렉터리이면 true 반환 |
| long lastModified() | 추상 경로명이 나타내는 파일이 마지막으로 변경된 시간 반환 |
| boolean exists() | 추상 경로명이 나타내는 파일 또는 디렉터리가 존재하면 true  |
			
## 예외 처리와 입출력
	
## 📝9.1
	
- 내용이 저장된 "data.txt"를 만드시오.
- 위 파일을 한 라인씩 read해서 문자열을 구분한 다음, 해당 정보를 지닌 학생 객체를 생성하고, 객체들의 정보를 "output.txt"에 다음과 같이 write 하기.
- 다음과 같은 Student 클래스를 구현
		
##### <필드>
	- private int ID;
	- private String name;
	- private int score;
	
##### <메소드>
	- 생성자
	- accessor 및 mutator
	- 기타 필요한 method (예: toString())

 - 예외처리를 위한 ScoreException 클래스를 
	
#### Source Code
#### 실행결과
	
</div>
</details>

<details>

<summary> ✏ 패키지 </summary>
<div markdown="1">
	
## 자바의 패키지(package)
	
#### 패키지란?
- 서로 관련된 클래스와 인터페이스의 컴파일 된 클래스 파일들을 하나의 디렉터리에 묶어 놓은 것
- 하나의 응용프로그램은 여러개의 패키지로 작성 가능
	- 하나의 패키지로 만들고 모든 클래스 파일을 넣어 둘 수도 있음
- 패키지는 jar 파일로 압출할 수 있음
	- 예) JDK에서 제공하는 표준 패키지는 rt.jar에 압축

#### 패키지 사용하기, import 문

- 다른 패키지에 작성된 클래스 사용
	- import를 이용하지 않는 경우
		- 소스 내에서 패키지 이름과 클래스 이름의 전체 경로명을 써주어야 함
	- import 키워드를 이용하는 경우
		- 소스의 시작 부분에 사용하려는 패키지 명시
			- 소스에는 클래스 명만 명시하면 됨
		- 특정 클래스의 경로명만 포함하는 경우
			- import javautilScanner;
		- 패키지 내의 모든 클래스를 포함시키는 경우
			- import javautil*;
			- *는 현재 패키지 내의 클래스만을 의미하며 하위 패키지의 클래스까지 포함하지 않는다.
	
#### 패키지의 특징
- 패키지 계층구조
	- 클래스나 인터페이스가 넘 많아지면 관리의 어려움
	- 관련된 클래스 파일을 하나의 패키지로 계층화하여 관리 용이
- 패키지별 접근 제한
	- default로 선언된 클래스나 멤버는 동일 패키지 내의 클래스들이 자유롭게 접근하도록 허용
- 동일한 이름의 클래스와 인터페이스의 사용 가능
	- 서로 다른 패키지에 이름이 같은 클래스와 인터페이스 존재 가능
- 높은 소프트웨어 재사용성
	- 오라클에서 제공하는 자바 API는 패키지로 구성되어 있음
	- java.lang, java.io 등의 패키지들 덕분에 일일이 코딩하지 않고 입출력 프로그램을 간단히 작성할 수 있음
	
#### 주요 패키지
- java.lang
	- 자바 language 패키지
		- 스트링 수학 함수, 입출력 등 자바 프로그래밍에 필요한 기본적인 클래스와 인터페이스
	- 자동으로 import 됨 -> import 문 필요 없음
- java.util
	- 자바 유틸리티 패키지
		- 날짜, 시간, 벡터, 해시맵 등과 같은 다양한 유틸리티 클래스와 인터페이스 제공
- java.io
	- 키보드, 모니터, 프린터, 디스크 등에 입출력을 할 수 있는 클래스와 인터페이스 제공
- java.awt
	- 자바 GUI 프로그래밍을 위한 클래스와 인터페이스 제공
- javax.swing
	- 자바 GUI 프로그래밍을 위한 스윙 패키지
	
#### Object 클래스
- 특징
	- java.lang 패키지에 포함
	- 자바 클래스 계층 구조의 최상위에 위치
	- 모든 클래스의 수퍼 클래스
	
-  주요 메소드
	
| 메소드 | 설명 |    
| :---: | :----: |    
| protected Object clone() | 현 객체와 똑같은 객체를 만들어 리턴. |    
| boolean equals(Object obj) | obj가 가리키는 객체와 현재 객체가 비교하여 같으면 ture 리턴. |
| Class getClass() | 현 객체의 런타임 클래스를 리턴. |
| int hashCode() | 현 객체에 대한 해시 코드 값 리턴. |
| String toString() | 현 객체에 대한 스트링 표현을 리턴.|
| void notify() | 현 객체에 대해 대기하고 있는 하나의 스레드를 깨운다. |
| void notifyAll() | 현 객체에 대해 대기하고 있는 모든 스레드를 깨운다. |
| void wait() | 다른 스레드가 깨울 때까지 현재 스레드를 대기하게 한다. |
	
#### 객체를 문자열로 변환
- String toString()
	- 객체를 문자열로 변환()
	- Object 클래스에 구현된 toString()이 반환하는 문자열
		- 클래스 이름@객체의 hash code
	- 각 클래스는 toString()을 오러라이딩하여 자신만의 문자열 리턴 가능
- 컴파일러에 의한 자동 변환
	- '객체 + 문자열' -> '객체.toString() + 문자열'로 자동 변환
	
#### Wrapper 클래스

- 자바의 기본 타입을 클래스화한 8개 클래스
	
| 기본 </br> 데이터 타입 | byte | short| int | long | char | float | double| boolean |
| :---: | :----: | :----: | :----: | :----: | :----: | :----: | :----: | :----: |
	
| Wrapper </br> 클래스 타입 | Byte | Short| Integer | Long | Character | Float | Double| Boolean |
| :---: | :----: | :----: | :----: | :----: | :----: | :----: | :----: | :----: |
	
- 용도
	- 기본 데이터 타입의 객체화
		- 기본 데이터 타입: 변수 선언
		- Wrapper 클래스 타입: 레퍼런스 선언
	- 기본 타입의 값을 사용할 수 없고 객체만 사용하는 컬렉션 등에 기본 타입의 값을 Wrapper 클래스 객체로 만들어 사용

#### 박싱과 언박싱
- 박싱(boxing)
	- 기본 타입의 값을 Wrapper 객체로 변환하는 것
- 언박싱(unboxing)
	- Wrapper 객체에 들어 있는 기본 타입의 값을 빼내는 것
	
![image](https://user-images.githubusercontent.com/87464750/151351171-f29b94f5-a67a-4ce3-a4a9-147e4043632b.png)
	
#### String의 생성과 특징
- String - java.lang.String
	- String 클래스의 하나의 스트링만 표현

``` JAVA
// 스트링 리터럴로 스트링 객체 생성
String str1 = "abcd";
	
// String 클래스의 생성자를 이용하여 스트링 생성
char data[] = {'a', 'b', 'c', 'd'};
String str2 = new String(data);
String str3 = new String("abcd");//str2와 str3은 모두 "abcd" 스트링
``` 
	
- String 생성자
	
| 생성자 | 설명 |    
| :---: | :----: |    
| String() | 빈 스트링 객체 생성 |    
| String(char[] value) | 문자 배열에 포함된 문자들을 스트링 객체로 생성 |
| String(String original) | 인자로 주어진 스트링과 똑같은 스트링 객체 생성 |
| String(StringBuffer buffer) | 스트링 버퍼에 포함된 문자들을 스트링 객체로 생성 |
	
#### 스트링 리터럴과 new String()

- 스트링 생성
	- 단순 리터럴로 생성, String s = "Hello";
		- JVM의 String 리터럴 테이블에 저장
	- String 객체로 생성, String t = new String("Hello");
		- 힙에 String 객체 생성
	
#### 스트링 객체의 주요 특징
- 스트링 객체는 수정 불가능
- ==과 equals()
	- 두 스트링을 비교할 때 반드시 equals()를 사용하여야 함
		- equals()는 내용을 비교하기 때문

#### 주요 메소드

| 메소드 | 설명 |    
| :---: | :----: |    
| char charAt(int index) | 저장된 index 엔덱스에 있는 문자 값 리턴 |    
| int codePointAt(int index) | 저장된 index 인덱스에 있는 유니코드 값 리턴 |
| int compareTo(String anotherString) | 두 스트링을 사전적 순서를 기준으로 비교, 두 스트링이 같으면 0, </br> 현 스트링에 지정된 스트링보다 사전적으로 먼저 나오면 음수, </br> 아니면 양수를 리턴|
| String conact(String str) | str 스트링을 현재 스트링 뒤에 덧붙인 스트링 리턴 |
| boolean contains(CharSequence s) | s에 지정된 일련의 문자들을 포함하고 있으면 ture 리턴 |    
| int lenght() | 스트링의 길이 리턴 |
| String replace(Charsequece target, Charsequence replacement) | target이 지정하는 일련의 문자들을 replacement가 지정하는 문자들로 변경한 스트링 리턴 |
| String[] split(String regex) | 정규직 regex에 일치하는 부분을 중심으로 스트링을 분리하고 분리된 스트링을 배열에 저장하여 리턴 |
| String subString(int beginIndex) | beginIndex 인덱스부터 시작하는 서브 스트링 리턴 |    
| String toLowerCase() | 스트링을 소문자로 변경한 스트링 리턴 |
| String toUpperCase() | 스트링을 대문자로 변경한 스트링 리턴|
| String trim() | 스트링 앞뒤의 공백 문자들을 제거한 스트링 |
	
#### Math 클래스

- 기본적인 산술 연산을 수행하는 메소드 제공
	- java.lang.Math
	- 모든 메소드는 static으로 선언
		- 클래스 이름으로 바로 호출 가능

| 메소드 | 설명 |    
| :---: | :----: |    
| static double abs(double a) | 실수 a의 절댓값 리턴 | 
| static double cos(double a) | 실수 a의 cosine 값 리턴|   
| static double sin(double a) | 실수 a의 sine 값 리턴 |   
| static double tan(double a) | 실수 a의 tangent 값 리턴 |   
| static double exp(double a) | e^3 값 리턴 |   
| static double ceil(double a) | 실수 a보다 크거나 같은 수 중에서 가장 작은 정수를 실수 타입으로 리턴 |   
| static double max(double a, double b) | 두 수 a, b 중에서 큰 수 리턴 |   
| static double min(double a, double b) | 두 수 a, b 증에서 작은 수 리턴|   
| static double random() | 0.0보다 크거나 같고 1.0보다 작은 임의의 실수 리턴 |   
| static double rint(double a) | 지정된 실수 a에 가장 근접한 정수를 실수 타입으로 리턴 |   
| static long round(double a) | 실수 a를 소수 첫째 자리에서 반올림한 정수를 long 타입으로 반환 |   
| static double sqrt(double a) | 실수 a의 제곱근 리턴 |

</div>
</details>

<details>

<summary> ✏ 제네릭과 컬렉션 </summary>
<div markdown="1">

## 컬렉션(collection)의 개념
- 요소(element)라고 불리는 가변 개수의 객체들의 저장소
	- 객체들의 컨테이너라고도 불림
	- 요소의 개수에 따라 크기 자동 조절
	- 요소의 삽입, 삭제에 따른 요소의 위치 자동 이동
- 고정 크기의 배열을 다루는 어려움 해소
- 다양한 객체들의 삽입, 삭제, 검색 등의 관리 용이

#### 컬렉션과 제네릭
- 컬렉션은 제네릭(generics) 기법으로 구현됨
- 컬렉션의 요소는 객체만 가능
	- 기본적으로 int, char, double 등의 기본 타입 사용 불가하지만, JDK 1.5부터 자동 박싱/언박싱 기능으로 기본 타입 사용 가능
- 제네릭
	- 특정 타입만 다루지 않고, 여러 종류의 타입으로 변신할 수 있도록 클래스나 메소드를 일반화시키는 법
	- < E >, < K >, < V > : 타입 매개 변수
- 제네릭 클래스 사례
	- 제네릭 벡터: Vector< E >
	- E에 특정 타입으로 구체화
	- 정수만 다루는 벡터 Vector< Integer >
	- 문자열만 다루는 벡터 Vector< String >

#### 제너릭의 기본 개념
- 모든 종류의 데이터 타입을 다룰 수 있도록 일반화된 타입 매개 변수로 클래스나 메소드를 작성하는 기법
	- C++의 템플릿(template)과 동일

#### Vector< E >
##### Vector< E >의 특성
- java.util.Vector
	- < E >에서 E 대신 요소로 사용할 특정 타입으로 구체화
- 여러 객체들을 삽입, 삭제, 검색하는 컨테이너 클래스
	- 배열의 길이 제한 극복
	- 원소의 개수가 넘쳐나면 자동으로 길이 조절
- Vector에 삽입 가능한 것
	- 객체,  null
	- 기본 타입은 박싱/언박싱으로 Wrapper 객체로 만들어 저장
- Vector에 객체 삽입
	- 벡터의 맨 뒤에 객체 추가
	- 벡터 중간에 객체 삽입
- Vector에서 객체 삭제
	- 임의의 위치에 있는 객체 삭제 가능: 객체 삭제 후 자동 자리 이동

#### Vector<E> 클래스이 주요 메소드
	
| 메소드 | 설명 |    
| :---: | :----: |    
| boolean add(E element) | 벡터의 맨 뒤에 element 추가 | 
| void add(int index, E element) | 인덱스 index에 element|   
| int capacity() | 벡터의 현재 용량 리턴 |   
| boolean addAll(Collection< ? extends E > c) | 컬렉션 c의 모든 요소를 벡터의 맨 뒤에 추가|   
| void clear() | 벡터의 모든 요소 삭제 |   
| boolean contains(Object o) | 벡터가 지정된 객체 o를 포함하고 있으면 true 리턴 |   
| E elementAt(int index) | 인덱스 index의 요소 리턴 |   
| E get(int index) | 인덱스 index의 요소 리턴|   
| int indexOf(Object o) | o와 같은 첫 번째 요소의 인덱스 리턴, 없으면 -1 리턴 |   
| boolean isEmpty() | 벡터가 비어 있으면 true 리턴 |
| E remove(int index) | 인덱스 index의 요소 삭제 |
| boolean remove(Object o) | 객체 o와 같은 첫번째 요소를 벡터에서 삭제 |   
| void removeAllElements() | 벡터의 모든 요소를 삭제하고 크기를 0으로 만듦 |   
| int size() | 벡터가 포함하는 요소의 개수 리턴 |
| Object[] toArray() | 벡터가 모든 요소를 포함하는 배열 리턴 |

#### ArrayList< E >의 특성
##### ArrayList< E >의 특성

- java.util.ArrayList, 가변 크기 배열을 구현한 클래스
	- < E > 에서 E 대신 요소로 사용할 특정 타입으로 구체화
- ArrayList에 삽입 가능한 것
	- 객체, null
	- 기본 타입은 박싱/언박싱으로 Wrapper 객체로 만들어 저장
- ArrayList에 객체 삽입/삭제
	- 리스트의 맨 뒤에 객체 추가
	- 리스트의 중간에 객체 삽입
	- 임의의 위치에 있는 객체 삭제 가능
- 벡터와 달리 스레드 동기화 기능 지원하지 않음
	- 다수의 스레드가 동시에 ArrayList에 접근할 때 충돌 발생
	- 멀티 스레드 프로그램이 아니라면 더 가벼운 ArrayList 사용

#### Array< E > 클래스이 주요 메소드
| 메소드 | 설명 |    
| :---: | :----: |  	
| boolean add(E element) | ArrayList의 맨 뒤에 element 추가 |
| void add(int index, E element) | 인덱스 index에 지정된 element 삽입 |
| boolean addAll(Collection< ? extends E > c) | 컬렉션 c의 모든 요소를 ArrayList의 맨 뒤에 추가 |
| void clear() | ArrayList의 모든 요소 삭제 |
| boolean contains(Object o) | ArrayList가 지정된 객체를 포함하고 있으면 true 리턴 |
| E elemetAt(int index) | index 인덱스의 요소 리턴 |
| E get(int index) | index 인덱스의 요소 리턴 |
| int indexOf(Object o) | o와 같은 첫번째 요소의 인덱스 리턴, 없으면 -1 리턴 |
| boolean isEmpty() | ArrayList가 비어있으면 true 리턴 |
| E remove(int index)| index 인덱스의 요소 삭제 |
| boolean remve(Object o) | o와 같은 첫 번째 요소를 ArrayList에서 삭제 |
| int size() | ArrayList가 포함하는 요소의 개수 리턴 |
| Object[] toArray() | ArrayList의 모든 요소를 포함하는 배열 리턴 |
	
#### LinkedList< E >
##### LinkedList< E >의 특성
- java.util.LinkedList
- List 인터페이스를 구현한 컬렉션 클래스
- Vector, ArrayList 클래스와 매우 유사하게 작동
- 요소 객체들은 양방향으로 연결되어 관리됨
- 요소 객체는 맨 앞, 맨 뒤에 추가 가능
- 요소 객체는 인덱스를 이용하여 중간에 삽입 가능
- 맨 앞이나 맨 뒤에 요소를 추가하거나 삭제할 수 있어 스택이나 큐로 사용 가능
- ArrayList는 배열이므로 요소들이 연속된 메모리 영역에 저장(읽고 쓰기가 빠르나, 추가, 삭제가 느릴 수 있음)되는 반면, LinkedList는 리스트이므로 요소들이 메모리 영역에 산재되어 저장되고 포인터로 연결

#### 컬렉션의 순차 검색을 위한 Iterator
##### Iterator< E > 인터페이스
- Vector< E >, ArrayList< E >, LinkedList< E >가 상속받는 인터페이스
	- 리스트 구조의 컬렉션에서 요소의 순차 검색을 위한 메소드 포함
	- Iterator< E > 인터페이스 메소드
	
| 메소드 | 설명 |    
| :---: | :----: |  	
| boolean hashNext() | 다음 반복에서 사용될 요소가 있으면 true 리턴 |
| E next() | 다음 요소 리턴 |
| void remove() | 마지막으로 리턴된 요소 제거 |
	
- iterator() 메소드
	- iterator()를 호출하면 Iterator 객체 반환
	- Iterator 객체를 이용하여 인덱스 없이 순차적 검색 가능
	
``` JAVA
Vector< Integer > v = new Vector< Integer>();
Iterator< Integer > it = v.iterator();
while(it.hashNext()){//모든 요소 방문
	int n = it.next();//다음 요소 리턴
	...
	}
```

#### Collections 클래스 활용
##### Collections 클래스
- java.util 패키지에 포함
- 컬렉션에 대해 연산을 수행하고 결과로 컬렉션 리턴
- 모든 메소드는 static 타입
- 주요 메소드
	- 컬렉션에 포함된 요소들을 정렬하는 sort() 메소드
	- 요소의 순서를 반대로 하는 reverse() 메소드
	- 요소들의 최대, 최소값을 찾아내는 max(), min() 메소드
	- 특정 값을 검색하는 binarySearch() 메소드

#### 제네릭 만들기
##### 제네릭 클래스와 인터페이스
	
- 클래스나 인터페이스 선언부에 일반화된 타입 추가
``` JAVA
public class MyClass<T>{//제네릭 클래스 MyClass 선언, 타입 매개 변수 T
	T val;//val의 타입은 T
	void set(T a){
		val = a;//T 타입의 값 a를 val에 지정
	}
	T get() {
		return val;//T 타입의 값 val 리턴
	}
}
```
	
- 제네릭 클래스 레퍼런스 변수 선언
	
``` JAVA
MyClass<String> s;
List<Integer> li;
Vector<String> vs;
```

#### 제네릭 객체 생성 - 구체화(specialization)
##### 구체화
- 제네릭 타입의 클래스에 구체적인 타입을 대입하여 객체 생성
- 컴파일러에 의해 이루어짐
``` JAVA
MyClass<String> s = new MyClass<String>();//제네릭 타입 T에 String 지정
s.set("Hello");
System.out.println(s.get());//"hello" 출력
	
MyClass<Integer> n =  new MyClass<Integer> ();//제네릭 타입 T에 Integer 지정
n.set(5);
System.out.println(n.get());//숫자 5 출력
```
- 구체화된 MyClass<String>의 소스코드
``` JAVA 
public class MyClass<String>{
	String val;
	void set(String a){
		val = a;
	}
	String get(){
		return val;
	}
}
```
#### 구체화 오류
- 타입 매개 변수에 기본 타입은 사용할 수 없음
``` JAVA 
Vector<int> vi =  new Vector<int> ();//컴파일 오류. int 사용 불가
```
- 수정
``` JAVA 
Vector<Integer> vi =  new Vector<Integer> ();//정상코드
```

#### 타입 매개 변수
##### 타입 매개 변수
- ' < ' 와 ' > ' 사이에 하나의 대문자를 타입 매개 변수로 사용
- 많이 사용하는 타입 매개 변수 문자
	- E: Element를 의미하여 컬렉션에서 요소를 표시할때 많이 사용한다
	- T: Type을 의미한다.
	- V: Value를 의미한다.
	- K: Key를 의미한다.
- 타입 매개변수가 나타내는 타입의 객체 생성 불가
- 타입 매개 변수는 나중에 실제 타입으로 구체화
- 어떤 문자도 매개 변수로 사용 가능
	
#### 제네릭과 배열
##### 제네릭에서 배열의 제한
- 제네릭 클래스 또는 인터페이스 배열을 허용하지 않음
- 제네릭 타입의 배열도 허용되지 않음
- 타입 매개변수의 배열에 레퍼런스는 허용

#### 제네릭 메소드
##### 제네릭 매소드 선언 가능
	
``` JAVA 
class GenericMethodEx{
	static <T> void toStack(T[] a, GStack<T> gs){
		for(int i - 0; i< a.length; i++){
			gs.push(a[i]);
		}
	}
}
```

- 제네릭 메소드를 호출할 때는 컴파일러가 메소드의 인자를 통해 이미 타입을 알고 있으므로 타입을 명시하지 않아도 됨
``` JAVA 
String[] sa = new String[100];
GStack<String> gss = new GStack<String> ();
GenericMethodEx.toStack(sa, gss);//타입 매개 변수 T를 String 으로 유추함
```
- sa는 String[], gss는 GStack<String> 타입으로 T를 String으로 유추

## 📝10.1

#### 10-1. Vector, Collection을 활용한 프로그램
- Size가 20인 벡터에 100 이상 1000이하의 정수 20개를 각각 저장한 후, 가장 큰 수와 가장 작은 수를 출력하는 프로그램.
	- 100이상 1000 이하의 정수는 random()을 이용하여 생성.
	- 가장 큰 수를 찾는 findMax() method를 별도로 구현.
		- Collections 클래스의 max() method를 사용하지 말 것.
	- 가장 작은 수와 정렬은 Collections 클래스의 min()과 sort() method를 사용.
	
#### Source Code
#### 실행결과
	
## 📝10.2

#### 10-2. ArrayList를 활용한 프로그램
- " data.txt "한 라인씩 정보를 read한 다음 학생 객체를 생성하고, 각 학생 객체를 ArrayList에 저장하는 main() 프로그램 구현.

#### Source Code
#### 실행결과
	
## 📝10.3

#### 10-3. 객체의 정렬
- 실습 10-2에서 얻은 ArrayList에 담긴 학생 객체들을 "점수"의 내림차순으로 정렬한 후 출력.
	- 출력을 위해 Student 클래스에는 반드시 toString() 함수 (재)구현해야 함.
- Collections의 sort() 함수를 이용.
	
#### Source Code
#### 실행결과

</div>
</details>

<details>

<summary> ✏ 스레드와 멀티태스킹 </summary>
<div markdown="1">
	
#### 멀티태스킹(multi-tasking) 개념
- 멀티태스킹
	- 하나의 응용프로그램이 여러 개의 작업(태스크)를 동시에 처리

#### 스레드와 프로세스
- 공통점
	- 순차적으로 실행되는 프로그램의 흐름
- 차이점
	- 프로세스는 독립된 실행 단위
		- 운영체제로부터 동작에 필요한 자원을 독립적으로 할당받음
		- 독립적이므로 서로 정보를 주고받기 어려움
	- 스레드는 한 프로세스 내의 실행 단위
		- 한 프로세스에게 주어진 자원을 함께 사용
			- 단, 스택만은 스레드별로 주어져야 함
		- 대신 서로 정보를 주고받기 쉬움
- JAVA는 멀티스레딩만 지원
	
#### 자바 스레드(Thread)란?
- 자바 스레드
	- JVM에 의해 스케쥴이 되는 실행 단위
- JVM과 멀티스레드의 관계
	- 하나의 JVM은 하나의 자바 응용프로그램만 실행
		- 자바 응용프로그램이 시작될 때 JVM이 함께 실행됨
		- 자바 응용프로그램이 종료하면 JVM도 함께 종료함
	- 하나의 응용프로그램은 하나 이상의 스레드로 구성 가능

#### 스레드 만들기
- 스레드 실행을 위해 개발자가 하는 작업
	- 스레드가 수행할 소스코드 작성
		- Thread 클래스이 public void run() 메솓
	- JVM에게 스레드를 생성하고 해당 소스 코드를 실행하도록 요청
- 자바에서 스레드 만드는 방법들
	- java.lang.Thread를 상속한 클래스 정의
	- java.lang.Rinnable 인터페이스 구현
	
#### Thread 클래스를 이용한 스레드 생성
- 스레드 클래스 작성
	- Thread 클래스 상속, 새 클래스 작성
- 스레드 코드 작성
	- run() 메소드 오버라이딩
		- run() 메소드를 스레드 코드라고 부름
		- run() 메소드에서 스레드 실행 시작
- 스레드 객체 생성
- 스레드 시작
	- start() 메소드 호출
		- 스레드로 작동 시작
		- JVM에 의해 스케쥴이 되기 시작함
	
``` JAVA 
class TimerThread extends Thread{
	int n = 0;
	//스레드 크래스 정의
	public void run(){
		while(true){//무한루프를 실행
			//스레드 코드 작성: 1초에 한번씩 n을 증가시켜 콘솔에 출력
			System.out.ptintln(n);
			n++;
			try{
				sleep(1000);//1초동안 sleep
			}
			catch(InterruptedException e){return;}
		}
	}
}
	
public class TestThread{
	public static void main(String [] args){
		TimerThread th = new TimerThread();//스레드 객체 생성
		th.start();//스레드 시작
	}
}
```

#### 스레드 주의 사항
- run() 메소드가 종료하면 스레드는 종료한다.
	- 스레드가 계속 존재하게 하려면 run() 메소드 내에 무한 루프가 실행되어야 한다.
- 한번 종료한 스레드는 다시 시작시킬 수 없다.
	- 스레드 객체를 생성하여 다시 스레드로 등록하여야 한다.
- 한 스레드에서 다른 스레드를 강제 종료할 수 있다.
	
#### Runnable 인터페이스로 스레드 만들기
- 스레드 클래스 작성
	- Runnable 인터페이스 구현하는 새 클래스 작성
- 스레드 코드 작성
	- run() 메소드 오버라이딩
		- run() 메소드를 스레드 코드라고 부름
		- run() 메소드에서 스레드 실행 시작
- 스레드 객체 생성
- 스레드 시작
	- start() 메소드 호출
	
``` JAVA 
//Runnable을 클래스로 구현
class TimerRunnable implements Runnable{
	int n = 0;
	public void run(){
		while(true){//무한루프를 실행
			//스레드 코드 작성: 1초에 한번씩 n을 증가시켜 콘솔에 출력
			System.out.ptintln(n);
			n++;
			try{
				sleep(1000);//1초동안 sleep
			}
			catch(InterruptedException e){return;}
		}
	}
}
	
public class TestThread{
	public static void main(String [] args){
		TimerThread th = new TimerThread();//스레드 객체 생성
		th.start();//스레드 시작
	}
}
```
	
#### 스레드 정보
| 메소드 | 타입 | 내용 |    
| :---: |:---: | :----: |  	
| 스레드 이름 | 스트림 | 스레드의 이름으로서 사용자가 지정|
| 스레드 ID | 정수 | 스레드 고유의 식별자 번호|
| 스레드의 PC(Program Count) | 정수 | 현재 실행 중인 스레드 코드의 주소|
| 스레드 상태 | 정수 | NEW, RUNNABLE, WAITING, TIMED_WAITING, BLOCK, TERMINATED 등 6개 상태 중 하나|
| 스레드 우선순위 | 정수 | 스레드 스케줄링 시 사용되는 우선순위 값으로서 1 ~ 10 사이의 값이며 10이 최상위 우선순위|
| 스레드 그룹 | 정수 | 여러 개의 자바 스레드가 하나의 그룹을 형성할 수 있으며 이 경우 스레드가 속한 그룹|
| 스레드 레지스터 스택 | 메로리 블록 | 스레드가 실행되는 동안 레지스터들의 값|
	
#### Thread 클래스의 메소드
	
| 메소드 | 설명 |    
| :---: | :----: |  	
| 생성자 | Thread() </br> Thread(Runnable target) </br> Thread(String name) </br> Thread(Runnable target, String name)|
| 스레드 시작시키기| void start() |
| 스레드 코드 | void run() |
| 스레드 Sleep | static void sleep(long miils) |
| 다른 스레드 죽이기 | void interrupt() |
| 다른 스레드에게 양보 | static void yield() |
| 다른 스레드가 죽을때까지 기다리기 | void join() |
| 현재 스레드 객체 알아내기 | static Thread currentThread() |
| 스레드 ID 알아내기 | long getId() |
| 스레드 이름 알아내기 | String getName() |
| 스레드 우선순위 값 알아내기 | int getPriority() |
| 스레드의 상태 알아내기 | Thread.State getState() |
	
#### 자바 응용프로그램의 기본 스레드
- JVM이 시작되면 기본 스레드가 생성되고 main() 메소드 수행
- 기본 스레드가 종료되어도 다른 스레드가 남아 있으면 프로그램은 종료되지 않음
	
#### 스레드 동기화(Thread Synchronization)
- 멀티스레드 프로그램 작성지 주의점
	- 다수의 스레드가 공유 데이터에 동시에 접근하는 경우
		- 공유 데이터의 값에 예상치 못한 결과 발생 가능
- 스레드 동기화
	- 멀테스레드의 공유 데이터의 동시 접근 문제 해결책
		- 공유데이터에 접근하고자 하는 모든 스레드를 한 줄로 세움
		- 한 스레드가 공유 데이터에 대한 작업을 끝낼 때까지 다른 스레드가 그 데이터에 접근하지 못하도록 함
	
#### synchronized 키워드
- synchronized 키워드
	- 한 스레드만이 독점적으로 실행되어야 하는 코드를 표시하는 키워드
- synchronized 키워드 사용 가능한 부분
	- 메소드 전체 혹은 코드 블록
- synchronized 부분이 실행될 때
	- 실행 스레드는 그 객체를 독점적으로 사용할 수 있는 권한 획득
	- 다른 스레드는 그 스레드가 권한을 내놓을 때까지 대기
	
## 📝11.1

#### Prime Number 찾기
- 1부터 10000 번째의 Prime number를 찾기
- 10000개의 prime numver를 가지는 array를 생성함
- Thread를 10개 생성
	- 각각의 Thread는 Prime number를 찾음
	- 찾은 prime number를 array에 순차적으로 추가함

#### Source Code
#### 실행결과
	
</div>
</details>
	
<details>

<summary> ✏ 네트워크 </summary>
<div markdown="1">
	
#### TCP/IP 소개
##### IP
- 인터넷에 연결된 컴퓨터 사이에서 데이터의 이동 경로를 찾아주는 길찾기 프로토콜

##### TCP
- 인터넷으로 연결된 컴퓨터 사이에서 데이터가 에러 없이 전달되도록 해주는 프로토콜
- 대부분의 응용프로그램이 사용
	- e-mail, 카카오톡, 웹(HTTP) 등
	
- Wi-Fi, LTE, 이더넷 등으로 인터넷에 연결되고, TCP/IP 프로토콜이 구현된 컴퓨터만이 인터넷을 통한 통신 가능
	
#### IP 주소
- 인터넷에 연결된 컴퓨터를 식별하는 고유의 이름
	- 32비트 숫자(IP 버전 4 기준)
- 사람이 기억하기 쉽도록 8비트씩 끊어 10진수로 변환하여 읽을때가 많음
	- ex) 192.156.11.15
- 그래도 기억하기 어려우므로, 도메인(www.naver.com)으로 하기도 함
##### 내 컴퓨터의 IP 주소 확인하기
- 내 컴퓨터의 윈도우에서 명령창을 열어 ipconfig 명령 수행
	
#### 포트
- 하나의 컴퓨터에서 실행되는 여러 통신 프로그램을 식별하기 위한 숫자
- 잘알려진 포트(well-know ports)
	- 시스템이 사용하는 포트 번호
	- 잘 알려진 응용프로그램에서 사용하는 포트번호
		- 0부터 1023 사이의 포트번호
		- ex) 텔넷 23, HTTP 80, FTP 21
	- 잘 알려진 포트 번호는 개발자가 사용하지 않는것이 좋음
		- 충돌 가능성이 있다

#### 네트워크 프로그래밍 = 소켓 프로그래밍
##### 소켓(socket)
- 파일을 다루려면 그 파일과 연결된 File 객체 필요
- 다른 컴퓨터에서 실행되는 프로그램과 통신하려면 그 프로그램의 소켓과 연결된 Socket 객체 필요
- 소켓의 이름
	- 프로그램이 실행되는 컴퓨터의 IP 주소 + 그 컴퓨터에서 실행되는 프로그램을 식별하는 포트 번호의 결합
	
#### 네트워크 프로그래밍
##### 클라이언트 - 서버 구조
- 네트워크 프로그램의 전형적인 구조
- 서비스를 제공하는 서버 프로그램과 서비스를 받는 클라이언트 프로그램을 쌍으로 개발
- 서버는 한 번 실행되면 거의 종료되지 않고 클라이언트의 접속을 기다림
- 클라이언트는 필요할 때 실행되더 서버에 접속한 후 서비스를 받고나서 종료
	
#### Socket 클래스
- java.net 패키지에 포함
- 주요 생성자
	
| 메소드 | 설명 |    
| :---: | :----: |  	
| Socket(InetAddress address, int port) | 소켓을 생성하여 지정된 IP 주소와 포트 번호에 연결한다. |
| Socket(String host, int port)| 소켓을 생성하여 지정된 호스트와 포트 번호에 연결한다. 호스트 이름이 null인 경우는 루프백(loopback) 주소로 가정한다. |
- C언어의 소켓 라이브러리는 소켓을 생성하고 명시적으로 서버 소켓에 연결 요청하는 반면, JAVA의 소켓 API는 소켓 생성시 자동으로 서버 소켓에 연결 요청
- 주요 메소드
	
| 메소드 | 설명 |    
| :---: | :----: |  	
| void close() | 소켓을 닫는다. |
| void connect(SoketAddress endpoint)| 소켓을 서버에 연결 |
| InetAddress getInetAddress() | 소켓이 연결한 서버의 주소 반환 |
| InputStream getInputStream()| 소켓에 대한 입력 스트림 반환 |
| InetAddress getLocalAddress() | 소켓이 연결된 로컬 주소 반환 |
| int getLocalPort() |소켓이 연결된 로컬 포트 번호 반환 |
| int getPort() | 소켓이 연결한 서버의 포트 번호 반환|
| OutputStream getOutputStream() | 소켓에 대한 출력 스트림 반환 |
| boolean isBound() | 소켓이 로컬 주소에 연결되어 있으면 true 반환 |
| boolean isConnected() | 소켓이 서버에 연결되어 있으면 true 반환 |
| boolean isClosed() | 소켓이 닫혀있으면 true 반환|
| void setSoTimeout(int timeout)| 데이터 일기 타임아웃 시간 지정. 0이면 타임아웃 해제 |
	
#### 소켓 사용 절차
- 소켓 생성 및 서버 접속
``` JAVA 
Soket dlientSocket = new Socket("128.12.1.1", 5550);
```
- 입출력 스트림 얻기
``` JAVA 
BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
BufferedWriter out = new BufferedWriter(new OuputStreamWriter(clientSocket.getOutputStream()))
```
- 데이터 송신
	- flush()를 호출하면 스트림 속에 데이터를 남기지 않고 모두 전송
``` JAVA 
out.wrte("Hello" + "\n");
out.flush();
```
- 데이터 수신 
``` JAVA 
int x = in.read(); //서버로부터 한 개의 문자 수신
String line = in.readline(); //서버로부터 한 해으이 문자열 수신
```
- 소켓 닫기
``` JAVA 
clinetSocket.close();
```

#### ServerSocket 클래스
##### ServerSocket 클래스
- java.net 패키지에 포함
- 데이터 송수신은 하지 않고 클라이언트 접속ㅂ만 받는 소켓
- 주요 생성자
	
| 생성자 | 설명 |    
| :---: | :----: | 
| ServerSocket(int port) | 소켓을 생성하여 지정된 포트 번호에 연결한다. |
	
- 주요 메소드
	- InputStream / OutputStream을 얻는 메소드가 없다.
	
| 메소드 | 설명 |    
| :---: | :----: | 
| Socket accept() | 연결 요청을 기다리다 연결 요청이 들어오면 수락하고 새 Socket 객체를 반환|
| void close() | 서버 소켓을 닫는다 |
| InetAddress getInetAddress() | 서버 소켓에 연결된 로컬 주소 반환|
| int getLocalPort() | 서버 소켓이 연결 요청을 모니터링하는 포트 번호 반환 |
| boolean isBound() | 서버 소켓이 로컬 주소에 연결되어있으면 true 반환|
| boolean isClosed() | 서버 소켓이 닫혀있으면 true 반환|
| void setSoTimeout(int timeout)| accept()에 대한 타임 아웃 시간 지정. 0이면 타임아웃이 해제|
	
#### 클라이언트와 서버 연결
- 클라이언트와 서버 연결
	- 서버는 ServerSocket으로 들어오는 연결 요청을 기다림.
	- 클라이언트 Socket이 서버의 ServerSocket에게 연결 요청.
	- 서버의 ServerSocket이 연결 요청 수락하고 새로운 Socket을 만들어 클라이언트 Socket과 연결

#### 서버 소켓 사용 절차
- 서버 소켓 생성
``` JAVA
ServerSocket serverSocket = new ServerSocket(5550);
```
- 클라이언트로부터 접속 기다림
	- accept() 메소드는 연결 요청이 오면 새로운 Socket 객체 반환
	- 다음 클라이언트를 기다리기 위해 다시 accept() 호출
``` JAVA
Socket socket = serverSocket.accept();	
```
- 실제 데이터 송수신은 생성된 Socket이 담당
	- Socket으로부터 InputStream / OutputStream을 얻어서 송수신
``` JAVA
BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
```
- 클라이언트와의 연결 종료
- 서버 역할 종료
``` JAVA
socket.close();
serverSocket.close();
```

#### URL을 이용한 웹 프로그래밍
- URL이란?
	- URL은 Uniform Resource Locator
	- 인터넷 상의 리소스에 대한 주소
- URL 구조
##### http : //www.naver.com/
	
http - 프로토콜 식별자(protocol indetifier)
	
//www.naver.com/ - 자원 이름(resource name)
	
#### 프로토콜 식별자
- 프로토콜 식별자
	- 인터넷 상의 파일을 가져올 때 사용되는 통신 프로토콜 이름
	- 종류: HTTP, FTP, TELNET 등
	- 대부분의 웹 브라우저들은 HTTP 외 다른 프로토콜도 지원

#### 자원 이름
- 자원 이름은 사용되는 프로토콜에 따라서 그 구성이 달라짐
- HTTP의 경우
##### http : //www.myhome.net /index.html : 8080

//www.myhome.net - 호스트 이름
	
/index.html - 파일 이름
	
: 8080 - 포트번호
	
#### 자바의 URL 클래스
- URL 클래스
	- java.net 패키지에 포함
	- 웹 상의 자원을 지정하는 URL을 나타냄

| 메소드 | 설명 |    
| :---: | :----: | 
| URL(String spec) | 문자열이 지정하는 자원에 대한 URL 객체를 생성 |
| URL(Strimg protocol, String hostm int port, String file) | 프로토콜 식별자, 호스트 주소, 포트 번호, 파일이 지정하는 자원에 대한 URL 객체 생성 |
| URL(String protocol, String host, String file)| 프로토콜 식별자, 호스트 주소, 파일 이름이 지정하는 자원에 대한 URL 객체 생성 |
| URL(URK context, String spec) | URL 객체 contex에 대한 상대 경로가 지정하는 자원에 대한 URL 객체 생성 |

- 주요 메소드
	
| 메소드 | 설명 |    
| :---: | :----: | 
| Object getContent() | URL의 컨텐트를 반환 |
| String getFile() | URL 주소의 파일 이름 반환 |
| String getHost() | URL 주소의 호스트 이름 반환 |
| String getPath() | URL 주소의 경로 부분 반환 |
| int getPort() | URL 주소의 포트 번호 반환 |
| int getLocalPort() | 소켓이 연결된 로컬 포트 번호 반환 |
| int getPort() | 소켓이 연결한 서버의 포트 번호 반환 |
| InputStream openStream() | URL에 대해 연결을 설정하고 이 연결로부터 입력을 받을 수 있는 InputStream 객체 반환 |
| URLConnection openConnection() | URL 주소의 원격 객체에 접속한 뒤 통신할 수 있는 URLConnection 객체 리턴 |
	
#### URL 객체 생성 방법
- 절대 경로로 URL 객체 생성
``` JAVA
URL homePage =  new URL("http://news.hankooki.com");
```
- 상대 경로로 URL 객체 생성
``` JAVA
URL opinion = new URL(homePage, "opinion/editorial.htm");
```
- 잘못된 주소의 URL을 입력하면 MalformedURLException 예외 발생
	
#### URL 객체를 이용하여 상대편으로부터 데이터 읽기
- URL 객체에서 데이터 읽기
	- URL 객체가 가리키는 주소에서 데이터를 가져올 때는 openStream() 메소드로 스트림 생성
	- openStream()이 리턴하는 InputStream 객체를 이용하여 일바 스트림 입력을 수행
</div>
</details>
	
<details>

<summary> ✏ GUI 컴포넌트와 스윙 </summary>
<div markdown="1">
	
#### 자바의 GUI
##### GUI의 목적
- 그래픽을 이용, 사용자에게 이해하기 쉬운 모양으로 정보 제공
- 사용자는 마우스나 키보드를 이용하여 쉽게 입력	
##### 자바 GUI 특징
- 강력한 GUI 컴포넌트 제공
- 쉬운 GUI 프로그래밍
##### 자바의 GUI 프로그래밍 방법
- GUI 컴포넌트와 그래픽 이용
	- AWT 패키지와 swing 패키지에 제공되는 메커니즘 이용
	- AWT - java.awt 패키지
	- Swing - javax.swing 패키지

#### AWT와 Swing 패키지
##### AWT
- 자바가 처음 나왔을때 함께 배포된 GUI 라이브러리
- java.awt 패키지
- 운영체제에 의존적
	- OS의 도움을 받아야 화면에 출력되며 동작하는 컴포넌트. 운영체제에 많은 부담
##### Swing
- AWT 기술을 기반으로 개선된 GUI 라이브러리
	- 모든 AWT 기능 + 추가된 풍부하고 화려한 고급 컴포넌트
- 클래스 이름이 J로 시작
- javax.swing 패키지
- Swing 컴포넌트는 운영체제에 의존하지 않음
	- 경량 컴포넌트

`AWT를 사용하면 OS마다 컴포넌트 모양이 달라지거나 Swing을 사용하면 항상 같은 모양 `
	
##### GUI 클래스 계층 
![image](https://user-images.githubusercontent.com/87464750/168545797-b09aa8e6-f70e-4a9e-ba8d-63820cfe897a.png)
	
#### 컴포넌트와 컨테이너
##### 컴포넌트
- 버튼, 텍스트 필드 등의 GUI 객체들
- Windows에서는 컨트롤이라고도 부름
##### 컨테이너
- 다른 컴포넌트를 포함할 수 있는 컴포넌트
- 다른 컨테이너에 포함될 수도 있음
	- Swing 컨테이너: JPanel, JFrame, JApplet, JDialog, JWindow
##### 최상위 컨테이너
- 다른 컨테이너에 속하지 않고 독립적으로 존재 가능한 컨테이너
	- 스스로 화면에 자신을 출력하는 컨테이너
	- JFrame, JDialog, JApplet
- 모든 컴포넌트는 컨테이너에 포함되어야 화면에 출력 가능
	
#### Swing GUI 프로그램 만들기
1. 프레임 만들기
2. 프레임에 스윙 컴포넌트 붙이기
3. main() 메소드 작성
	
- 스윙 프로그램을 작성하기 위한 import문
	- import java.awt.*; //그래픽 처리를 위한 클래스들의 경로명
	- import java.awt.event.*;// AWT 이벤트 사용을 위한 경로명
	- import javax.swing.*;// 스윙 컴포넌트 클래스들의 경로명
	- import javax.swing.event.*;// 스윙 이벤트를 위한 경로명
	
#### Swing 프레임
- 모든 Swing 컴포넌트를 담는 최상위 컨테이너
	- JFrame 타입의 객체
- Swing 프레임(JFrame)의 기본 구성
	- 프레임 - 스윙 프로그램의 기본 틀
	- 메뉴바 - 메뉴들이 부착되는 공간
	- 컨텐트 팬 - GUI 컴포넌트들이 부착되는 공간
	
#### 프레임 만들기
`다양한 방법이 있음`

1. main() 메소드에서 JFrame 객체 생성
2. JFrame을 상속받은 프레임 클래스 생성
3. JFrame을 상속받은 별도의 클래스 정의해도 됨
4. 무명 클래스로 정의해도 됨
	
#### 프레임에 컴포넌트 붙이는 다양한 방법
1. 컨텐트팬에 붙이기
``` JAVA
	JFrame frame = new Jframe();
	frame.getContentPane().add(new JButton("Click"));
```
프레임에 직접 붙이기
``` JAVA
	JFrame frame = new Jframe();
	frame.add(new JButton("Click"));
```
2. 컨텐트팬에 패널을 얹고 붙이기
``` JAVA
	JFrame frame = new Jframe();
	JPanel p = new JPanel();
	p.add(new JButton("Click"));
	frame.getContentPane().add(p);
```
3. 컨텐트팬을 패널로 바꾸고 붙이기
``` JAVA
	JFrame frame = new Jframe();
	JPanel p = new JPanel();
	p.add(new JButton("Click"));
	frame.setContentPane(P);
```	
</div>
</details>
	
<details>

<summary> ✏ 이벤트 처리 </summary>
<div markdown="1">
	
#### 이벤트 기반 프로그래밍
##### 이벤트 기반 프로그래밍
- 이벤트의 발생에 의해 프로그램 흐름이 결정되는 방식
- 이벤트가 발생하면 이벤트를 처리하는 루틴(이벤트 리스너) 실행
- 프로그램 내의 어떤 코드가 언제 실행될지 아무도 모름, 이벤트의 발생에 의해 전적으로 결정
	
##### 이벤트 처리 순서
- 이벤트 발생
- 이벤트 객체 생성
	- 현재 발생한 이벤트에 대한 다양한 정보를 가진 객체
- 이벤트 리스너 찾기
- 이벤트 리스너 호출
	- event 객체가 리스너에 전달됨
- 이벤트 리스너 실행
	
#### 이벤트 객체
##### 이벤트 객체란?
- 발생한 이벤트에 관한 다양한 정보를 가진 객체
- OS로부터 전달된 이벤트 정보를 기반으로 JVM이 자동 생성
- 이벤트가 발생한 컴포넌트에 등록된 이벤트 리스너로 전달됨
	
#### 이벤트 갹체에 포함된 정보
##### 이벤트 객체가 포함하는 정보
- 이벤트 종류
- 이벤트 소스
- 이벤트가 발생한 화면 좌표
- 이벤트가 발생한 컴포넌트 내 좌표
- 버튼이나 메뉴 아이템에 이벤트가 발생한 경우 버튼이나 메뉴 아이템의 문자열
- 클릭된 마우스 버튼 번호
- 마우스의 클릭 횟수
- 키가 눌러졌다면 키의 코드 값과 문자 값
- 체크박스, 라디오버튼 등과 같은 컴포넌트에 이벤트 발생하였다면 체크상태
	
##### 이벤트에 따라 조금씩 다른 정보 포함
- ActionEvent 객체: 액션 문자열
- MouseEvent 객체: 마우스의 위치 정보, 마우스 버튼, 함께 눌러진 키 정보 등
- ItemEvent 객체: 아이템의 체크 상태
	
##### 이벤트 소스 알아내기
- object EventObject.getSourve()
	- 발생한 이벤트의 소스 컴포넌트 리턴
	- Object 타입으로 리턴하므로 캐스팅하여 사용
	- 모든 이벤트 객체에 대해 적용
	
#### 이벤트 객체와 이벤트 소스

|이벤트 객체 | 이벤트 소스 | 이벤트가 발생하는 경우 |    
| :---: | :---: | :----: | 
| ActionEvent | JButton | 마우스로 버튼을 클릭하거나 키로 버튼을 선택한 경우 |
| | JList | 리스트 아이템을 더블클릭하여 리스트 아이템을 선책한 경우 |
| | JMenuItem | 메뉴 아이템 선택을 선택한 경우 |
| | JTextField|  텍스트 입력 중 < Enter > 키를 누른 경우 |
| ItemEvent | JCheckBox | 체크박스의 선택 혹은 해제|
| | JCheckBocMenuItem |  체크박스 메뉴 아이템이 선택 혹은 해제될 때 |
| |  JList |리스트 아이템이 선택될 때|
| KeyEvent | Component |  모든 컴포넌트에 대해, 컴포넌트가 포커스를 받거나 잃을때 |
|MouseEvent | Component | 모든 컴포넌트에 대해, 마우스 버튼이 눌러지거나 떼어질 때, 클릭될 때, 컴포넌트 위에 마우스가 올라갈 때, 올라간 마우스가 내려올 때, 마우스가 드래그될 때, 마우스가 단순 움직일 때|
| FoucusEvent| Component | 모든 컴포넌트에 대해, 컴포넌트가 포커스를 받거나 잃을 때  |
| TextEvent | TextField | 텍스트가 변경될 때|
| | TextArea | 텍스트가 변경될 때|
| WindowEvent | Window |  Window를 상속받는 모든 컴포넌트에 대해, 윈도우가 활성화, 비활성화, 아이콘화, 아이콘에서 복구될 때, 윈도우가 열리거나 닫힐 때, 윈도우가 종료될 때 등 |
| AdjustmentEvent| JScrollBar | 스크롤바를 사용자가 움직였을 때|
| ComponentEvent | Component |  모든 컴포넌트에 대해, 컴포넌트가 사라지거나, 나타나거나, 이동하거나 크기 변경될 때 |
| ContainerEvent | Container | Container에 컴포넌트가 추가 혹은 삭제되었을 때|



</div>
</details>
