package DFS_BFS;

import java.util.Arrays;

public class travel_route {
    public static String[] solution(String[][] tickets){
        String[] answer = new String[(tickets.length) + 1];
        String start = "ICN";
        String next = "ZZZ";//다음 경로를 저장할 변수
        int j = 0, k=0;

        answer[0] = "ICN";

        while(j < tickets.length){
            j++;
            for(int i = 0; i< tickets.length; i++){
                if(tickets[i][0] == start){
                    if(tickets[i][1].compareTo(next) < 0)
                    {
                        next = tickets[i][1];
                        k=i;
                    }
                }
            }

            tickets[k][0] = "True";
            answer[j] = next;
            start = next;
            next = "ZZZ";
        }

        return answer;
    }

    public static void main(String[] args){
        //String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};

        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};

        System.out.println(Arrays.toString(solution(tickets)));
    }
}
