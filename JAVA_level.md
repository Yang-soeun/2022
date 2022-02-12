# 📌JAVA_Solution

<details>

<summary> level_1 </summary>
<div markdown="1">
 
## 📝 Solution_1
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
                                 
#### copyOfRange() 메소드 사용 후
##### Source_Code
- [solution1_level1_after](java_solution/solution1_af_level1/src/solution1_af_level1/Solution1_af_level1.java)
         
## 📝 Solution_2
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
		
for(int num : list)
			answer[c++] = num;
```
#### before
##### Source_code
- [solution2_level1]()
 
#### after
##### Source_code
- [solution2_af_level1]()
 
 </div>
</details>

<details>

<summary> level_2 </summary>
<div markdown="1">
  
 </div>
</details>

<details>

<summary> level_3 </summary>
<div markdown="1">
  
 </div>
</details>

<details>

<summary> level_4 </summary>
<div markdown="1">
  
 </div>
</details>
