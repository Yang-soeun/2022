import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_9205 {
    static int n,start_x,start_y,des_x,des_y;
    static boolean bfs(List<int []> list)
    {
        Queue<int []> q = new LinkedList<>();
        boolean[] visited = new boolean[n];
        q.add(new int[] {start_x, start_y});
        while(!q.isEmpty()) {
            int[] pos = q.poll();
            int px = pos[0], py = pos[1];
            if(Math.abs(px-des_x)+ Math.abs(py-des_y) <=1000){//페스티벌까지 거리가 1000이하인 경우
                return true;
            }
            //두 지점 사이의 거리가 1000이하인 경우
            for(int i = 0; i<n; i++){
                if(!visited[i])//방문한 노드가 아니라면
                {
                    int next_x = list.get(i)[0], next_y = list.get(i)[1];
                    int distance = Math.abs(px-next_x) + Math.abs(py - next_y);//맨해튼 거리
                    if(distance <= 1000){
                        visited[i] = true;
                        q.add(new int[]{next_x, next_y});
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i<t; i++){
            n = Integer.parseInt(br.readLine());
            List<int []> list = new ArrayList<>();

            for(int j = 0; j<n+2; j++)
            {
                st = new StringTokenizer(br.readLine());

                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                if(j == 0){//상근이제 집 좌표
                    start_x = x;
                    start_y = y;
                }
                else if(j == n+1){//페스티벌 좌표
                    des_x = x;
                    des_y = y;
                }
                else
                    list.add(new int[]{x, y});
            }
            bw.write(bfs(list)? "happy\n" : "sad\n");
        }
        bw.flush();
        bw.close();
    }
}