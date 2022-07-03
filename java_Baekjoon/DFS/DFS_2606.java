package DFS;

//문제: 바이러스
//문제설명: 컴퓨터의 수와 네트워크 상에서 서로 연결되어 있는 정보가 주어질 때,
//1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 출력하는 프로그램.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class DFS_2606 {
    static int num;
    static int cnum;
    static int[][] array;
    static ArrayList<Integer> computer;

    public static void visited(int i){
        computer.remove(Integer.valueOf(i));

        for(int j = 1; j<=num; j++)
            if((array[i-1][j-1] == 1) && (computer.remove(Integer.valueOf(j)) == true))
                visited(j);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        num = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        cnum = Integer.parseInt(st.nextToken());

        array = new int[num][num];
        computer = new ArrayList<Integer>();

        for (int i = 1; i <= num; i++)
            computer.add(i);

        int n_computer = 0;//바이러스에 걸린 컴퓨터의 수

        for (int i = 0; i < cnum; i++) {
            st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            array[u - 1][v - 1] = 1;
            array[v - 1][u - 1] = 1;
        }
        visited(1);

        n_computer = num - (computer.size()+1);
        System.out.println(n_computer);
    }
}
