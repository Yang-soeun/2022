package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//문제: 연결 요소의 개수
//문제 설명: 방향없는 그래프가 주어졌을때, 연결요소의 개수를 구하는 프로그램을 작성.

public class DFS_11724 {
    static int N;
    static int M;
    static int[][] array;
    static ArrayList<Integer> vertex;

    public static void visited(int i){
        vertex.remove(Integer.valueOf(i));

        for(int j = 1; j<=N; j++)
            if((array[i-1][j-1] == 1) && (vertex.remove(Integer.valueOf(j)) == true))
                visited(j);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int count = 0;
        N = Integer.parseInt(st.nextToken());//정점의 개수
        M = Integer.parseInt(st.nextToken());//간선의 개수

        array = new int[N][N];
        vertex = new ArrayList<Integer>();

        for(int i =1; i<=N; i++)
            vertex.add(i);

        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            //간선의 양 끝점 u, v
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            array[u-1][v-1] = 1;
            array[v-1][u-1] = 1;
        }

        for(int i = 1; i<=N; i++){
            if(vertex.remove(Integer.valueOf(i)) == true){//방문한적이 없다면
                visited(i);
                count++;
            }
        }

        System.out.println(count);
    }
}
