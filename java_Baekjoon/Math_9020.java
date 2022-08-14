package baekjoon;

/*
문제: 골드바흐의 추축
문제설명: 각 테스트 케이스에 대해서 주어진 n의 골드바흐 파티션을 출력
        출력하는 소수는 작은것부터 먼저 출력하며, 공백으로 구분.
 */

import java.io.*;
import java.lang.reflect.Array;
import java.nio.BufferOverflowException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Math_9020 {

    public static ArrayList<Integer> prime(int a){

        ArrayList<Integer> array = new ArrayList<>();

        for(int i = 2; i<a-2; i++){
            for(int j = 2; j<=i-1; j++) {
                if (i % j == 0) {
                    continue;
                }
                array.add(i);
            }
        }

        return array;
    }

    public static int[] add(ArrayList<Integer> arr, int a){
        int[] sol = new int[2];
        Arrays.fill(sol, 0);

        for(int i = 0; i< arr.size(); i++){
            for(int j = i+1; j<=arr.size(); j++){
                if(arr.get(i) + arr.get(j) == a){
                    if(sol[0] == 0){
                        sol[0] = i;
                        sol[1] = j;
                    }
                    else{
                        if ((sol[1] - sol[0]) >= (j - i)){
                            sol[0] = i;
                            sol[1] = j;
                        }
                    }
                }
            }
        }
        return sol;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i< n; i++){
            //ArrayList<Integer> primelist = new ArrayList<>();

            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            //prime(a);
            add(prime(a), a);
            //System.out.println( add(prime(a), a));
        }
    }
}
