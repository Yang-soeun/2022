# 📒JAVA

<details>

<summary> ✏ 06/07 </summary>
<div markdown="1">

**Java의 특징**
1. 자바의 모토
    
    : 한 번 프로그램을 작성하면 운영체제와 무관하게 실행 가능
    
    (WORA: Write once, Run Anywhere)
    
    플랫폼 독립적인 언어
    
2. 자바가상머신(Java Virtual Machine) -> 이게 있어서 플랫폼 독립적일 수 있다.
    
    : 컴파일된 바이트코드를 실행시킬 수 있는 소프트웨어

```

 소스코드 ------------------------------> 바이트 코드
 (Hello.java)    컴퍼일러(javac.exe)     (Hello.class)

```

**자바 소스 코드의 실행 과정**

1. `소스 파일(.java)`을 작성한 후 컴파일을 수행하면 자바 가상 머신상에서 동작하는 `바이트 코드(.class)`가 생성된다.
2. 이후 바이트 코드를 실행하면 자바 가상 머신은 운영체제에서 메모리를 할당받아 자바 프로그램을 실행한다.

**컴파일 후 생성되는 바이트 코드(.class)**
``` JAVA
class A{  //A.class
}
class B{  //B.class
}
class C{  //C.class
	class D{  //C$D.class
	}
}
public class ByteCodeFiles{  //ByteCodeFiles.class
	public static void main(String[] args)
}
```
**자바 메모리 구조**

![image](https://github.com/Yang-soeun/Yang-soeun/assets/87464750/1406d0b9-fa0d-4be1-95a5-85eada2089aa)

- 실제 데이터 값의 저장 위치
    - 기본 자료형은 스택 메모리에 생성된 공간에 실제 변숫값을 저장하는 반면, 참조 자료형은 실제 데이터
      값은 힙 메모리에 저장하고, 스택 메모리의 변수 공간에는 실제 변숫값이 저장된 힙 메모리의 위치값을
      저장한다.

**자료형(Data Type)**
```
	- 기본 자료형(primitive DataType)
	- 논리형 : boolean(1byte 단위로 저장)
	- 문자형: char(2byte 유니코드 기반 : 0~65535)

	- 정수형: byte(1byte 메모리 공간 할당: -128 ~ 127)
			  short(2byte : -32768 ~ 32767)
			  int(4byte: -2147483648 ~ 2147483647) *기본
			  long(8byte: +=900경)

	- 실수형: float(4byte) 
			  double(8byte) *기본

*리터럴을 컴파일러가 int 타입으로 처음에 인식을 해주는데 byte, short는 표현범위 값 안이면 선언한 타입 그대로 인식해줌
	- 데이터가 손실될 우려가 없기 때문이다.

참조 자료형(Reference DataType) - 개발자가 직접 정의한 데이터 타입
	- 클래스
	- 인터페이스
	- 배열
```

</details>

<details>

<summary> ✏ 06/10 </summary>
<div markdown="1">

**변수 이름 작성 유의사항**
1) 숫자로 시작 불가

2) 특수문자는 $, _ 만 사용가능

- $만 사용가능하지만, _만 사용 불가

3) 자바에서 사용하는 예약어 사용 불가

**실수-오차없이 계산**
``` JAVA
System.out.println(2 - 1.1); //0.9가 나와야 하는데 오차가 발생(0.8999999999999999)
		
//정확한 연산 가능
BigDecimal bd1 = new BigDecimal("2");
BigDecimal bd2 = new BigDecimal("1.1");
System.out.println(bd1.subtract(bd2));
```

**연산자**
- 산술 연산자
- 관계 연산자
- 논리 연산자
    - AND, OR, NOT, XOR
- 증감 연산자
- 복합대입 연산자 = 대입 연산자
- 삼항 연산자

**논리 연산자로 논리 연산을 수행하는 것과 비트 연산자로 논리 연산을 수행하는 것의 차이**
- `쇼트 서킷`
    - 연산을 수행하는 과정에서 결과가 이미 확정됐을 때 나머지 연산 과정을 생략하는 것
- 논리 연산자로 논리 연산을 수행할 때는 쇼트 서킷이 적용
- 비트 연산자로 논리 연산을 수행하면 쇼트 서킷이 적용되지 않는다.

**형변환**
![image](https://github.com/Yang-soeun/Yang-soeun/assets/87464750/6107f907-f3dd-4071-b6eb-d6575f6144dd)
- 자바에서는 대입 연산자를 기준으로 양쪽 자료형이 일치해야 한다.
- 크기가 작은 자료형을 큰 자료형에 대입하면 컴파일러가 자동 타입 변환을 수행
    - long = int → long = long 형태로 변환
- 자료형의 크기 `byte < short < char < int < long < float < double`

**기본 자료형 간의 연산**
- CPU에서 최소 연산 단위가 int 이므로 int보다 작은 자료형도 일단 int로 읽어와서 연산을 수행
- int보다 작은 자료형 간의 연산 결과는 int가 나온다.

**제어문**

1. 조건문

> if ~ else
>
> switch ~ case
> 

1. 반복문

> for
>
> while
>
>do ~ while
>
 
1. 기타

> continue
>
> break
>
> return
>

</details>

<details>

<summary> ✏ 06/11 </summary>
<div markdown="1">
  
**향상된 switch case 문**
``` JAVA
//자바 14버전부터 사용가능
String str = switch(a) {
case 1, 3 -> "남자";
case 2, 4 -> "여자";
default -> "에러";
}; //마지막 세미콜론 필요함
```

**레이블을 이용해 이중 for문 한번에 탈출하기**

- break 다음에 레이블을 지정하면 한 번에 여러 개의 다중 반복문 탈출
  
``` JAVA
  POS1: //레이블 위치 지정(break 하고자 하는 반목문 앞에 레이블 표기)
	for(int i = 0; i<5; i++) {
		for(int j = 0; j< 5; j++) {
		if(j == 2) {
		break POS1; //레이블이 달린 반복문 탈출
		}
		System.out.println(i + ", " + j);
		}
	} //break out으로 탈출하는 중괄호
	System.out.println();
 ```
  
**기본 자료형**
- 기본 자료형은 스택 메모리에 실제 데이터 값을 저장
- 복사하면 실제 데이터 값을 복사
- 복사된 값을 변경해도 원본값은 아무런 영향을 받지 않는다.

**참조 자료형**
- 스택 메모리가 아닌 힙 메모리에 저장된 객체의 위치를 저장
- 변수를 복사하면 실제 데이터가 복사되는 것이 아니라 실제 데이터의 위치값이 복사
- 수정하면 참조 변수가 가리키는 데이터도 변하게 된다.

**배열이란?**
- 동일한 자료형을 묶어 저장하는 참조 자료형
- 생성할 때 크기를 지정해야 하고 한 번 크기를 지정하면 절대 변경할 수 없다.

**힙 메모리에 배열의 객체 생성하기**
- 모든 참조 자료형의 실제 데이터(객체)는 힙 메모리에 생성된다. 힙 메모리에 객체를 생성하기 위해서는 `new 키워드`를 사용해야 한다.

**객체의 위치를 참조 변수에 저장하는 이유**
- new 키워드를 이용해 객체를 생성하면 자바 가상 머신은 힙 메모리 내에 비어 있는 공간에 객체를 생성한다.
- 힙 메모리에 비어 있는 공간은 그때그때 다를 것이므로 객체가 생성 될 때마다 다른 위치에 저장될 수 있다.
- 따라서 자바 가상 머신이 생성한 객체의 위치를 반드시 알아야 개발자가 해당 객체를 사용할 수 있다.

**힙 메모리에서의 강제 초깃값**
- 힙 메모리는 모든 공간에 값이 들어가 있어야 하며 `초기화를 하지 않았을 때 자바 가상 머신이 강제 초기화`한다.
  
|  기본/참조    | 자료횽                | 기본 값|
|:----------------:|:-------------------------------:| :-------------------------------:|
|기본| boolean| false|
||정수(byte, short/char, int, long)| 0|
||실수(float, double)|0.0|
|참조|클래스, 배열|null|


**String 클래스의 특징**

한번 정의된 문자열은 변경할 수 없다

- 내용을 변경하면 문자열을 수정하는 것이 아니라 새로운 문자열을 포함하고 있는 객체를 생성해 기존 객체는 버린다.

- 문자열 리터럴을 바로 입력해 객체를 생성할 때 같은 문자열끼리 객체를 공유 → 메모리 효율성 때문 ex) String str = “HELLO”;

</details>

<details>

<summary> ✏ 06/25 </summary>
<div markdown="1">

![https://blog.kakaocdn.net/dn/cHhmbr/btqwUDHGMOV/usCxTFLWrG0iSkJzqdK8WK/img.png](https://blog.kakaocdn.net/dn/cHhmbr/btqwUDHGMOV/usCxTFLWrG0iSkJzqdK8WK/img.png)

**Map<K, V>**

- Key와 Value 한 쌍(엔트리)으로 데이터를 저장
-` Key는 중복 저장 불가, Value는 중복 가능`
    - 데이터를 구분하는 기준이 Key이기 때문에 동일한 Key가 2개 이상이라면 map.get(중복키)와 같이 실행할 때 어떤 값을 가져올지 결정할 수 없다.

**Map<K, V> 인터페이스의 주요 메서드**

| 구분 | 리턴 타입 | 메서드 명 | 기능 |
| --- | --- | --- | --- |
| 데이터 추가 | V | put(K key, V value) | 입력 매개변수의 (Key, Value)를 Map 객체에 추가 |
| 데이터 변경 | V | replace(K key, V Value) | Key에 해당하는 값을 value 값으로 변경(단, 해당 key가 없으면 null 리턴) |
|  | boolean | replace(K keym V oldValue, V newValue) | (Key, oldValue) 의 쌍을 갖는 엔트리에서 oldValue를 newValue로 변경(단, 해당 엔트리가 없으면 false 반환) |
| 데이터 정보 추출 | V | get(Object key) | 매개변수의 Key값에 해당하는 oldValue를 리턴 |
|  | boolean | containsKey(Object key) | 매개변수의 Key 값이 포함돼 있는지 여부 |
|  | boolean | containsValue(Object value) | 매개변수의 value 값이 포함돼 있는지 여부 |
|  | Set<K> | KeySet() | Map 데이터들 중 Key들만 뽑아 Set 객체로 리턴 |
|  |  Set<Entry<K, V>> | entrySet() | Map의 각 엔트리들을 Set 객체로 담아 리턴 |
|  | int | size() | Map에 포함된 엔트리의 개수 |
| 데이터 삭제 | V | remove(Object key) | 입력매개변수의 Key를 갖는 엔트리 삭제(단, 해당 Key가 없으면 아무런 동작을 하지 않음) |
|  | boolean | remove(Object key, Object value) | 입력매개변수의(key, value)를 갖는 엔트리 삭제(단, 해당 엔트리가 없으면 아무런 동작을 하지 않음) |
|  | void | clear() | Map 객체 내의 모든 데이터 삭제 |

**HashMap<K, V>**

-`key 값의 중복을 허용하지 않는다.`
    - Key값의 중복 여부를 확인하는 메커니즘은 HashSet<E> 때와 완벽히 동일
        - 두 key의 객체의 hashCode() 값이 같고, equals() 메서드가 true를 리턴하면 같은 객체로 인식
- key 값을 HashSet<E>로 구현한 Map<K, V> 객체
- Key 값이 HashSet<E>의 특성이 있으므로 입출력 순서는 동일하지 않을 수 있다.

**Hashtable<K, V>**

- HashMap<K, V> 구현 클래스가 `단일 쓰레드`에 적합한 반면, Hashtable은 `멀티 쓰레드`에  안정성을 가진다.
- 접근할 때도 모든 내부의 주요 메서드가 동기화 메서드로 구현돼 있으므로 멀티 쓰레드에서도 안전하게 동작한다.
- 멀티 쓰레드에도 안전하다는 특징 말고는 완벽히 HashMap<K, V>와 동일한 특징을 가진다.

**LinkedHashMap<K, V>**

- LinkedListHashMap<K, V>는 HashMap<K, V>의 기본적인 특성에 `입력 데이터의 순서 정보를 추가`로 갖고 있는 컬렉션이다.
- 항상 입력된 순서대로 출력된다.

**TreeMap<K, V>**

- Map<K, V>의 기본 기능에 `정렬 및 검색 기능`이 추가된 컬렉션
- 입력 순서와 관계없이 데이터를 Key값의 크기 순으로 저장
- Key 객체는 `크기 비교의 기준`을 갖고 있어야 한다.
- SortedMap<K, V> 와 NavigableMap<K, V> 인터페이스의 자식 클래스다.

**Stack<E>**

- 컬렉션 중 유일하게 클래스이므로 자체적으로 객체를 생성할 수 있다.
- `LIFO` 자료구조
- Vector<E>의 모든 기능을 포함하고 있으며, 추가로 LIFO를 위한 5개의 메서드가 추가됐다
    - 추가된 기능을 사용하려면 Stack<E> 타입으로 선언해야한다.
    

**Stack 클래스의 주요 메서드**

| 구분 | 리턴 타입 | 메서드 명 | 기능 |
| ---- | --- | --- | --- |
| 데이터 추가 | E | push(E item) | 매개변수인 item을 Stack<E>에 추가 |
| 데이터  확인 | E | peek() | 가장 상위에 있는 원소값 리턴(데이터 변화 없음) |
| 데이터 위치 검색 | int | search(Object o) | Stack<E> 원소의 위칫값을 리턴(맨 위의 값이 1, 아래로 내려갈수록 1 증가) |
| 데이터 추출 | E | pop() | 최상위 데이터 꺼내기(데이터의 개수 감소) |
| empty 여부 검사 | boolean | empty() | Stack<E> 객체가 비어 있는지 여부를 리턴 |

**Queue<E>**

- LinkedList<E> 가 Queue<E> 인터페이스의 구현 클래스
- `FIFO` 자료구조
- 입력 순서와 출력 순서가 동일

**Queue<E>의 주요 메서드**

| 구분 | 메서드 | 리턴 타입 | 메서드 명 | 기능 |
| --- | --- | --- | --- | --- |
| 예외 처리 기능 미포함 메서드 | 데이터 추가 | boolean | add(E item) | 매개변수 item 을 Queue에 추가 |
|  | 데이터 확인 | E | element() | 가장 상위에 있는 원소값 리턴(데이터가 없는 경우 NoSuchElementException 발생) |
|  | 데이터 추출 | E | remove() | 가장 상위에 있는 원소값을 꺼내기(데이터가 없는 경우 NoSuchElementException 발생) |
| 예외 처리 기능 포함 메서드 | 데이터 추가 | boolean | offer(E item) | 매개변수인 item을 Queue에 추가 |
|  | 데이터 확인 | E | peek() | 가장 상위에 있는 원소값 리턴(데이터가 하나도 없을 때 null 리턴) |
|  | 데이터 추출 | E | poll() | 가장 상위에 있는 원소값을 꺼내기(데이터가 없을 때 null 리턴) |
- 6개의 메서드 중 add() 메서드만 java.util.Collection 인터페이스에 정의돼  있고, 나머지는 모두 java.util.Queue 인터페이스에 정의돼 있다.

**Lambda**

람다가 나온 이유?

- 자바는 객체지향형 프로그래밍에서 함수는 항상 클래스 내부에 메서드로 존재해야 하고, 메서드를 사용하기 위해서는 클래스의 객체를 먼저 생성한 후에 메서드를 호출해야 한다.
- 하지만 이는 외부에 어떤 기능을 가진 함수를 정의하고, 이 함수를 호출함으로써 기능을 수행하는 본래의 함수형 프로그래밍과는 거리가 있다.
- 이를 해결하기 위해 나온 방법이 람다식이다.

**객체 지향 구조 내에서 람다식 적용**

함수형 인터페이스 → 단 하나의 추상 메서드만을 포함하는 인터페이스

```java
@FunctionalInterface //메서드가 2개 이상 만들면 에러 발생시켜줌 
public interface A {
	void abc();
}
```

```java
public class OOPvsFP {
	public static void main(String[] args) {
		//객체지향 프로그래밍 문법
		A a1 = new B();
		a1.abc();
		
		// 객체지향 프로그래밍 문법(익명 이너 클래스 사용)
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("메서드 내용 2");
			}
		};
		
		//함수형 프로그래밍 문법(람다식)
		a2.abc();
		// 타겟타입은 함수형 인터페이스만이 타겟 타입이 될 수 있다.
		A a3 = () -> {System.out.println("메서드 내용 3");};
		a3.abc();
	}
}
```

- 람다식은 익명 이너 클래스의 축약된 형태이다.
- 람다식은 내부 메서드 명을 생략하므로 구현해야 할 추상 메서드가 2개 이상이라면 어떤 메서드를 구현할 것인지 구분할 수 없기 때문에 1개의 메서드만 정의된 함수형 인터페이스만이 타겟 타입이 될 수 있다.

**람다식의 기본 문법 및 약식 표현**

- 구현된 추상 메서드를 람다식으로 표현할 때는 메서드명 이후의 소괄호와 중괄호만 차례대로 포함하며, 이들 사이에는 람다식 기호인 화살표 → 가 들어간다.
- 메서드를 람다식으로 표현할 때는 `(소괄호) → {중괄호} `의 형태만 기억하자
- **람다식의 약식 표현**

```java
**1. 중괄호 안의 실행문이 1개일 때 중괄호 생략 가능**
A a1 = () -> {System.out.println("테스트");};
A a2 = () -> System.out.println("테스트");
```

```java
**2. 매개변수 타입의 생략이 가능하고, 매개변수가 1개일 때 () 생략 가능**
A a1 = (int a) - > {...}
A a2 = (a) -> {....}
A a3 = a -> {....} //소괄호가 생략될 때는 매개 변수 타입을 반드시 생략
```

```java
**3. return문 하나만으로 이뤄져 있을 떄는 return도 생략 가능**
A a1 = (int a, int b) -> {return a + b};
A a2 = (int a, int b) -> a + b; //return을 생략할 때는 반드시 중괄호도 생략해야함
```

**메서드 참조**

- 이미 구현을 완료된 메서드 참조
    - 인스턴스 메소드 참조
    - 정적 메소드 참조

**정의 돼 있는 인스턴스 메서드 참조**

> 클래스 객체 참조 변수 :: 인스턴스 메서드명
> 

**정의돼 있는 정적 메서드 참조**

> 클래스명 :: 정적 메서드명
> 

**첫번째 매개변수로 전달된 객체의 인스턴스 메서드 참조**

> 클래스명 :: 인스턴스 메서드명
> 

```java
interface A{
	void abc(B b, int k);
}
class B{
	void bcd(int k){
		System.out.println(k);
	}
}

//인터페이스 A의 abc메소드를 호출하는 것은 첫번째 인자로 받는 B의 bcd를 호출하는 것과 같다.
//람다식
A a = (b, k){
	b.bcd(k);
};
```

**생성자 참조 == new 참조**

- 배열 객체 생성자
    - 함수형 인터페이스에 포함된 추상 메서드가 배열의 크기를 입력매개변수로 하며, 특정 배열 타입을 리턴할

> 배열 타입 :: new
A a = (len) → new int[len]; //람다식
A a = int[]::new
> 
- 클래스 객체 생성자
    - 인터페이스의 추상 메서드가 클래스 타입의 객체를 리턴할 때

> 클래스명 :: new
A a () → new B(); //람다식
A a = B :: new();
> 

</details>
