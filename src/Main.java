import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    static int N, M, max;
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visited;
    static TreeMap<Integer, Integer> result = new TreeMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        adj = new ArrayList<>();
        for (int i = 0; i < N + 1; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            adj.get(start).add(end);
        }


        visited = new boolean[N + 1];
        for (int i = 1; i <= N; i++) {
            visited[i] = true;
            dfs(i, 0);
            visited[i] = false;
        }


        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.printf("%d, %d\n", entry.getKey(), entry.getValue());
            if (entry.getValue() == max) {
                sb.append(entry.getKey()).append(" ");
            }
        }

        System.out.println(sb);
    }

    private static void dfs(int index, int count) {
        max = Math.max(max, count);
        result.put(index, count);

        for (Integer next : adj.get(index)) {
            if (visited[next]) continue;
            visited[next] = true;
            dfs(next, count + 1);
        }

        visited[index] = false;
    }
}
/**
 * 12 13
 * 2 1
 * 3 2
 * 4 3
 * 5 4
 * 1 5
 * 6 5
 * 7 6
 * 8 7
 * 9 8
 * 5 9
 * 10 9
 * 11 10
 * 12 11
 * answer: 1 2 3 4 5 6 7 8 9
 */