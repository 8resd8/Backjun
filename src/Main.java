import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static int N, name, minLength;
    static int[][] map, visited;
    static int[] dx = {-1, 1, 0, 0}; // 상 하 좌 우
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 총 노래 수
        int L = Integer.parseInt(st.nextToken()); // 노래의 길이
        int D = Integer.parseInt(st.nextToken()); // D초마다 전화 울림

        int call = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < L + 5; j++) {
                call++;
                continue;
            }
            if (call % D == 0) {
                System.out.println(call);
                return;
            }



        }
        


    }
}