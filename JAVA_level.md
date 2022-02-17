# 📖 JAVA_Solution

<details>

<summary>📗 level_1 </summary>
<div markdown="1">
 
## ✏ Solution_1_정렬
### java.util.Arrays 클래스
  
- Arrays 클래스에는 배열을 다루기 위한 다양한 메소드가 포함되어 있습니다.
- Arrays 클래스의 모든 메소드는 클래스 메소드(static method)이므로, 객체를 생성하지 않고도 바로 사용할 수 있습니다.
- 이 클래스는 java.util 패키지에 포함되므로, 반드시 import 문으로 java.util 패키지를 불러오고 나서 사용해야 합니다.
  
 #### copyOfRange() 메소드
 - copyOfRange() 메소드는 전달받은 배열의 특정 범위에 해당하는 요소만을 새로운 배열로 복사하여 반환.
 - 첫 번째 매개변수로 복사의 대상이 될 원본 배열을 전달 받음.
 - 두번째 매개변수로는 원본 배열에서 복사할 시작 인덱스를 전달받음.
 - 세번째 매개변수로는 마지막으로 복사될 배열 요소의 바로 다음 인덱스를 전달받음.
 - 그리고 원본 배열과 같은 타입의 복사된 새로운 배열을 반환.
  
 ``` JAVA
 int[] array1 = {1, 2, 3, 4, 5};
  
 int[] array2 = Arrays.copyOfRange(array1, 2, 4);
 for(int i = 0; i< array2.lenght; i++){
  System.out.print(array2[i] + " ");
 }                       
 ```
### 배열을 출력하는 2가지 방법
##### 먼저, 그냥 배열을 출력한다면?
                                 
``` JAVA
public class PrintArray{
  public static void main(String[] args){
    int[] array = {1, 2, 3, 4, 5};
    System.out.println(array);
  }
}
```
[결과] 메모리의 주소값이 출력된다.

#### 1. 반복문(for) 사용하기

``` JAVA
public class PrintArray{
  public static void main(String[] args){
    int[] array = {1, 2, 3, 4, 5};
                                 
    for(int i = 0; arr.length; i++){
      System.out.println(array[i]);                             
    }
  }
}
```                                 
[결과]
1
2
3
4
5
                                 
#### 2. Java.util.Arrays의 toString() 메소드 사용하기
                                 
- 파라미터로 배열을 입력받아 배열에 정의된 값들을 문자열 형태로 만들어서 리턴
                                 
``` JAVA
public class PrintArray{
  public static void main(String[] args){
    int[] array = {1, 2, 3, 4, 5};
                                 
    System.out.println(Arrays.toString(array));                                                        
    }
  }
}
``` 
[결과]
[1, 2, 3, 4, 5] 
				 
## 📑 Q. K번째 수
- 문제 설명
	- 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성.
> ex) array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3 이라면 </br> 1. array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]이다. </br> 2. 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]이다. </br> 3. 2에서 나온 배열의 3번째 숫자는 5이다.

✔ 제한사항
- array의 길이는 1이상 100 이하이다.
- array의 각 원소는 1 이상 100 이하이다.
- commands의 길이는 1 이상 50 이하이다.
- commands의 각 원소는 길이가 3이다.

💡 입출력 예

| array | commands |return|    
| :---: | :----: | :----: |    
| [1, 5, 2, 6, 3, 7, 4] | [[2, 5, 3], [4, 4, 1], [1, 7, 3]] | [5, 6, 3] | 
		 	
### 📚 Source_code
#### copyOfRange() 메소드 사용 전
- [solution1_level1](java_solution/solution1_level1/src/solution1_level1/Solution1_level1.java)
                                 
#### ⭐ copyOfRange() 메소드 사용 후
- [solution1_af_level1](java_solution/solution1_af_level1/src/solution1_af_level1/Solution1_af_level1.java)
         
## ✏ Solution_2_완전탐색
### java.lang.Math 클래스
- 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해 놓은 클래스.
- 모든 메소드는 클래스 메소드(static method)이므로, 객체를 생성하지 않고도 바로 사용할 수 있다.

#### max(), min()
- max(): 전달된 두 값을 비교하여 그 중에서 큰 값을 반환
- min(): 전달된 두 값을 비교하여 그 중에서 작은 값을 반환
- 사용법
``` JAVA
int max = Math.max(3.14, 3.1415);
int min = Math.min(3.14, 3.1415);
```
### List 컬렉션 클래스
- 특징
  - 요소의 저장 순서가 유지된다.
  - 같은 요소의 중복 저장을 허용한다.
                                 
- 대표적인 List 컬렉션 클래스에 속하는 클래스
  - ArrayList< E >
  - LinkedList< E >
  - Vector< E >
  - Stack< E >

#### ArrayList< E > 클래스
 
- 배열을 이용하기 때문에 인데스를 이용하여 배열 요소에 빠르게 접근할 수 있다.
- 배열은 크기를 변경할 수 없는 인스턴스이므로, 크기를 늘리기 위해서는 새로운 배열을 생성하고 기존의 요소들을 옮겨야 하는 복잡한 과정을 거쳐야 한다.
  - 자동으로 수행, 요소의 추가 및 삭제 작업에 걸리는 시간이 매우 길다.

``` JAVA
ArrayList<Integer> list = new ArrayList<Integer>();
 
// 저장
list.add(40);
list.add(30)
// 제거
list.remove(1);
// Collections.sort() 메소드를 이용한 정렬
Collections.sort(list);
//set() 메소드를 이용한 변경
list.set(0, 10);
```
#### Enhanced for문
- for(초기화 : 배열){//}
- 배열의 크기를 조사할 필요가 없다.
- 배열에서만 사용 가능하고, 배열의 값을 변경하지 못하는 단점이 있다.

``` JAVA
// Enhanced for문을 이용한 list 출력
int c = 0;
		
for(int num : list){
	answer[c++] = num;
	}
```

## 📑 Q. 모의고사
- 문제설명
	- 수포자들은 1번 문제부터 마지막 문제까지 다음과 같이 찍는다.
> 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ... </br> 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 3, 5, ... </br> 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

-  1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배엵에 담아 return 하도록 solution 함수 작성.

✔ 제한 사항
- 시험은 최대 10,000 문제로 구성되어있다.
- 문제의 정답은 1, 2, 3, 4, 5 중 하나이다.
- 가장 높은 점수를 받은 사람이 여럿일 경우, return 하는 값을 정렬.

💡 입출력 예

| answers | return |  
| :---: | :----: |   
| [1, 2, 3, 4, 5] | [1] | 
| [1, 3, 2, 4, 2] | [1, 2, 3] | 

### 📚 Source_code
#### before
- [solution2_level1](java_solution/solution2_level1/src/solution2_level1/Solution2_level1.java)
 
#### ⭐ after
- [solution2_af_level1](java_solution/solution2_af_level1/src/solution2_af_level1/Solution2_af_level2.java)
 
## ✏ Solution_3_탐욕법
## 📑 Q. 체육복
- 문제설명
	- 전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수 작성

✔ 제한 사항
- 전체 학생의 수는 2명 이상 30명 이하이다.
- 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없다.
- 여별의 체육복을 가져온 학생의 수는 1명이상 n명 이하이고 중복되는 번호는 없다.
- 여별 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있다.
- 여벌 체육복을 가져온 학생이 체육복을 도난당했을때, 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없다.
- 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있다.

💡 입출력 예
| n | lost | reserve | return |  
| :---: | :----: | :----: | :----: |   
| 5 | [2, 4] | [1, 2, 5] | 5 |
| 5 | [2, 4] | [3] | 4 |
| 3 | [3] | [1] | 2 |

### 📚 Source_code
#### ⭐ Source_code
- [solution3_level1](java_solution/solution3_level1/src/solution3_level1/Solution3_level1.java)
	
## ✏ Solution_4_해시
### HashMap<K, V>
- 키(key)와 값(value)의 쌍으로 구성되는 요소를 다루는 컬렉션
- 삽입 및 검색이 빠른 특징
	- 요소 검색: get() 메소드
	- 요소 삽입: put() 메소드
	- 
- HashMap<String, String> 생성, 요소 삽입, 요소 검색

```
HashMap<String, String> h = new HashMap<String, String>();
h.put("apple", "사과");//해시맵에 삽입
String kor = h.get("apple");// 키로 값 검색
```

- 주요 메소드
 
| 메소드 | 설명 | 
| :---: | :----: |  
| void clear() | HashMap의 모든 키 삭제 | 
| boolean containsKey(Object key) | 키를 포함하고 있으면 true 리턴 | 
| boolean containsValue(Object value) | 하나 이상의 키를 지정된 값에 매핑시킬 수 있으면 true 반환 | 
| V get(Object key) | [지정된 케이 매핑되는 값을 리턴하거나 매핑되는 값이 없으면 null 리턴 | 
| boolean isEmpty() | HashMap이 비어 있으면 true 리턴 | 
| set<k> ketSet() | HashMap에 있는 모든 키를 담은 Set<k> 컬렉션 리턴| 
| V put(K key, V value) | key와 value를 매핑하여 HashMap에 저장 |
| V remove(Object key) | 지정된 키와 이에 매핑된 모든 값들을 HashMap에서 삭제 | 
| int size() | HashMap에 포함된 요소의 개수 리턴 | 

### getOrDefault()
- HashMap의 경우 동일 키 값을 추가할 경우 value의 값이 덮어쓰기가 된다.
- 기존 key 값의 value를 계속 사용하기 위해서 사용할 수 있다.
	
##### 사용방법
` getOrDefault(Object key, V DefaultValue) `
	
- 두개의 매개 변수를 가짐.
- key: 값을 가져와야 하는 요소의 키.
- defalutValue: 지정된 키로 매핑된 값이 없는 경우 반환되는 기본 값.
- 반환값: 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값을 반환.
	
### keySet()
- key의 값만 출력.

## 📑 Q. 완주하지 못한 선수
- 문제 설명
	- 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성.

✔ 제한 사항
- 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하이다.
- completion의 길이는 participant의 길이보다 1 작다.
- 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있다.
- 참가자 중에는 동명잉ㄴ이 있을 수 있다.

💡 입출력 예
| participant | completion | return | 
| :---: | :----: | :----: |  
| ["leo", "kiki", "eden"] | ["eden", "kiki"] | "leo" | 
| ["marina", "josipa", "nikola", "vinko", "filipa"] | ["josipa", "filipa", "marina", "nikola"] | "vinko" | 
| ["mislav", "stanko", "mislav", "ana"] | ["stanko", "ana", "mislav"] | "mislav" |

### 📚 Source_code
#### before
- [Solution4_level1](java_solution/solution4_level1/src/solution4_level1/Solution4_level1.java)
#### ⭐ 해시 사용
- [Solution4_af_level1](java_solution/solution4_af_level1/src/solution4_af_level1/Solution4_af_level1.java)

 </div>
</details>

<details>

<summary> 📙 level_2 </summary>
<div markdown="1">

## ✏ Solution_1
### 람다식 기본 문법
`(매개변수) -> {실행문(명령문)}`
	
### 숫자 -> 문자열
` String.valueOf(숫자)를 사용하여 String 타입으로 변환 가능. `

### compareTo()
- 문자열의 사전 순 값을 비교하여 그에 해당하는 int값을 리턴.
```
a = b일 경우 0
a > b (좌측 값이 큰 경우) 양수
a < b (좌측 값이 작은 경우) 음수
```
##### 오름차순
`(a+b).compareTo(b+a)`
     
##### 내림차순
`(b+a).compareTo(a+b)`
     
### startsWith()
- 비교 대상 문자열이 입력된 문자열 값으로 시작되는지 여부를 확인하고 boolean(true/false) 값으로 리턴.

## 📑 Q. 가장 큰 수
	
- 문제 설명
	- 0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수 작성
> ex) [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고 가장 큰 수는 6210이다.

✔ 제한 사항
- numbers의 길이는 1이상 100,000 이하이다.
- numbers의 원소는 0이상 1,000 이하이다.
- 정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
</br>

💡 입출력 예
	
| numbers | return |    
| :---: | :----: |    
| [6, 10, 2] | "6210" |    
| [3, 30, 34, 5, 9] | "9534330" |

### 📚 Source_code
#### Before	
##### 실패
- 숫자들을 자리수에 따라 정렬한 후 리스트에 각각 저장해서 3개의 리스트들을 비교하여 하나의 리스트에 내림차순으로 넣으려고 시도.
- 1~1000이하의 숫자들은 가능하지 그 이상의 숫자들로 이루어진 배열은 구현 실패
- [Source_code](java_solution/solution1_level2/src/solution1_level2/Solution1_level2.java)
	
#### ⭐compareTo() 사용 후
- [Source_code](java_solution/solution1_af_level2/src/solution1_af_level2/Solution1_af_level2.java)

 </div>
</details>

<details>

<summary> 📕 level_3 </summary>
<div markdown="1">
  
 </div>
</details>

<details>

<summary> 📘 level_4 </summary>
<div markdown="1">
  
 </div>
</details>
