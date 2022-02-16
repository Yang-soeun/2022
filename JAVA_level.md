# 📖 JAVA_Solution

<details>

<summary>📗 level_1 </summary>
<div markdown="1">
 
## ✏ Solution_1
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

#### copyOfRange() 메소드 사용 전
##### Source_Code
- [solution1_level1](java_solution/solution1_level1/src/solution1_level1/Solution1_level1.java)
                                 
#### ⭐ copyOfRange() 메소드 사용 후
##### Source_Code
- [solution1_af_level1](java_solution/solution1_af_level1/src/solution1_af_level1/Solution1_af_level1.java)
         
## ✏ Solution_2
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
#### before
##### Source_code
- [solution2_level1](java_solution/solution2_level1/src/solution2_level1/Solution2_level1.java)
 
#### ⭐ after
##### Source_code
- [solution2_af_level1](java_solution/solution2_af_level1/src/solution2_af_level1/Solution2_af_level2.java)
 
## ✏ Solution_3
#### ⭐ Source_code
- [solution3_level1](java_solution/solution3_level1/src/solution3_level1/Solution3_level1.java)
	
## ✏ Solution_4
	
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

## 📑 가장 큰 수
	
- 문제 설명
	- 0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수 작성
> ex) [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고 가장 큰 수는 6210이다.

✔ 제한 사항
- numbers의 길이는 1이상 100,000 이하이다.
- numbers의 원소는 0이상 1,000 이하이다.
- 정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.</br>

- 입출력 예
	
| numbers | return |    
| :---: | :----: |    
| [6, 10, 2] | "6210" |    
| [3, 30, 34, 5, 9] | "9534330" |
	
##### 실패
- 숫자들을 자리수에 따라 정렬한 후 리스트에 각각 저장해서 3개의 리스트들을 비교하여 하나의 리스트에 내림차순으로 넣으려고 시도.
- 1~1000이하의 숫자들은 가능하지 그 이상의 숫자들로 이루어진 배열은 구현 실패
- [Source_code](java_solution/solution1_level2/src/solution1_level2/Solution1_level2.java)
	
##### ⭐compareTo() 사용 후
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
