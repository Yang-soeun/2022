# 📌JAVA_Solution

<details>

<summary> level_1 </summary>
<div markdown="1">
 
## Solution_1
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
