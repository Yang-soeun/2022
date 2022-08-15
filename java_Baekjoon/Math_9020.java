import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Math_9020 {
    public static ArrayList<Integer> prime(int a){

        ArrayList<Integer> array = new ArrayList<>();

        array.add(2);

        for(int i = 2; i<a-2; i++){
            int j = 2;

            while(j<i-1)
            {
                if(i%j == 0)
                    break;
                j++;
            }

            if(j == i-1)
                array.add(i);
        }
        return array;
    }

    public static int[] add(ArrayList<Integer> arr, int a) {
        int[] sol = new int[2];
        Arrays.fill(sol, 0);

        for (int i = 0; i < arr.size(); i++) {
            if(2*arr.get(i) == a){
                sol[0] = arr.get(i);
                sol[1] = arr.get(i);
            }
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == a) {
                    if (sol[0] == 0) {
                        sol[0] = arr.get(i);
                        sol[1] = arr.get(j);
                    } else {
                        if ((sol[1] - sol[0]) >= (j - i)) {
                            sol[0] = arr.get(i);
                            sol[1] = arr.get(j);
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
        int[] sol = new int[2];

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            sol = add(prime(a), a);
            bw.write(sol[0] + " "+ sol[1] +"\n");
        }

        bw.flush();
        bw.close();
    }
}
